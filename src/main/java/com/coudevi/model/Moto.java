package com.coudevi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "moto")
public class Moto extends Vehiculo {
	private int cilindrada;

	public Moto() {
		super();
	}

	public Moto(String marca, int cilindrada) {
		super(marca);
		this.cilindrada = cilindrada;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}
}
