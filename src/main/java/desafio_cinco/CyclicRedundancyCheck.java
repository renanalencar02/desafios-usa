package desafio_cinco;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CyclicRedundancyCheck {
    public static void main(String[] args) {
        testes();
    }

    private static void testes() {
        try {
            String testeUm = criarCrc("Paulaalalalalalalalalfsdfsdf");
            if (!testeUm.equals("1717")){
                System.out.println("Resultado do teste Um: Reprovado!");
            }else {
                System.out.println("Resultado do teste Um: Aprovado!");
            }
            System.out.println(testeUm);
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
        try {
            String testeDois = criarCrc("Paula");
            if (!testeDois.equals("1702")){
                System.out.println("Resultado do teste Dois: Reprovado!");
            }else {
                System.out.println("Resultado do teste Dois: Aprovado!");
            }
            System.out.println(testeDois);
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
        try {
            String testeTres = criarCrc("Marlon");
            if (!testeTres.equals("1804")){
                System.out.println("Resultado do teste Tres: Reprovado!");
            }else {
                System.out.println("Resultado do teste Tres: Aprovado!");
            }
            System.out.println(testeTres);
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
        try {
            String testeQuatro = criarCrc("Antonia");
            if (!testeQuatro.equals("2203")){
                System.out.println("Resultado do teste Quatro: Reprovado!");
            }else {
                System.out.println("Resultado do teste Quatro: Aprovado!");
            }
            System.out.println(testeQuatro);
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
        try {
            String testeCinco = criarCrc("");
            System.out.println("Deveria lançar uma exception");
        }catch (RuntimeException e){
            System.out.println("Resultado do teste Cinco: " + e.getMessage());
        }
        try {
            String testeSeis = criarCrc(null);
            System.out.println("Deveria lançar uma exception");
        }catch (RuntimeException e){
            System.out.println("Resultado do teste Seis: " +e.getMessage());
        }
    }

    public static String criarCrc(String dados){
        if(dados == null || dados.isEmpty()){
            throw new RuntimeException("Entrada inválida!");
        }
        Matcher matcher = Pattern.compile("^[a-zA-Z ]+$").matcher(dados);
        if(!matcher.matches()){
            throw new RuntimeException("Entrada inválida. Caracteres especiais.");
        }
        List<String> consoantes = List.of("bcdfghjklmnpqrstvxywz".split(""));
        List<String> vogais = List.of("aeiou".split(""));
        List<String> dadosArray = List.of(dados.toLowerCase().split(""));
        ArrayList<Integer> binarios = new ArrayList();
        Integer cont = 0;
        for (int i = 0; i < dadosArray.size(); i++) {
            if(consoantes.contains(dadosArray.get(i))){
                cont++;
            }
        }
        for(int i = vogais.size() - 1; i >= 0; i--){
            if(dadosArray.contains(vogais.get(i))){
                binarios.add(1);
            }else {
                binarios.add(0);
            }
        }
        Integer decimal = 0;
        for(int i = binarios.size()-1; i >= 0; i--){
            decimal = (int) (decimal + binarios.get(i) * Math.pow(2,i));
        }
        if(cont < 10){
            return decimal.toString() + "0" + cont.toString();
        } else {
            return decimal.toString() + cont.toString();
        }

    }
}
