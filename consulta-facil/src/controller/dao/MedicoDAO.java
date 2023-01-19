package controller.dao;

import model.Medico;

public interface MedicoDAO {
    void inserir(Medico medico);
    public boolean deletar(Medico medico);
}
