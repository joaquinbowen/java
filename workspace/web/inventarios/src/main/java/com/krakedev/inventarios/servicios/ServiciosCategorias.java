package com.krakedev.inventarios.servicios;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.krakedev.inventarios.bdd.CategoriasBDD;
import com.krakedev.inventarios.entidades.Categoria;
import com.krakedev.inventarios.excepciones.KrakedevException;

@Path("categorias")
public class ServiciosCategorias {

	@Path("crear")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response crear(Categoria categoria){
		CategoriasBDD cat = new CategoriasBDD();
		try {
			cat.crear(categoria);
			return Response.ok().build();
		} catch (KrakedevException e) {
			e.printStackTrace();
			return Response.serverError().build();
		}
	}
	
	@Path("actualizar")
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public Response actualizar(Categoria categoria){
		CategoriasBDD cat = new CategoriasBDD();
		try {
			cat.actualizar(categoria);
			return Response.ok().build();
		} catch (KrakedevException e) {
			e.printStackTrace();
			return Response.serverError().build();
		}
	}
	
	@Path("recuperar")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response recuperar() {
		CategoriasBDD cat = new CategoriasBDD();
		ArrayList<Categoria> cats =null;
		try {
			cats=cat.recuperar();
			return Response.ok(cats).build();
		} catch (KrakedevException e) {
			e.printStackTrace();
			return Response.serverError().build();
			
		}
	}
	
	
}
