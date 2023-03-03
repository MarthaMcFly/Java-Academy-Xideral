<!DOCTYPE html>
<html>

<head>
	<title>Add Pokemon</title>

	<link type="text/css" rel="stylesheet" href="css/style.css">
	<link type="text/css" rel="stylesheet" href="css/add-student-style.css">	
</head>

<body>
	<div id="wrapper">
		<div id="header">
			<h2>Mi Pokedex</h2>
		</div>
	</div>
	
	<div id="container">
		<h3>Add Pokemon</h3>
		
		<form action="PokemonControllerServlet" method="GET">
		
			<input type="hidden" name="command" value="ADD" />
			
			<table>
				<tbody>
					<tr>
						<td><label>Nombre:</label></td>
						<td><input type="text" name="nombre" /></td>
					</tr>

					<tr>
						<td><label>Tipo:</label></td>
						<td><input type="text" name="tipo" /></td>
					</tr>

					<tr>
						<td><label>Ataque:</label></td>
						<td><input type="text" name="ataque" /></td>
					</tr>
					
					<tr>
						<td><label>Evolucion:</label></td>
						<td><input type="text" name="evolucion" /></td>
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











