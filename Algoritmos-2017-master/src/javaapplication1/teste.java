package javaapplication1;

import java.util.Scanner;

public class teste {
    
    public static int numero(){
        System.out.println("Digite um Número");
        
        Scanner e = new Scanner (System.in);
        int a = e.nextInt();
        
        System.out.println("Numero digitado: "+ a);
        return a;
    }

    public static void main(String[] args) {
        int num = numero();
    }
    
}
