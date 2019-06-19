package javaapplication1;

import java.util.Scanner;

public class Atividade1 {
    
    public static int solicitar(){
        System.out.println("Digite um número:");
        
        Scanner e = new Scanner (System.in);
        int a=e.nextInt();
        
        System.out.println("O numero Digitado é:" +a);
        return a;
        
    }

    public static void main(String[] args) {
        int num = solicitar();
    }
    
}