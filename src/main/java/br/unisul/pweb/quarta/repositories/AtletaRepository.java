package br.unisul.pweb.quarta.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.unisul.pweb.quarta.domain.Competicao;
import br.unisul.pweb.quarta.domain.Atleta;


@Repository
public interface AtletaRepository extends JpaRepository<Atleta, Integer>{
	
	List<Atleta> findDistinctByNomeContainingAndCompeticaoIn(
			String nome,
			List<Competicao> competicao
	);
	
}