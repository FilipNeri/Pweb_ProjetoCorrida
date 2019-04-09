package br.unisul.pweb.quarta.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.unisul.pweb.quarta.domain.Atleta;
import br.unisul.pweb.quarta.domain.Competicao;
import br.unisul.pweb.quarta.repositories.AtletaRepository;
import br.unisul.pweb.quarta.repositories.CompeticaoRepository;

@Service
public class AtletaService {

	@Autowired
	private AtletaRepository repo;

	@Autowired
	private CompeticaoRepository competicaoRepository;
	
	public Atleta find(Integer id) {
		Optional<Atleta> obj = repo.findById(id);
		return obj.orElse(null);
	}
	
	public List<Atleta> search(String nome, List<Integer> ids) {
		List<Competicao> competicao = competicaoRepository.findAllById(ids);
		return repo.findDistinctByNomeContainingAndCompeticaoIn(nome, competicao);
	}
}
