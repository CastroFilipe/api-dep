package com.vibe.desafiovibe.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "CONTADOR", uniqueConstraints = { 
		@UniqueConstraint (columnNames = "ID_CONTADOR", name = "UK_ID_CONTADOR"),
		@UniqueConstraint (columnNames = "ID_DEPUTADO", name = "UK_ID_DEPUTADO")
})
@SequenceGenerator(name = "SEQ_CONTADOR", sequenceName = "SQ_CONTADOR", initialValue = 1, allocationSize = 1)
public class Contador {
	
	@Id
	@Column(name = "ID_CONTADOR")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_CONTADOR")
	private Long id;
	
	@Column(name = "ID_DEPUTADO", nullable = false)
	private Long idDeputado;
	
	@Column(name = "TOTAL_VISITAS", nullable = false)
	private Integer totalVisitas;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getIdDeputado() {
		return idDeputado;
	}

	public void setIdDeputado(Long idDeputado) {
		this.idDeputado = idDeputado;
	}

	public Integer getTotalVisitas() {
		return totalVisitas;
	}

	public void setTotalVisitas(Integer totalVisitas) {
		this.totalVisitas = totalVisitas;
	}
	
}
