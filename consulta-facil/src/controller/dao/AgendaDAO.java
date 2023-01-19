package controller.dao;

import model.Agenda;

public interface AgendaDAO {
    void inserir(Agenda agenda);
    void visualizar();
    boolean deletar(Agenda agenda);
    void atualizar(Agenda agenda);

}
