package com.coudevi;

import com.coudevi.model.Auto;
import com.coudevi.model.Moto;
import com.coudevi.service.VehiculoService;

public class MainJoined {

	public static void main(String[] args) {
		VehiculoService service = new VehiculoService();

		Auto a1 = new Auto("Toyota", 4);
		Moto m1 = new Moto("Yamaha", 250);

		service.crearVehiculo(a1);
		service.crearVehiculo(m1);

		service.obtenerVehiculos().forEach(v -> {
		    System.out.println("Vehiculo ID: " + v.getId() + " - " + v.getClass().getSimpleName());
		    if (v instanceof Auto) {
		        Auto auto = (Auto) v;
		        System.out.println("  Marca: " + auto.getMarca() + ", Puertas: " + auto.getNumeroPuertas());
		    } else if (v instanceof Moto) {
		        Moto moto = (Moto) v;
		        System.out.println("  Marca: " + moto.getMarca() + ", Cilindrada: " + moto.getCilindrada());
		    }
		});


		service.cerrar();
	}
}