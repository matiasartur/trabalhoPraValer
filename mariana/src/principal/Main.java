package principal;

import java.util.Scanner;
import funcoes.Hotel;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Hotel hotel = new Hotel("Meu Hotel"); // instancia o objeto Hotel
        int opcao = 0;

        do{
            System.out.println("\n========MENU========\n");
            System.out.println("1 - Cadastrar quarto.");
            System.out.println("2 - Fazer reserva.");
            System.out.println("3 - Cancelar reserva.");
            System.out.println("4 - Listar quartos.");
            System.out.println("5 - Consultar quartos.");
            System.out.println("0 - sair.");
            System.out.println("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch(opcao){
                case 1:
                    hotel.cadastrarQuarto(scanner); //cadastrarQuarto mora dentro do hotel, por isso .hotel (algo como entre nesse objeto e execute isso) ~mariana
                    break;
                case 2:
                    System.out.println("Fazer reserva: em construção...");
                    break;
                case 3:
                    System.out.println("Cancelar reserva: em construção...");
                    break;
                case 4:
                    hotel.listarQuartos(); //ñ tem scanner porque só guarda o que já tem na lista
                    break;
                case 5:
                    hotel.consultarQuarto(scanner);
                    break;
                case 0:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
            System.out.println("");
            System.out.println("");
            System.out.println("");
        } while(opcao != 0);
        scanner.close();
    }
}
