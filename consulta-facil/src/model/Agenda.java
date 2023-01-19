package model;

public class Agenda{
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

    public Agenda(Paciente paciente) {
        this.paciente = paciente;
    }

    public String getData() {
        return data;
    }

    public String getHorario() {
        return horario;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
}


