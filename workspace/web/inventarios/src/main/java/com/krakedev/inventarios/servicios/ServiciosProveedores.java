package com.krakedev.inventarios.servicios;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.krakedev.inventarios.bdd.ProveedoresBDD;
import com.krakedev.inventarios.entidades.Proveedor;
import com.krakedev.inventarios.excepciones.KrakedevException;


@Path("proveedores")
public class ServiciosProveedores {
	
	@Path("buscarPorNombre/{sub}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response buscarPorNombre(@PathParam("sub")  String subcadena){
		ProveedoresBDD pro = new ProveedoresBDD();
		ArrayList<Proveedor> proveedores=null;
		try {
			proveedores = pro.buscarPorNombre(subcadena);
			return Response.ok(proveedores).build();
		} catch (KrakedevException e) {
			e.printStackTrace();
			return Response.serverError().build();
		}
	}
	
	@Path("buscarPorIdentificador/{sub}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response buscarPorIdentificador(@PathParam("sub")  String subcadena){
		ProveedoresBDD pro = new ProveedoresBDD();
		ArrayList<Proveedor> proveedores=null;
		try {
			proveedores = pro.buscarPorIdentificador(subcadena);
			return Response.ok(proveedores).build();
		} catch (KrakedevException e) {
			e.printStackTrace();
			return Response.serverError().build();
		}
	}
	
	
	@Path("crear")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response crear(Proveedor proveedor){
		ProveedoresBDD pro = new ProveedoresBDD();
		try {
			pro.crear(proveedor);
			return Response.ok().build();
		} catch (KrakedevException e) {
			e.printStackTrace();
			return Response.serverError().build();
		}
	}
	
	
	
	
}
