package controller;


import controller.dao.AgendaDAO;

import model.Agenda;

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
        for (Agenda agenda : this.agendas) {
            System.out.println(agenda.getPaciente().getNome());
            System.out.println(agenda.getMedico().getNome());
            System.out.println(agenda.getHorario());
            System.out.println(agenda.getData());
        }

    }

    @Override
    public boolean deletar(Agenda agenda) {
        return agendas.remove(agenda);
    }
    @Override
    public void atualizar(Agenda agenda) {
        int index = 0;
        for(Agenda ag : agendas) {
            if(ag.getData().equals(agenda.getData()) && ag.getHorario().equals(agenda.getHorario()) &&
                    ag.getPaciente().getCpf().equals(agenda.getPaciente().getCpf())) {

                index = 0;
            }
        }

         agendas.set(index, agenda);
    }
}
