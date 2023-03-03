package com.luv2code.web.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

public class PokemonDbUtil {

	private DataSource dataSource;

	public PokemonDbUtil(DataSource theDataSource) {
		dataSource = theDataSource;
	}
	
	//método getPokemons con try with resource
	public List<Pokemon> getPokemons(){
		
		List<Pokemon> pokemons = new ArrayList<>();
		
		// create sql statement
		String sql = "select * from pokemon order by nombre";
		
		try (Connection myConn = dataSource.getConnection();
				Statement myStmt = myConn.createStatement();
				ResultSet myRs = myStmt.executeQuery(sql)) {
			
			
			// process result set
			while (myRs.next()) {
				
				// retrieve data from result set row
				int id = myRs.getInt("id");
				String nombre = myRs.getString("nombre");
				String tipo = myRs.getString("tipo");
				String ataque = myRs.getString("ataque");
				String evolucion = myRs.getString("evolucion");
				
				// create new pokemon object
				Pokemon tempPokemon = new Pokemon(id, nombre, tipo, ataque, evolucion);
				
				// add it to the list of pokemons
				pokemons.add(tempPokemon);				
			}			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return pokemons;			
	}

	//método addPokemon con bloque try with resources
	
	public void addPokemon(Pokemon thePokemon) throws Exception {
		// create sql for insert
		String sql = "insert into pokemon " + "(nombre, tipo, ataque, evolucion)" + "values(?, ?, ?, ?)";
		
		try(Connection myConn = dataSource.getConnection(); PreparedStatement ps = myConn.prepareStatement(sql)){
			
			// set the param values for the pokemon
			ps.setString(1, thePokemon.getNombre());
			ps.setString(2, thePokemon.getTipo());
			ps.setString(3, thePokemon.getAtaque());
			ps.setString(4, thePokemon.getEvolucion());
			
			// execute sql insert
			ps.execute();
		}
	}

	//método getPokemon con try with resources
	public Pokemon getPokemon(String thePokemonId) throws Exception {
		
		Pokemon thePokemon = null;
		int pokemonId = Integer.parseInt(thePokemonId);
		
		try(Connection myConn = dataSource.getConnection();
				PreparedStatement myStmt = crearStatementGetPokemon(myConn, pokemonId);
				ResultSet myRs = myStmt.executeQuery()) {
			
			// retrieve data from result set row
			if (myRs.next()) {
				String nombre = myRs.getString("nombre");
				String tipo = myRs.getString("tipo");
				String ataque = myRs.getString("ataque");
				String evolucion = myRs.getString("evolucion");
				
				// use the pokemonId during construction
				thePokemon = new Pokemon(pokemonId, nombre, tipo, ataque, evolucion);
			}
			else {
				throw new Exception("Could not find pokemon id: " + pokemonId);
			}				
			
			return thePokemon;
		}
	}

	//método crearStatementGetPokemon que se referencia arriba
	private PreparedStatement crearStatementGetPokemon(Connection myConn, int pokemonId) throws SQLException {
		// create sql to get selected pokemon
		String sql = "select * from pokemon where id=?";
		PreparedStatement ps = myConn.prepareStatement(sql);
		ps.setInt(1, pokemonId);
		return ps;
	}
	
	//método updatePokemon con try with resources
	public void updatePokemon(Pokemon thePokemon) throws Exception {
		// create SQL update statement
					String sql = "update pokemon "
								+ "set nombre=?, tipo=?, ataque=?, evolucion=? "
								+ "where id=?";
	
		try(Connection myConn = dataSource.getConnection();
				 PreparedStatement myStmt = myConn.prepareStatement(sql))  {
			
			// set params
			myStmt.setString(1, thePokemon.getNombre());
			myStmt.setString(2, thePokemon.getTipo());
			myStmt.setString(3, thePokemon.getAtaque());
			myStmt.setString(4, thePokemon.getEvolucion());
			myStmt.setInt(5, thePokemon.getId());
			
			// execute SQL statement
			myStmt.execute();
		}
	}

	//método deletePokemon con try with resources
	public void deletePokemon(String thePokemonId) throws Exception {

		// create sql to delete pokemon
		String sql = "delete from pokemon where id=?";
				
		try(Connection myConn = dataSource.getConnection();
				 PreparedStatement myStmt = myConn.prepareStatement(sql);)  {
			
			// convert student id to int
			int pokemonId = Integer.parseInt(thePokemonId);
			
			// set params
			myStmt.setInt(1, pokemonId);
			
			// execute sql statement
			myStmt.execute();
		}
		
	}
}















