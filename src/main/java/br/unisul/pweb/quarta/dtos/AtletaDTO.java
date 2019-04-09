package br.unisul.pweb.quarta.dtos;




	import java.io.Serializable;

import br.unisul.pweb.quarta.domain.Atleta;




	public class AtletaDTO implements Serializable {
		private static final long serialVersionUID = 1L;
		
		private Integer id;
		private String nome;
		private String modalidade;

		public AtletaDTO() {

		}

		public AtletaDTO(Atleta obj) {
			id = obj.getId();
			nome = obj.getNome();
			modalidade = obj.getModalidade();
		}

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getModalidade() {
			return modalidade;
		}

		public void setModalidade(String modalidade) {
			this.modalidade = modalidade;
		}

		

	}



