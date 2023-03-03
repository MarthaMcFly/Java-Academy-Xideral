/*crear base de datos*/
CREATE DATABASE mis_pokemons;
USE mis_pokemons;

/*crear tabla*/
CREATE TABLE `pokemon` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) DEFAULT NULL,
  `tipo` varchar(45) DEFAULT NULL,
  `ataque` varchar(45) DEFAULT NULL,
  `evolucion` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

/*ingresar datos a la tabla*/
INSERT INTO `mis_pokemons`.`pokemon` (`id`, `nombre`, `tipo`, `ataque`, `evolucion`) VALUES ('1', 'pikachu', 'electrico', 'impactrueno', 'raichu');
INSERT INTO `mis_pokemons`.`pokemon` (`id`, `nombre`, `tipo`, `ataque`, `evolucion`) VALUES ('2', 'charmander', 'fuego', 'bola de fuego', 'charizar');
INSERT INTO `mis_pokemons`.`pokemon` (`id`, `nombre`, `tipo`, `ataque`, `evolucion`) VALUES ('3', 'squirtle', 'agua', 'chorro de agua', 'Wartortle');
INSERT INTO `mis_pokemons`.`pokemon` (`id`, `nombre`, `tipo`, `ataque`, `evolucion`) VALUES ('4', 'bulbasaur', 'hierba', 'latigo', 'ivysaur');


SELECT * FROM pokemon;