/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fcamara;
import java.util.Scanner;
/**
 *
 * @author INFINITY
 */
public class FCamara {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Conta myConta;
        Scanner ler = new Scanner(System.in);
        myConta = new Conta();
        myConta.nmConta = "Gabriel Vaz da Silva";
        myConta.vlSaldo = 0.0;
        myConta.nrConta = "938740-00";
        System.out.println("Número da Conta: "+myConta.nrConta);
        System.out.println("Nome: "+myConta.nmConta);
        System.out.println("Saldo: "+myConta.vlSaldo);
        
        System.out.println("\n Digite uma opção para continuar:1 - Sacar, 2 - Depositar, 3 - Mudar Nome");
        int opcao;
        opcao = ler.nextInt();
        if(opcao == 1){
            System.out.println("Digite o Valor do Saque.");
            double valorSaque;
            valorSaque = ler.nextDouble();
            myConta.Sacar(valorSaque);
        }
        else if(opcao == 2){
            System.out.println("Digite o Valor do Deposito.");
            double valorDep;
            valorDep = ler.nextDouble();
            myConta.Depositar(valorDep);
        }
        else if(opcao == 3){
            System.out.println("Digite o novo nome.");
            String nomeNew;
            nomeNew = ler.next();
            myConta.MudarNome(nomeNew);
        }
        else{
            System.out.println("Numero Invalido.");
        }
        
        
        
    }
    
}
