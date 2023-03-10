package controller;

import controller.dao.GeralDAO;
import controller.dao.PacienteDAO;
import model.Paciente;

import java.util.ArrayList;

public class PacienteConroller implements PacienteDAO, GeralDAO {
    private ArrayList<Paciente> pacientes;

     public PacienteConroller() {
        this.pacientes = new ArrayList<>();
    }

    public Paciente getPaciente(String cpf){
        for (Paciente p: this.pacientes) {
            if(p.getCpf().equals(cpf))
                return   p;
        }
        return null;
    }
    @Override
    public void inserir(Paciente paciente) {
        System.out.println("inserindo paciente: " + paciente.getNome());
        this.pacientes.add(paciente);
        System.out.println("paciente inserido!");

    }

    @Override
    public void visualizar() {
        for (Paciente p: this.pacientes) {
            System.out.println("CPF: "+ p.getCpf() + " Nome: "+ p.getNome());
        }
    }

    @Override
    public boolean deletar(Paciente paciente) {
        return false;
    }
}
