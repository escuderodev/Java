package br.com.escuderodev.vollmed.model.medico;

import br.com.escuderodev.vollmed.model.endereco.DadosCadastroEndereco;

public record DadosCadastroMedico(
        String nome,
        String email,
        String crm,
        Especialidade especialidade,
        DadosCadastroEndereco endereco) {
}