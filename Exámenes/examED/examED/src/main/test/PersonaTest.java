package main.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.DateTimeException;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import main.java.model.Persona;
import main.java.model.PersonaException;

class PersonaTest {

	@Test
	void testValidarDatosVacioNombre() {
		try {
			Persona p = new Persona("","Apellido","11111111F");
			assert(false);
		} catch (PersonaException e) {
			assert(true);
		}
		
	}
	
	@Test
	void testValidarDatosNuloNombre() {
		try {
			Persona p = new Persona(null,"Apellido","11111111F");
			assert(false);
		} catch (PersonaException e) {
			assert(true);
		}
		
	}
	
	
	@Test
	void testValidarDatosVacioApellido() {
		try {
			Persona p = new Persona("Nombre","","11111111F");
			assert(false);
		} catch (PersonaException e) {
			assert(true);
		}
		
	}
	
	@Test
	void testValidarDatosNuloApellido() {
		try {
			Persona p = new Persona("Nombre",null,"11111111F");
			assert(false);
		} catch (PersonaException e) {
			assert(true);
		}
		
	}
	
	@Test
	void testValidarDatosVacioDNI() {
		try {
			Persona p = new Persona("Nombre","Apellido","");
			assert(false);
		} catch (PersonaException e) {
			assert(true);
		}
		
	}
	
	@Test
	void testValidarDatosNuloDNI() {
		try {
			Persona p = new Persona("Nombre","Apellido","");
			assert(false);
		} catch (PersonaException e) {
			assert(true);
		}
		
	}
	
	
	@ValueSource(strings = {"12345678A", "1234A", "1234AA", "123412341"})
	@ParameterizedTest
	void testValidarDatosDNIincorrecto(String cadena) {
		try {
			Persona p = new Persona("Nombre","Apellidos",cadena);
			assert(false);
		} catch (PersonaException e) {
			assert(true);
		}
		
	}
	
	@Test
	void testValidarDatos() {
		try {											//Deberia ser correcto
			Persona p = new Persona("Nombre","Apellido","11111111H");
			assert(true);
		} catch (PersonaException e) {
			assert(false);
		}
		
	}
	

	@Test
	void testValidarDatosPersonaCompleto() {
		try {
			Persona p = new Persona("Nombre","Apellido","11111111H",LocalDate.of(2003, 1, 21), "HOMBRE");
			assert(true);
		} catch (PersonaException e) {
			assert(false);
		}
		
	}
	
	
	@Test
	void testValidarDatosPersonaCompletoFechaPosterior() {
		try {
			Persona p = new Persona("Nombre","Apellido","11111111H",LocalDate.of(2023, 1, 21), "HOMBRE");
			assert(false);
		} catch (PersonaException e) {
			assert(true);
		}
		
	}
	
	
	
	@ValueSource(strings = {"Mujer", "HOMBRE"})
	@ParameterizedTest
	void testValidarDatosPersonaGeneroDistinto(String cadena) {
		try {
			Persona p = new Persona("Nombre","Apellido","11111111H",LocalDate.now(), cadena.toUpperCase());
			assert(true);
		} catch (PersonaException e) {
			assert(false);
		}
		
	}
	
	@Test
	void testbonoJovenDisponible() {
		try {
			Persona p = new Persona();
			p.setFechaNacimiento(LocalDate.of(2003, 1, 21));
			assertTrue(p.bonoJovenDisponible());
		}
		catch (PersonaException e) {
			assert(false);
		}
		
	}
	
	@Test
	void testbonoJovenNoDisponible() {
		try {
			Persona p = new Persona();
			p.setFechaNacimiento(LocalDate.of(2015, 1, 21));
			assertFalse(p.bonoJovenDisponible());
		}
		catch (PersonaException e) {
			assert(false);
		}
		
	}
	
	@Test
	void testbonoJovenNoDisponibleMas30() {
		try {
			Persona p = new Persona();
			p.setFechaNacimiento(LocalDate.of(1980, 1, 21));
			assertFalse(p.bonoJovenDisponible());
		}
		catch (PersonaException e) {
			assert(false);
		}
		
	}
	
	
	@Test
	void testObtenerEdad() {
		try {
			Persona p = new Persona();
			p.setFechaNacimiento(LocalDate.of(2003, 1, 21));
			assertEquals(p.getEdad(), 19);
		}
		catch (PersonaException e) {
			assert(false);
		}
		
	}
	
	
	@ValueSource(ints = {2009,2010,2023})
	@ParameterizedTest
	void testObtenerEdadPara(int numero) {
		Persona p = new Persona();
		p.setFechaNacimiento(LocalDate.of(2003, 1, 21));

		
		assertNotEquals(p.obtenerEdadPara(numero), 19);
	}
	

	
	
}
