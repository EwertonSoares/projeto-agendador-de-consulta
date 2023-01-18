package model;


import controller.AgendaDAO;

import java.util.ArrayList;

public class AgendaController implements AgendaDAO {
    ArrayList<Agenda> agendas;

    public AgendaController() {
        this.agendas = new ArrayList<Agenda>();
    }


    @Override
    public void inserir(Agenda agenda) {
        this.agendas.add(agenda);
    }

    @Override
    public void visualizar() {
        for (Agenda agenda: this.agendas) {
            System.out.println(agenda.getPaciente().getNome());
            System.out.println(agenda.getMedico().getNome());
            System.out.println(agenda.getHorario());
            System.out.println(agenda.getData());
        }
    }

    @Override
    public boolean deletar() {
        return false;
    }
}
