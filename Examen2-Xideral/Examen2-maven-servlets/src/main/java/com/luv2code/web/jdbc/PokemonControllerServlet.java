package com.luv2code.web.jdbc;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

/**
 * Servlet implementation class PokemonControllerServlet
 */
@WebServlet("/PokemonControllerServlet")
public class PokemonControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private PokemonDbUtil pokemonDbUtil;
	
	@Resource(name="jdbc/mis_pokemons")
	private DataSource dataSource;
	
	@Override
	public void init() throws ServletException {
		super.init();
		
		// create our pokemon db util ... and pass in the conn pool / datasource
		try {
			pokemonDbUtil = new PokemonDbUtil(dataSource);
		}
		catch (Exception exc) {
			throw new ServletException(exc);
		}
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		try {
			// read the "command" parameter
			String theCommand = request.getParameter("command");
			
			// if the command is missing, then default to listing pokemons
			if (theCommand == null) {
				theCommand = "LIST";
			}
			
			// route to the appropriate method
			switch (theCommand) {
			
			case "LIST":
				listPokemons(request, response);
				break;
				
			case "ADD":
				addPokemon(request, response);
				break;
				
			case "LOAD":
				loadPokemon(request, response);
				break;
				
			case "UPDATE":
				updatePokemon(request, response);
				break;
			
			case "DELETE":
				deletePokemon(request, response);
				break;
				
			default:
				listPokemons(request, response);
			}
				
		}
		catch (Exception exc) {
			throw new ServletException(exc);
		}
		
	}

	private void deletePokemon(HttpServletRequest request, HttpServletResponse response)
		throws Exception {

		// read pokemon id from form data
		String thePokemonId = request.getParameter("pokemonId");
		
		// delete pokemon from database
		pokemonDbUtil.deletePokemon(thePokemonId);
		
		// send them back to "list pokemons" page
		listPokemons(request, response);
	}

	private void updatePokemon(HttpServletRequest request, HttpServletResponse response)
		throws Exception {

		// read pokemon info from form data
		int id = Integer.parseInt(request.getParameter("pokemonId"));
		String nombre = request.getParameter("nombre");
		String tipo = request.getParameter("tipo");
		String ataque = request.getParameter("ataque");
		String evolucion = request.getParameter("evolucion");
		
		// create a new pokemon object
		Pokemon thePokemon = new Pokemon(id, nombre, tipo, ataque, evolucion);
		
		// perform update on database
		pokemonDbUtil.updatePokemon(thePokemon);
		
		// send them back to the "list pokemons" page
		listPokemons(request, response);
		
	}

	private void loadPokemon(HttpServletRequest request, HttpServletResponse response) 
		throws Exception {

		// read pokemon id from form data
		String thePokemonId = request.getParameter("pokemonId");
		
		// get pokemon from database (db util)
		Pokemon thePokemon = pokemonDbUtil.getPokemon(thePokemonId);
		
		// place pokemon in the request attribute
		request.setAttribute("THE_POKEMON", thePokemon);
		
		// send to jsp page: update-pokemon-form.jsp
		RequestDispatcher dispatcher = 
				request.getRequestDispatcher("/update-pokemon-form.jsp"); //en web-inf
		dispatcher.forward(request, response);		
	}

	private void addPokemon(HttpServletRequest request, HttpServletResponse response) throws Exception {

		// read pokemon info from form data
		String nombre = request.getParameter("nombre");
		String tipo = request.getParameter("tipo");
		String ataque = request.getParameter("ataque");	
		String evolucion = request.getParameter("evolucion");
		
		// create a new pokemon object
		Pokemon thePokemon = new Pokemon(nombre, tipo, ataque, evolucion);
		
		// add the pokemon to the database
		pokemonDbUtil.addPokemon(thePokemon);
				
		// send back to main page (the pokemon list)
		listPokemons(request, response);
	}

	private void listPokemons(HttpServletRequest request, HttpServletResponse response) 
		throws Exception {

		// get students from db util
		List<Pokemon> pokemons = pokemonDbUtil.getPokemons();
		
		// add students to the request
		request.setAttribute("POKEMON_LIST", pokemons);
				
		// send to JSP page (view)
		RequestDispatcher dispatcher = request.getRequestDispatcher("/list-pokemons.jsp");//cambiado en web-inf
		dispatcher.forward(request, response);
	}

}













