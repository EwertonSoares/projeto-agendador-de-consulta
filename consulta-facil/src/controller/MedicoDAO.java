package controller;

import model.Medico;

public interface MedicoDAO {

    void inserir(Medico medico);

    public void visualizar();

    public boolean deletar();
}
