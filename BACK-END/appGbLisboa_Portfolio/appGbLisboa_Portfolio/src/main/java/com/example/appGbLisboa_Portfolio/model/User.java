package com.example.appGbLisboa_Portfolio.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "user_gblisboa")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//auto-increment do campo id
	@Column(name = "id")
	private Integer id;
	@Column(name = "nome_completo", length = 200 ,nullable = true, unique = true)
	private String nome_completo;
	@Column(name = "email", length = 200 ,nullable = true, unique = true)
	private String email;
	@Column(name = "telefone")
	private String telefone;
	

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome_completo() {
		return nome_completo;
	}
	public void setNome_completo(String nome_completo) {
		this.nome_completo = nome_completo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
}
