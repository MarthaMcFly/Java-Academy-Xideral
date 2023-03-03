<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>

<head>
	<title>Student Tracker App</title>
	
	<link type="text/css" rel="stylesheet" href="css/style.css">
</head>

<body>

	<div id="wrapper">
		<div id="header">
			<h2>Mi Pokedex</h2>
		</div>
	</div>

	<div id="container">
	
		<div id="content">
		
			<!-- put new button: Add Student -->
			
			<input type="button" value="Add Pokemon" 
				   onclick="window.location.href='add-pokemon-form.jsp'; return false;"
				   class="add-pokemon-button"
			/>
			
			<table>
			
				<tr>
					<th>Nombre</th>
					<th>Tipo</th>
					<th>Ataque</th>
					<th>Evolucion</th>
					
				</tr>
				
				<c:forEach var="tempPokemon" items="${POKEMON_LIST}">
					
					<!-- set up a link for each student -->
					<c:url var="tempLink" value="PokemonControllerServlet">
						<c:param name="command" value="LOAD" />
						<c:param name="pokemonId" value="${tempPokemon.id}" />
					</c:url>

					<!--  set up a link to delete a student -->
					<c:url var="deleteLink" value="PokemonControllerServlet">
						<c:param name="command" value="DELETE" />
						<c:param name="pokemonId" value="${tempPokemon.id}" />
					</c:url>
																		
					<tr>
						<td> ${tempPokemon.nombre} </td>
						<td> ${tempPokemon.tipo} </td>
						<td> ${tempPokemon.ataque} </td>
						<td> ${tempPokemon.evolucion} </td>
						<td> 
							<a href="${tempLink}">Update</a> 
							 | 
							<a href="${deleteLink}"
							onclick="if (!(confirm('Estás seguro de que quieres borrar a este pokemon?'))) return false">
							Delete</a>	
						</td>
					</tr>
				
				</c:forEach>
				
			</table>
		
		</div>
	
	</div>
</body>


</html>








