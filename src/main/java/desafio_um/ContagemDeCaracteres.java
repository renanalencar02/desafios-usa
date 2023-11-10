package desafio_um;

import java.util.Locale;
import java.util.Scanner;

public class ContagemDeCaracteres {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);

        System.out.println();
        System.out.println("----- SISTEMA QUE BUSCA E CONTA CARACTERES ESPECÍFICOS -----");
        System.out.print("Digite um conjuto de caracteres: ");
        String caracteres = read.nextLine();
        System.out.print("Digite o caractere a ser buscado: ");
        Character buscar = read.nextLine().charAt(0);


        Integer total = ContarCaracteres(buscar.toString().toLowerCase(), caracteres.toLowerCase());
        System.out.println("Total de caracteres buscados: "+ total);


    }
    public static Integer ContarCaracteres(String buscado, String conjuntoCaracteres){
        if(buscado == null || conjuntoCaracteres == null || buscado.isEmpty() || conjuntoCaracteres.isEmpty()){
            throw new RuntimeException("Entrada inválida!");
        }
        int cont = 0;
        for (int i = 0; i < conjuntoCaracteres.length(); i++) {
            if (conjuntoCaracteres.charAt(i) == buscado.charAt(0)){
               cont++;
            }
        }
        return cont;
    }
}
