package desafio_dois;

import java.util.*;

public class Principal {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite o nome completo: ");
        String nomeCompleto = ler.nextLine();

        System.out.println(primeiraLetraMaiuscula(nomeCompleto));
    }

    public static String primeiraLetraMaiuscula(String nomeCompleto){
        nomeCompleto = nomeCompleto.toLowerCase();
        List<String> preposicoes = Arrays.asList("de", "do", "da", "dos", "das");

        String[] nomes = nomeCompleto.split(" ");
        String[] nomesCorrigidos = new String[nomes.length];
        String nomeCompletoCorrigido = "";

        for (int i = 0; i < nomes.length; i++) {
            if (!preposicoes.contains(nomes[i])) {
                nomesCorrigidos[i] = nomes[i].substring(0, 1).toUpperCase() + nomes[i].substring(1);
            } else {
                nomesCorrigidos[i] = nomes[i];
            }
        }
        for (String nome: nomesCorrigidos) {
            nomeCompletoCorrigido += nome + " ";
        }
        return nomeCompletoCorrigido.trim();
    }
}
