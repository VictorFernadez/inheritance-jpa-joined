package com.coudevi.service;

import java.util.List;

import com.coudevi.model.Vehiculo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class VehiculoService {
	private final EntityManagerFactory emf;

	public VehiculoService() {
		this.emf = Persistence.createEntityManagerFactory("herenciaJoinedPU");
	}

	public void crearVehiculo(Vehiculo v) {
		EntityManager em = emf.createEntityManager();
		try {
			em.getTransaction().begin();
			em.persist(v);
			em.getTransaction().commit();
		} finally {
			em.close();
		}
	}

	public List<Vehiculo> obtenerVehiculos() {
		EntityManager em = emf.createEntityManager();
		try {
			return em.createQuery("SELECT v FROM Vehiculo v", Vehiculo.class).getResultList();
		} finally {
			em.close();
		}
	}

	public void cerrar() {
		emf.close();
	}
}
