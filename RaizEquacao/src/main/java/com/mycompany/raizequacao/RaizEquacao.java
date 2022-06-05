package com.mycompany.raizequacao;

import java.util.Scanner;

public class RaizEquacao {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        float a,b,c,x1,x2,delta;
        
        a=entrada.nextFloat();
        b=entrada.nextFloat();
        c=entrada.nextFloat();
        
        delta=(b*b)-(4*a*c);
        
        if(delta>0){
            x1=(float) ((-b+Math.sqrt(delta))/2*a);
            System.out.println("x´=" + x1);
            x2=(float) ((-b-Math.sqrt(delta))/2*a);
            System.out.println("x''=" + x2);
        }else if(delta==0){
            x1=(float) ((-b+Math.sqrt(delta))/2*a);
            x2=x1;
            System.out.println("x=" + x1);
        }else{
            System.out.println("Equação não possui raízes");
        }
    }
}
