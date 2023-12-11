package desafio_seis_sete;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PessoaTest {

    @Test
    @DisplayName("Deverá retornar o nome do objeto pessoa.")
    void getNome_DeveRetornarONome() {
        Pessoa pessoa = new Pessoa("Renan", "renan@gmail.com", 30);
        Assertions.assertEquals("Renan", pessoa.getNome());
    }

    @Test
    @DisplayName("Deverá retornar o email do objeto pessoa.")
    void getEmail_DeveRetornarOEmail() {
        Pessoa pessoa = new Pessoa("Renan", "renan@gmail.com", 30);
        Assertions.assertEquals("renan@gmail.com", pessoa.getEmail());
    }

    @Test
    @DisplayName("Deverá retornar a idade do objeto pessoa.")
    void getIdade_DeveRetornarAIdade() {
        Pessoa pessoa = new Pessoa("Renan", "renan@gmail.com", 30);
        Assertions.assertEquals(30, pessoa.getIdade());
    }
}