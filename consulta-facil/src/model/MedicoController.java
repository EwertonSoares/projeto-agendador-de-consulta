package model;

import controller.MedicoDAO;

import java.util.ArrayList;

public class MedicoController implements MedicoDAO {
    ArrayList<Medico> medicos;

    public MedicoController() {
        this.medicos = new ArrayList<>();
    }

    public Medico getMedico(int crm){
        for (Medico m: this.medicos) {
            if(m.getCrm() == crm)
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