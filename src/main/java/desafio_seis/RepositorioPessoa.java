package desafio_seis;

import java.util.ArrayList;
import java.util.List;

public class RepositorioPessoa {
    private static List<Pessoa> pessoas = new ArrayList<>();

    public static void cadastrar(Pessoa pessoa){
        pessoas.add(pessoa);
    }
    public static List<Pessoa> listar(){
        return pessoas;
    }
}
