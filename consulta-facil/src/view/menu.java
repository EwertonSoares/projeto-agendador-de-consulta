package view;

import controller.AgendaController;
import controller.MedicoController;
import controller.PacienteConroller;
import model.*;

import java.util.Scanner;

public class menu {
    static PacienteConroller crudPaciente = new PacienteConroller();
    static AgendaController crudAgenda = new AgendaController();
    static MedicoController crudMedico = new MedicoController();

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        int opcao;

        while (true) {

            System.out.println("*****************************************************");
            System.out.println("                                                     ");
            System.out.println("                CONSULTA FÁCIL                       ");
            System.out.println("                                                     ");
            System.out.println("*****************************************************");
            System.out.println("                                                     ");
            System.out.println("            1 - Cadastrar paciente                   ");
            System.out.println("            2 - Visualizar agenda                    ");
            System.out.println("            3 - Agendar consulta                     ");
            System.out.println("            4 - Cancelar consulta                    ");
            System.out.println("            5 - Cadastrar Médico                     ");
            System.out.println("            0 - Sair                                 ");
            System.out.println("                                                     ");
            System.out.println("*****************************************************");
            System.out.print("Entre com a opção desejada: ");

            opcao = leia.nextInt();

            if (opcao == 0) {
                System.out.println("Consulta fácil agradece pela preferência!");
                leia.close();
                System.exit(0);
            }

            switch (opcao) {
                case 1:
                    System.out.println("Cadastrar paciente");
                    cadastarPaciente();
                    break;
                case 2:
                    System.out.println("Visualizar agenda");
                    crudAgenda.visualizar();
                    break;
                case 3:
                    System.out.println("Agendar consulta");
                    agendarConsulta();
                    break;
                case 4:
                    System.out.println("Cancelar consulta");
                    cancelarConsulta();
                    break;
                case 5:
                    System.out.println("Cadastrar Médico");
                    cadastarMedico();
                    break;
                case 0:
                    System.out.println("Sair");

                    break;
                default:
                    System.out.println("Opção Inválida!");
                    break;
            }
        }

    }

    private static void cancelarConsulta() {
        Scanner getInfo = new Scanner(System.in);
        Paciente paciente = new Paciente();

        System.out.println("\n### Para cancelar a consulta preencha cpf abaixo: ###\n ");

        System.out.println("Digite seu cpf: ");
        int cpf = getInfo.nextInt();

        paciente.setCpf(cpf);

        deletarAgenda(paciente);
    }

    private static void deletarAgenda(Paciente paciente) {
        if(crudAgenda.deletar(new Agenda(paciente))) {
            System.out.println("**** Agenda removida com sucesso! *****");
        } else {
            System.out.println("**** ERRO *****");
        }
    }

    private static void agendarConsulta() {
        Scanner entrada = new Scanner(System.in);
        int cpf, crm;
        String hora, data;

        System.out.print("Digite o Horario: ");
        hora = entrada.next();
        System.out.print("Digite a data: ");
        data = entrada.next();

        crudPaciente.visualizar();
        System.out.print("Digite o CPF do Paciente: ");
        cpf = entrada.nextInt();

        crudMedico.visualizar();
        System.out.print("Digite o CRM do medico: ");
        crm = entrada.nextInt();

        Agenda ag = new Agenda(data, hora, crudMedico.getMedico(crm), crudPaciente.getPaciente(cpf));
        crudAgenda.inserir(ag);
    }


    private static void cadastarPaciente() {
        String nome;
        int tel;
        String end;
        int cpf;
        String conv;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        nome = entrada.next();

        System.out.print("Digite o tel: ");
        tel = entrada.nextInt();

        System.out.print("Digite o endereço: ");
        end = entrada.next();

        System.out.print("Digite o cpf: ");
        cpf = entrada.nextInt();

        System.out.print("Digite o convenio: ");
        conv = entrada.next();

        Paciente paciente = new Paciente(nome, tel, end, cpf, conv);
        crudPaciente.inserir(paciente);

    }

    private static void cadastarMedico() {
        String nome;
        int tel;
        String end;
        int cpf, crm;
        String esp;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        nome = entrada.next();

        System.out.print("Digite o tel: ");
        tel = entrada.nextInt();

        System.out.print("Digite o endereço: ");
        end = entrada.next();

        System.out.print("Digite o cpf: ");
        cpf = entrada.nextInt();

        System.out.print("Digite o crm: ");
        crm = entrada.nextInt();

        System.out.print("Digite a especialidade: ");
        esp = entrada.next();

        Medico medico = new Medico(nome, tel, end, cpf, crm, esp);
        crudMedico.inserir(medico);

    }
}
