package br.com.escuderodev.vollmed.model.endereco;

public record DadosCadastroEndereco(
        String logradouro,
        String bairro,
        String cidade,
        String uf,
        String complemento,
        String numero) {
}