package controller;

import controller.dao.MedicoDAO;
import model.Medico;

import java.util.ArrayList;

public class MedicoController implements MedicoDAO {
    ArrayList<Medico> medicos;

    public MedicoController() {
        this.medicos = new ArrayList<>();
    }

    public Medico getMedico(String crm){
        for (Medico m: this.medicos) {
            if(m.getCrm().equals(crm))
                return m;
        }
        return null;
    }

    @Override
    public void inserir(Medico medico) {
        this.medicos.add(medico);
    }

    @Override
    public void visualizar() {
        for (Medico m: this.medicos) {
            System.out.println("CRM: "+ m.getCrm() + " Nome: "+ m.getNome());
        }
    }
    @Override
    public boolean deletar() {
        return false;
    }
}
