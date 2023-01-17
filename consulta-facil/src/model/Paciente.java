package model;

public class Paciente extends Pessoa {
    private String convenio;

    public Paciente(String nome, int telefone, String endereco, int cpf, String convenio) {
        super(nome, telefone, endereco, cpf);
        this.convenio = convenio;
    }
    public String getConvenio() {
        return convenio;
    }

    public void setConvenio(String convenio) {
        this.convenio = convenio;
    }

}
