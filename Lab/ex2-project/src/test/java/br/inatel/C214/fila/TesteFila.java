package br.inatel.C214.fila;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TesteFila {

	private Fila fila;

	@Before
	public void init() {
		fila = new Fila();
	}

	@Test
	public void testeInserePaciente() {
		Paciente p1 = new Paciente("Alexander", 1);
		fila.adicionarPaciente(p1);
		
		Paciente p2 = new Paciente("Phyll", 5);
		fila.adicionarPaciente(p2);
		
		Paciente p3 = new Paciente("JP", 3);
		fila.adicionarPaciente(p3);
		
		assertEquals(fila.pacienteComMaiorPrioridade(), p2);
	}

	@Test
	public void testeAtendePaciente() {
		Paciente p1 = new Paciente("Alexander", 1);
		fila.adicionarPaciente(p1);
		
		Paciente p2 = new Paciente("Phyll", 5);
		fila.adicionarPaciente(p2);
		
		Paciente p3 = new Paciente("JP", 3);
		fila.adicionarPaciente(p3);
		
		fila.atenderPaciente();

		boolean pacienteFoiAtendido = fila.pacienteFoiAtendido(p2);
		
		assertTrue(pacienteFoiAtendido);
	}

	@Test
	public void testeFilaVazia() {
		boolean estaVazia = fila.estaVazio();

		assertTrue(estaVazia);
	}
}
