package br.inatel.C214.fila;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Fila {
	public List<Paciente> pacientes;

	public Fila() {
		this.pacientes = new ArrayList<Paciente>();
	}

	public void adicionarPaciente(Paciente p) {
		pacientes.add(p);

		Collections.sort(pacientes, ordenarPorPrioridade);
	}

	public void removePaciente(Paciente p) {
		pacientes.remove(p);
	}

	public boolean estaVazio() {
		return pacientes.isEmpty();
	}
	
	public void atenderPaciente() {
		
	}
	
	public boolean pacienteExiste(Paciente p) {
		return true;
	}

	public static Comparator<Paciente> ordenarPorPrioridade = new Comparator<Paciente>() {
		@Override
		public int compare(Paciente p1, Paciente p2) {
			if (p1.prioridade < p2.prioridade) {
				return 1;
			} else if (p1.prioridade > p2.prioridade) {
				return -1;
			} else {
				return 0;
			}
		}
	};

	public Paciente pacienteComMaiorPrioridade() {
		return null;
	}

	public boolean pacienteFoiAtendido(Paciente p2) {
		// TODO Auto-generated method stub
		return false;
	}
}
