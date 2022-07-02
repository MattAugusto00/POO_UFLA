package principal;

public class Conta {
    private double saldo;
    private double limite;
    private Cliente cliente;
    
    public Conta(Cliente cliente){
        this.cliente=cliente;
        this.limite=500;
    }
    
    public boolean saque(double valor){
        if(this.saldo<this.limite){
            this.saldo=this.saldo-valor;
            return true;
        }else{
            return false;
        }
    }
    
    public void deposito(double valor){
        this.saldo=this.saldo+valor;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
}
