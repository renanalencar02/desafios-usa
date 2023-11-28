package desafio_seis;


import java.util.Scanner;

public class Menu {
    public static void abrirMenu() {
        Scanner ler = new Scanner(System.in);
        Integer opcao;

        do {
            try {
                opcoesMenu();
                opcao = ler.nextInt();
                ler.nextLine();
                switch (opcao) {
                    case 1:
                        System.out.print("Digite o nome da pessoa: ");
                        String nome = ler.nextLine();
                        System.out.print("Digite o email da pessoa: ");
                        String email = ler.nextLine();
                        System.out.print("Digite a idade da pessoa: ");
                        Integer idade = ler.nextInt();
                        System.out.println();
                        Pessoa pessoa = new Pessoa(nome, email, idade);
                        ServicoDeCadastro.cadastrarPessoa(pessoa);
                        break;

                    case 2:
                        for (Pessoa item : ServicoDeCadastro.listarPessoas()) {
                            System.out.println(item);
                        }
                        System.out.println();
                        break;
                    case 0:
                        System.out.println("Fim do programa!");
                        break;
                    default:
                        System.out.println("Opção inválida!");
                        System.out.println();
                }

            } catch(RuntimeException e){
                System.out.println("Opção inválida!");
                System.out.println();
            } finally {
                continue;
            }
        }while (opcao != 0);
    }

    public static void opcoesMenu() {
        System.out.println("""
                Olá, Usuário. Digite uma das opções abaixo:
                1 - Cadastrar
                2 - Listar
                0 - Sair
                """);
    }
}

