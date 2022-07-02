package principal;

import java.util.Scanner;

//Criar Conta, Consultar Saldo, Depositar, Sacar e Sair

public class Banco {
    private Conta c;
    Scanner entrada=new Scanner(System.in);
    
    public void menu(){
        String s=entrada.nextLine();
        
        System.out.println("Criar Conta");
        System.out.println("Consultar Saldo");
        System.out.println("Depositar");
        System.out.println("Sacar");
        System.out.println("Sair");
        
        while(s!="Sair"){
            if(s=="Criar Conta"){
                conta();
            }else if(this.c!=null && s!="Criar conta"){
                if(s=="Consultar Saldo"){
                    consultarSaldo(this.c);
                }else if(s=="Depositar"){
                    depositar();
                }else if(s=="Sacar"){
                    sacar();
                }else{
                    System.out.println("Digite uma sequencia valida!");
                }
            }else if(this.c==null){
                System.out.println("Voce deve criar uma conta antes de realizar uma operacao!");
            }else{
                System.out.println("Digite uma sequencia valida!");
            }
            System.out.println("Criar Conta");
            System.out.println("Consultar Saldo");
            System.out.println("Depositar");
            System.out.println("Sacar");
            System.out.println("Sair");
            s=entrada.nextLine();
        }
    }
    
    public void conta(){
        this.c=new Conta(); 
    }
    
    public void consultarSaldo(Conta c){
        System.out.println(this.c.getSaldo());
    }
    
    public void depositar(){
        System.out.println("Digite um valor para deposito: ");
        double valor=Double.parseDouble(entrada.nextLine());
        c.deposito(valor);
        System.out.println("Valor depositado!");
    }
    
    public void sacar(){
        double valor=Double.parseDouble(entrada.nextLine());
        
        if(this.c.saque(valor)==true){
            this.c.saque(valor);
        }else{
            System.out.println("Limite da conta atingido!");
        }
    }
    
}
