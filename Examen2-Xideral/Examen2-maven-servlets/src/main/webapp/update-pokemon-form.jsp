<!DOCTYPE html>
<html>

<head>
	<title>Update Student</title>

	<link type="text/css" rel="stylesheet" href="css/style.css">
	<link type="text/css" rel="stylesheet" href="css/add-student-style.css">	
</head>

<body>
	<div id="wrapper">
		<div id="header">
			<h2>FooBar University</h2>
		</div>
	</div>
	
	<div id="container">
		<h3>Update Pokemon</h3>
		
		<form action="PokemonControllerServlet" method="GET">
		
			<input type="hidden" name="command" value="UPDATE" />

			<input type="hidden" name="pokemonId" value="${THE_POKEMON.id}" />
			
			<table>
				<tbody>
					<tr>
						<td><label>Nombre:</label></td>
						<td><input type="text" name="nombre" 
								   value="${THE_POKEMON.nombre}" /></td>
					</tr>

					<tr>
						<td><label>Tipo:</label></td>
						<td><input type="text" name="tipo" 
								   value="${THE_POKEMON.tipo}" /></td>
					</tr>

					<tr>
						<td><label>Ataque:</label></td>
						<td><input type="text" name="ataque" 
								   value="${THE_POKEMON.ataque}" /></td>
					</tr>
					
					<tr>
						<td><label>Evolucion:</label></td>
						<td><input type="text" name="evolucion" 
								   value="${THE_POKEMON.evolucion}" /></td>
					</tr>
					
					<tr>
						<td><label></label></td>
						<td><input type="submit" value="Save" class="save" /></td>
					</tr>
					
				</tbody>
			</table>
		</form>
		
		<div style="clear: both;"></div>
		
		<p>
			<a href="PokemonControllerServlet">Back to List</a>
		</p>
	</div>
</body>

</html>











