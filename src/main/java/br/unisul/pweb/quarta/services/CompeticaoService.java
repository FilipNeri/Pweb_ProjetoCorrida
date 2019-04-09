package br.unisul.pweb.quarta.services;
import java.util.Optional;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.unisul.pweb.quarta.domain.Competicao;
import br.unisul.pweb.quarta.repositories.CompeticaoRepository;



@Service///Spring frame
public class CompeticaoService {
	
	

	@Autowired//Spring frame//Injetar a variavel
	private CompeticaoRepository rep;

	//BUSCAR POR ID
	public Competicao find (Integer id) {
		Optional<Competicao> obj = rep.findById(id);
		return obj.orElse(null);
	}

	//INSERIR
	public Competicao insert (Competicao obj) {
		obj.setId(null);
		return rep.save(obj);
	}

	//ATUALIZAR
	public Competicao update (Competicao obj) {
		find(obj.getId());
		return rep.save(obj);
	}

	//DELETAR
	public void delete (Integer id) {
		find(id);
		rep.deleteById(id);
	}

	//LISTAR TODAS
	public List<Competicao> findAll(){
		return rep.findAll();
	}

}
