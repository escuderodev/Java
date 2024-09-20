package br.com.escuderodev.poo.models;

import java.math.BigDecimal;

public class ContaCorrente extends Conta {
    private BigDecimal taxaDeSaque = new BigDecimal("5.00");

    public ContaCorrente(String numero) {
        super(numero);
    }

    @Override
    public void sacar(BigDecimal valor) {
        BigDecimal valorDesejado = valor.add(taxaDeSaque);
        if (this.saldo.compareTo(valorDesejado) >= 0) {
            this.saldo = this.saldo.subtract(valorDesejado);
            this.transacoes.add("- Saque R$" + formatarValor(valorDesejado));
            System.out.println("Saque realizado com sucesso!");
            System.out.println("Seu novo saldo é R$: " + formatarValor(this.saldo));
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

}
