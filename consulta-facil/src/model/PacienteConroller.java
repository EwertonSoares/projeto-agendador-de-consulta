package model;

import controller.PacienteDAO;

import java.util.ArrayList;

public class PacienteConroller implements PacienteDAO {
    private ArrayList<Paciente> pacientes;

     public PacienteConroller() {
        this.pacientes = new ArrayList<Paciente>();
    }

    public Paciente getPaciente(int cpf){
        for (Paciente p: this.pacientes) {
            if(p.getCpf() == cpf)
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
    public boolean deletar() {
        return false;
    }
}
