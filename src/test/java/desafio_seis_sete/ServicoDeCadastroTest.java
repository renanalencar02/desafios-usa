package desafio_seis_sete;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ServicoDeCadastroTest {

    @Test
    @DisplayName("Deverá cadastrar uma nova pessoa e listar")
    void cadastrarPessoa() {
        Pessoa pessoa = new Pessoa("Teste", "teste@gmail.com", 40);
        ServicoDeCadastro servicoDeCadastro = new ServicoDeCadastro();
        servicoDeCadastro.cadastrarPessoa(pessoa);
        Assertions.assertEquals(List.of(pessoa), servicoDeCadastro.listarPessoas());
    }

}