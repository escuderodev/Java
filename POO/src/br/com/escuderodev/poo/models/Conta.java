package br.com.escuderodev.poo.models;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public abstract class Conta {
    protected String agencia;
    protected String numero;
    protected BigDecimal saldo;
    protected List<String> transacoes = new ArrayList<>();

    public Conta(String numero) {
        this.agencia = "0001";
        this.numero = numero;
        this.saldo = new BigDecimal("0.00");
    }

    public String formatarValor(BigDecimal valor) {
        // Criando um formato para duas casas decimais
        DecimalFormat df = new DecimalFormat("#,###.00");
        String valorFormatado = df.format(valor);
        return valorFormatado;
    }

    public void depositar(BigDecimal valor) {
        if (valor.compareTo(BigDecimal.ZERO) > 0) {
            this.saldo = this.saldo.add(valor);
            this.transacoes.add("+ Depósito R$" + formatarValor(valor));
            System.out.println("Deposito realizado com sucesso!");
            System.out.println("Seu novo saldo é R$: " + formatarValor(this.saldo));
        }
    }

    public void sacar(BigDecimal valor) {
        if (this.saldo.compareTo(valor) >= 0) {
            this.saldo.subtract(valor);
            this.transacoes.add("- Saque R$" + formatarValor(valor));
            System.out.println("Saque realizado com sucesso!");
            System.out.println("Seu novo saldo é R$: " + formatarValor(this.saldo));
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public void extrato() {
        System.out.println("\n===== Extrato da Conta " + this.numero + " =====");
        this.transacoes.forEach(System.out::println);
        System.out.println("Saldo atual R$: " + formatarValor(this.saldo));
    }

    @Override
    public String toString() {
        return "Conta{" +
                "agencia='" + agencia + '\'' +
                ", numero='" + numero + '\'' +
                ", saldo=" + formatarValor(this.saldo) +
                '}';
    }
}
