package br.com.escuderodev.vollmed.model.paciente;

import br.com.escuderodev.vollmed.model.endereco.DadosCadastroEndereco;

public record DadosCadastroPaciente(
        String nome,
        String email,
        String telefone,
        String cpf,
        DadosCadastroEndereco endereco
) {
}
