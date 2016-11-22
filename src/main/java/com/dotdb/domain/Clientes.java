package com.dotdb.domain;

import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name="CLIENTES")
public class Clientes implements Serializable {
	
	@Id  
    @Column(name = "CLI_CODIGO")
	@SequenceGenerator(name="id_sequence",sequenceName="HIB_SEQ")
	@GeneratedValue( strategy=GenerationType.SEQUENCE, generator = "id_sequence")
	private Integer codigo;
	@Column(name="CLI_RAZAO")
	private String nome;
	@Column(name="CLI_FANTASIA", nullable = false)
	private String nomeFantasia;
	
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNomeFantasia() {
		return nomeFantasia;
	}
	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}
	
	
	
	

}
