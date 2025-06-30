package com.krakedev.inventario.servicios;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.krakedev.inventario.entidades.Categoria;
import com.krakedev.inventario.entidades.Producto;

@Path("productos")
public class ServiciosProductos {

	@Path("insertar")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void insertar(Producto producto) {
		System.out.println("Insetando >>>>>>" + producto);
	}

	@Path("actualizar")
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public void actualizar(Producto producto) {
		System.out.println("Actualizando>>>>>>" + producto);
	}

	@Path("consultar")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<Producto> recuperarTodos() {
		ArrayList<Producto> productos = new ArrayList<Producto>();

		productos.add(new Producto("123", "Polaca", new Categoria(4, "Bebida"), 1.25, 70));
		productos.add(new Producto("173", "CaffeLatto", new Categoria(4, "Bebida"), 1.50, 50));
		productos.add(new Producto("654", "Supan", new Categoria(3, "Comida"), 1.75, 120));

		return productos;

	}

}
