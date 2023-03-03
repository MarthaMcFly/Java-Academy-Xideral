package com.conversor;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ConversorGradosPruebaUnitaria {
	
	//De grados F° a grados C°   Validado
	@Test
	void testConvertirFarenheitACelcius() {
		ConvertirGrados gC = new ConvertirGradosCelsius();
		double resultado = gC.convertir(50, TipoGrado.FARENHEIT);
		assertEquals(10,resultado);
	}
	
	//De grados K° a grados C°   Validado	
	@Test
	void testConvertirKelvinACelcius() {
		ConvertirGrados gC = new ConvertirGradosCelsius();
		double resultado = gC.convertir(280.15, TipoGrado.KELVIN);
		assertEquals(7,resultado);
	}
	
	//De grados C° a grados F°   Validado	
	@Test
	void testConvertirCelciusAFarenheit() {
		ConvertirGrados gC = new ConvertirGradosFarenheit();
		double resultado = gC.convertir(25, TipoGrado.CELCIUS);
		assertEquals(77,resultado);
	}

	//De grados K° a grados F°   Validado	
	@Test
	void testConvertirKelvinAFarenheit() {
		ConvertirGrados gC = new ConvertirGradosFarenheit();
		double resultado = gC.convertir(329, TipoGrado.KELVIN);
		assertEquals(132.53, resultado, .0001);
	}
		
	//De grados C° a grados K°   Validado	
	@Test
	void testConvertirCelciusAKelvin() {
		ConvertirGrados gC = new ConvertirGradosKelvin();
		double resultado = gC.convertir(32, TipoGrado.CELCIUS);
		assertEquals(305.15, resultado, .0001);
	}

	//De grados F° a grados K°   Validado	
	@Test
	void testConvertirFarenheitAKelvin() {
		ConvertirGrados gC = new ConvertirGradosKelvin();
		double resultado = gC.convertir(32, TipoGrado.FARENHEIT);
		assertEquals(273.15, resultado, .0001);
	}

}
