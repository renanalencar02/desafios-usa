package desafio_seis_sete;

import java.util.List;

public class ServicoDeCadastro {
    private static RepositorioPessoa repositorioPessoa;


    public static void cadastrarPessoa(Pessoa pessoa){
        repositorioPessoa.cadastrar(pessoa);
    }

    public static List<Pessoa> listarPessoas(){
        return repositorioPessoa.listar();
    }
}
