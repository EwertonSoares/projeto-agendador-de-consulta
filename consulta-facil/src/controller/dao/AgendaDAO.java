package controller.dao;

import model.Agenda;

public interface AgendaDAO {

    void inserir(Agenda agenda);

    public void visualizar();

    public boolean deletar();
}
