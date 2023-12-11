package desafio_seis_sete;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

class RepositorioPessoaTest {

    @Test
    @DisplayName("Deverá cadastrar uma nova pessoa e listar.")
    void cadastrar_DeveRetornarUmObjetoPessoaCadastrado() {
        Pessoa pessoa = new Pessoa("José", "jose@gmail.com", 50);
        RepositorioPessoa repositorio = new RepositorioPessoa();
        repositorio.cadastrar(pessoa);
        Assertions.assertEquals(List.of(pessoa), repositorio.listar());
    }

}