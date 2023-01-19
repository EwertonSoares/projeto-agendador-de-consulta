package model;

public class Paciente extends Pessoa {
    private String convenio;

    public Paciente(String nome, String telefone, String endereco, String cpf, String convenio) {
        super(nome, telefone, endereco, cpf);
        this.convenio = convenio;
    }

    public Paciente() {}

    public String getConvenio() {
        return convenio;
    }

    public void setConvenio(String convenio) {
        this.convenio = convenio;
    }

}
