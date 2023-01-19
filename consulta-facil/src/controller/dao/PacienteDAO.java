package controller.dao;

import model.Paciente;

public interface PacienteDAO {

    void inserir(Paciente paciente);

    public void visualizar();

    public boolean deletar();
}
