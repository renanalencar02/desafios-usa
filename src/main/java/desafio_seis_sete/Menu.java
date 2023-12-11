package desafio_seis_sete;


import java.util.Scanner;

public class Menu {
    private static Scanner ler = new Scanner(System.in);
    public static void abrirMenu() {
        Integer opcao;
        do {
               opcao = opcoesMenu();
               switch (opcao) {
                    case 1:
                        System.out.print("Digite o nome da pessoa: ");
                        String nome = ler.nextLine();
                        System.out.print("Digite o email da pessoa: ");
                        String email = ler.nextLine();
                        System.out.print("Digite a idade da pessoa: ");
                        Integer idade = null;
                        while (idade == null){
                            if(ler.hasNextInt()){
                                idade = ler.nextInt();
                                ler.nextLine();
                            } else {
                                System.out.print("Idade inválida. Digite apenas números: ");
                                ler.nextLine();
                            }
                        }
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
        }while (opcao != 0);
    }

    public static Integer opcoesMenu() {
        Integer opcao = null;
        System.out.println("""
                Olá, Usuário. Digite uma das opções abaixo:
                1 - Cadastrar
                2 - Listar
                0 - Sair
                """);
        while (opcao == null) {
            if (ler.hasNextInt()) {
                opcao = ler.nextInt();
                ler.nextLine();
            } else {
                System.out.println("Digite uma das opções válidas: 1, 2 ou 0");
                ler.nextLine();
            }
        }
        return opcao;
    }
}

