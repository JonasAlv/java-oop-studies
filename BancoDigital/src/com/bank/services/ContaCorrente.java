package com.bank.services;

import com.bank.client.Cliente;

public class ContaCorrente extends Conta {


    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("===Extrato com.bank.services.ContaCorrente====");
        super.imprimirInfoConta();
    }
}
