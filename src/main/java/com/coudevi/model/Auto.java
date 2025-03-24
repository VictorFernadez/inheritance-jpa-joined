package com.coudevi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "auto")
public class Auto extends Vehiculo {
	private int numeroPuertas;

	public Auto() {
		super();
	}

	public Auto(String marca, int numeroPuertas) {
		super(marca);
		this.numeroPuertas = numeroPuertas;
	}

	public int getNumeroPuertas() {
		return numeroPuertas;
	}

	public void setNumeroPuertas(int numeroPuertas) {
		this.numeroPuertas = numeroPuertas;
	}
}