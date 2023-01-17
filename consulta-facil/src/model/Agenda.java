package model;

public class Agenda {
     private String data;
     private String horario;
     private Medico medico;
     private Paciente paciente;

    public Agenda(String data, String horario, Medico medico, Paciente paciente) {
        this.data = data;
        this.horario = horario;
        this.medico = medico;
        this.paciente = paciente;
    }

    public String getData(String data) {
        return this.data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorario(String horario) {
        return this.horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }


}


