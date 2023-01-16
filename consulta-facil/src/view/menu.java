package view;

import java.util.Scanner;

public class menu {
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
            System.out.println("            5 - Alterar cadastro                     ");
            System.out.println("            0 - Sair                                 ");
            System.out.println("                                                     ");
            System.out.println("*****************************************************");
            System.out.println("Entre com a opção desejada:                          ");
            System.out.println("                                                     ");

            opcao = leia.nextInt();

            if (opcao == 0) {
                System.out.println("\nConsulta fácil agradece pela preferência!");
                leia.close();
                System.exit(0);
            }
            System.out.println(opcao);

            switch (opcao) {
                case 1:
                    System.out.println("Cadastrar paciente\n\n");
                    break;
                case 2:
                    System.out.println("Visualizar agenda\n\n");

                    break;
                case 3:
                    System.out.println("Agendar consulta \n\n");

                    break;
                case 4:
                    System.out.println("Cancelar consulta \n\n");

                    break;
                case 5:
                    System.out.println("Alterar cadastro\n\n");

                    break;
                case 0:
                    System.out.println("Saque\n\n");

                    break;
                default:
                    System.out.println("\nOpção Inválida!\n");
                    break;
            }
        }
    }
}
