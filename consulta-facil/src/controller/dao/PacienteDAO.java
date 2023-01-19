package controller.dao;

import model.Agenda;
import model.Paciente;

public interface PacienteDAO {

    void inserir(Paciente paciente);

    public void visualizar();

    boolean deletar(Paciente paciente);
}
