package desafio_seis_sete;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

class RepositorioPessoaTest {

    @Test
    @DisplayName("Deve retornar um objeto pessoa cadastrado.")
    void cadastrar_DeveRetornarUmObjetoPessoaCadastrado() {
        Pessoa pessoa = new Pessoa("José", "jose@gmail.com", 50);
        RepositorioPessoa repositorio = new RepositorioPessoa();
        repositorio.cadastrar(pessoa);
        Assertions.assertEquals(List.of(pessoa), repositorio.listar());
    }

}