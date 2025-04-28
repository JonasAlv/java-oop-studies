package com.bank.services;

import com.bank.client.Cliente;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);

    }

    @Override
    public void imprimirExtrato() {
        System.out.println("===Extrato com.bank.services.Conta Poupanca===");
        super.imprimirInfoConta();
    }
}
