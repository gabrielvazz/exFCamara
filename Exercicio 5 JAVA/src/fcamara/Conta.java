/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fcamara;

/**
 *
 * @author INFINITY
 */
public class Conta {
    String nrConta;
    String nmConta;
    double vlSaldo;
    
    void Sacar(double vlSaq){
        if(vlSaq <= this.vlSaldo){
            double novoSaldo = this.vlSaldo - vlSaq;
            this.vlSaldo = novoSaldo;
            System.out.println("Saque realizado! Novo Saldo: "+this.vlSaldo);
        }
        else{
            System.out.println("Saldo Insuficiente, Seu saldo: "+this.vlSaldo);
        }
    }
    
    void Depositar(double vlDep){
        this.vlSaldo += vlDep;
        System.out.println("Deposito realizado! Novo Saldo: "+this.vlSaldo);
    }
    
    void MudarNome(String nomeNovo){
        this.nmConta = nomeNovo;
        System.out.println("Mudança de Nome concluída, Novo nome: "+this.nmConta);
    }
    
}
