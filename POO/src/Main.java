import br.com.escuderodev.poo.models.ContaCorrente;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente("850408") {
        };

        conta.extrato();
        conta.sacar(new BigDecimal("1"));
        conta.depositar(new BigDecimal("1000"));
        conta.sacar((new BigDecimal("58.70")));
        conta.extrato();
    }
}