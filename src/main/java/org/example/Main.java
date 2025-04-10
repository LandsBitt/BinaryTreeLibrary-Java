package org.example;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Btree a = new Btree();


        while (true){
            int option;
            System.out.println("(1) Para adicionar \n" +"(2) Para Listar todos os Livros \n" + "(3) Para Buscar por Isbn\n" + "(4) Para Fechar");
            System.out.println("Selecione uma das opções acima para a operação desejada: ");
            option = scan.nextInt();

            if (option == 1){
                System.out.println("Quantos Livros serão adicionados?");
                int quantidade_aluno = scan.nextInt();
                for (int i = 0; i < quantidade_aluno; i++) {
                    System.out.println("Qual é o Isbn do Livro?");
                    String isbn = scan.next();
                    scan.nextLine();

                    System.out.println("Qual é o Titulo do Livro?");
                    String titulo = scan.next();
                    scan.nextLine();
                    System.out.println("Qual é o autor");
                    String autor = scan.next();
                    scan.nextLine();
                    
                    Livro x = new Livro(isbn, titulo, autor);
                    a.add(x);
                }
            }
            else if (option == 2){
                a.show();
            }
            else if (option == 3){
                System.out.println("Insira o Isbn do Livro para a pesquisa: ");
                String isbn = scan.next();
                scan.nextLine();
                a.show_isnb(isbn);
            }
            else if (option == 4){
                break;
            }
            else{
                System.out.println("Opção inválida!");
            }

        }
    }
}