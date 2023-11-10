package desafio_tres;

import desafio_dois.TransformacaoDeCaracteres;
import desafio_um.ContagemDeCaracteres;

import java.sql.SQLOutput;

public class Principal {
    public static void main(String[] args) {
        System.out.println("---- TESTES DESAFIO UM ----");
        testeDesafioUm();
        System.out.println();
        System.out.println("---- TESTES DESAFIO DOIS ----");
        testeDesafioDois();

    }
    public static void testeDesafioUm(){
        try {
            //Arrange
            String buscado = null;
            String conjuntoCaracteres = "O rato roeu a roupa do rei de roma";
            //Act
            int testeUm = ContagemDeCaracteres.ContarCaracteres(buscado, conjuntoCaracteres);
            //Assert
            System.out.println("Teste com falha, deveria ser lançada uma exceção.");
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }

        try {
            //Arrange
            String buscado = "r";
            String conjuntoCaracteres = null;
            //Act
            int testeDois = ContagemDeCaracteres.ContarCaracteres(buscado, conjuntoCaracteres);
            //Assert
            System.out.println("Teste com falha, deveria ser lançada uma exceção.");
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }

        try{
            //Arrange
            String buscado = "/";
            String conjuntoCaracteres = "O rato roeu a roupa do rei de roma";
            //Act
            int testeTres = ContagemDeCaracteres.ContarCaracteres(buscado, conjuntoCaracteres);
            //Assert
            if(testeTres != 0){
                System.out.println("Teste com falha, deveria retornar '0'.");
            }
            System.out.println("Resultado esperado --> 0" + " | Resultado final: " + testeTres);
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }

        try{
            //Arrange
            String buscado = " ";
            String conjuntoCaracteres = "O rato roeu a roupa do rei de roma";
            //Act
            int testeQuatro = ContagemDeCaracteres.ContarCaracteres(buscado, conjuntoCaracteres);
            //Assert
            if(testeQuatro != 8){
                System.out.println("Teste com falha, deveria retornar '8'.");
            }
            System.out.println("Resultado esperado --> 8" + " | Resultado final: " + testeQuatro);
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }

        try{
            //Arrange
            String buscado = "r";
            String conjuntoCaracteres = "O rato roeu a roupa do rei de roma";
            //Act
            int testeCinco = ContagemDeCaracteres.ContarCaracteres(buscado, conjuntoCaracteres);
            //Assert
            if(testeCinco != 5){
                System.out.println("Teste com falha, deveria retornar '0'.");
            }
            System.out.println("Resultado esperado --> 5" + " | Resultado final: " + testeCinco);
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }

        try{
            //Arrange
            String buscado = "";
            String conjuntoCaracteres = "O rato roeu a roupa do rei de roma";
            //Act
            int testeSeis = ContagemDeCaracteres.ContarCaracteres(buscado, conjuntoCaracteres);
            //Assert
            System.out.println("Teste com falha, deveria ser lançada uma exceção.");
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }

        try{
            //Arrange
            String buscado = "r";
            String conjuntoCaracteres = "";
            //Act
            int testeSete = ContagemDeCaracteres.ContarCaracteres(buscado, conjuntoCaracteres);
            //Assert
            System.out.println("Teste com falha, deveria ser lançada uma exceção.");
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
    }

    public static void testeDesafioDois(){
        try {
            //Arrange
            String nomeCompleto = "Elaine Castro MalhEIros Do NAscimentO ANDRE DE alenCar";
            String resultadoEsperado = "Elaine Castro Malheiros do Nascimento Andre de Alencar";
            //Act
            String testeUm = TransformacaoDeCaracteres.primeiraLetraMaiuscula(nomeCompleto);
            //Assert
            if (!testeUm.equals(resultadoEsperado)) {
                System.out.println("Teste com falha. Deveria retornar --> " + resultadoEsperado);
            }
            System.out.println("Resultado esperado --> " + resultadoEsperado + " | Resultado final: " + testeUm);
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }

        try {
            //Arrange
            String nomeCompleto = "ELAINE CASTRO MALHEIROS DO NASCIMENTO ANDRE DE ALENCAR";
            String resultadoEsperado = "Elaine Castro Malheiros do Nascimento Andre de Alencar";
            //Act
            String testeDois = TransformacaoDeCaracteres.primeiraLetraMaiuscula(nomeCompleto);
            //Assert
            if (!testeDois.equals(resultadoEsperado)) {
                System.out.println("Teste com falha. Deveria retornar --> " + resultadoEsperado);
            }
            System.out.println("Resultado esperado --> " + resultadoEsperado + " | Resultado final: " + testeDois);
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }

        try {
            //Arrange
            String nomeCompleto = "";
            //Act
            String testeTres = TransformacaoDeCaracteres.primeiraLetraMaiuscula(nomeCompleto);
            //Assert
            System.out.println("Teste com falha, deveria ser lançada uma exceção.");
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }

        try {
            //Arrange
            String nomeCompleto = null;
            //Act
            String testeQuatro = TransformacaoDeCaracteres.primeiraLetraMaiuscula(nomeCompleto);
            //Assert
            System.out.println("Teste com falha, deveria ser lançada uma exceção.");
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
    }
}
