package com.bank;

import com.bank.client.Cliente;
import com.bank.services.Conta;
import com.bank.services.ContaCorrente;
import com.bank.services.ContaPoupanca;

public class App {

    public static void main(String[] args) {

        Cliente jonas = new Cliente("Jonas");
        Cliente joseph = new Cliente("Joseph");

        Conta corrente = new ContaCorrente(jonas);
        corrente.depositar(100);

        Conta poupanca = new ContaPoupanca(joseph);
        corrente.transferir(100, poupanca);

        corrente.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
