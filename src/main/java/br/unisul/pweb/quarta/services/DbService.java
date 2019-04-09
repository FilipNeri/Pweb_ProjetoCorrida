package br.unisul.pweb.quarta.services;

import java.text.ParseException;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.unisul.pweb.quarta.domain.Atleta;
import br.unisul.pweb.quarta.domain.Competicao;
import br.unisul.pweb.quarta.repositories.AtletaRepository;
import br.unisul.pweb.quarta.repositories.CompeticaoRepository;


@Service
public class DbService {

	@Autowired
	private CompeticaoRepository competicaoRepository;

			@Autowired
			private CompeticaoRepository comRep;
			
			
			@Autowired
			private AtletaRepository atlRep;
			
			
	
	public void inicializaBancoDeDados() throws ParseException {
		
		Competicao com1 = new Competicao(null, "Informática","");
		Competicao com2 = new Competicao(null, "Escritório","");
		Competicao com3 = new Competicao(null, "Cama mesa e banho","");
		Competicao com4 = new Competicao(null, "Eletrônicos","");
		Competicao com5 = new Competicao(null, "Jardinagem","");
		Competicao com6 = new Competicao(null, "Decoração","");
		Competicao com7 = new Competicao(null, "Perfumaria","");
		competicaoRepository.saveAll(Arrays.asList(com1, com2, com3, com4, com5, com6, com7));
		
		Atleta a1 = new Atleta(null, "Computador","");
		Atleta a2 = new Atleta(null, "Impressora", "");
		Atleta a3 = new Atleta(null, "Mouse", "");
		
		a1.getCompeticao().addAll(Arrays.asList(com1));
		a2.getCompeticao().addAll(Arrays.asList(com1,com2));
		a3.getCompeticao().addAll(Arrays.asList(com1));
		
		com1.getAtletas().addAll(Arrays.asList(a1,a2,a3));
		com2.getAtletas().addAll(Arrays.asList(a2));
		
		comRep.saveAll(Arrays.asList(com1, com2, com3, com4, com5, com6, com7));
		atlRep.saveAll(Arrays.asList(a1,a2,a3));
		
		
	}

}