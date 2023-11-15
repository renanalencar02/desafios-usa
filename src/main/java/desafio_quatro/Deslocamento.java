package desafio_quatro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Deslocamento {
    public static void main(String[] args) {
       teste();
    }

    public static String realizarDeslocamento(Integer deslocamento, String entrada){
        List<String> alfabeto = Arrays.asList("a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","0","1","2","3","4","5","6","7","8","9"
                + "A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z","0","1","2","3","4","5","6","7","8","9");
        if(deslocamento == null || entrada == null || entrada.isEmpty()){
            throw new RuntimeException("Entrada inválida. Valor nulo ou vazio.");
        }
        Matcher matcher = Pattern.compile("^[a-zA-Z]+$").matcher(entrada);
        if(!matcher.matches()){
            throw new RuntimeException("Entrada inválida. Caracteres especiais.");
        }
        String[] letrasEntrada = entrada.split("");
        int posicao;
        for (int i = 0; i < entrada.length(); i++) {
            if(alfabeto.contains(letrasEntrada[i])){
                posicao = alfabeto.indexOf(letrasEntrada[i]);
                letrasEntrada[i] = alfabeto.get(posicao + deslocamento);
            }
        }
        return String.join("", letrasEntrada);
    }

    public static void teste(){
        try{
           String testeUm = realizarDeslocamento(2, "Renan");
            if(!testeUm.equals("Tgpcp")){
                System.out.println("Resultado do teste: Reprovado!");
            }
            System.out.println("Resultado do teste: Aprovado!");
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }

        try{
            String testeDois = realizarDeslocamento(2, "Raul");
            if(!testeDois.equals("Tcwn")){
                System.out.println("Resultado do teste: Reprovado!");
            }
            System.out.println("Resultado do teste: Aprovado!");
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }

        try{
            String testeTres = realizarDeslocamento(1, "z");
            if(!testeTres.equals("0")){
                System.out.println("Resultado do teste: Reprovado!");
            }
            System.out.println("Resultado do teste: Aprovado!");
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
    }

}
