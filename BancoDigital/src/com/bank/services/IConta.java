package com.bank.services;

public interface IConta {

    void depositar(double valor);

    void sacar(double valor);

    void transferir(double valor, Conta destino);

    void imprimirExtrato();
}
