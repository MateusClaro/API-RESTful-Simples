package com.carros.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
public class Carro {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	private String tipo;
	private String descricao;
	private String urlfoto;
	private String urlvideo;
	private String latitude;
	private String longitude;
	
}
