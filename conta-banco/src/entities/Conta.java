package entities;

import java.text.DecimalFormat;

public class Conta {

    private Integer numero;
    private String agencia;
    private String nomeCliente;
    private Double saldo;

    public Conta() {
    }


    public Conta(Integer numero, String agencia, String nomeCliente, Double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }


    DecimalFormat df = new DecimalFormat("#.00");



    @Override
    public String toString() {
        return "Olá " + getNomeCliente().toUpperCase()+ ",obrigado por criar uma conta em nosso banco, sua agência é " + getAgencia() + ", conta "+ getNumero() + " e seu saldo " +  String.format("%.2f", getSaldo()) + " já está disponível para saque";
    }

    

    

    

    

}
