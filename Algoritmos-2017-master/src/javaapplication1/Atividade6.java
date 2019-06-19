package javaapplication1;

import java.util.Scanner;

public class Atividade6 {
    
    public static void func1(){
        System.out.println("Função sem retorno.");
    }
    
    public static void func2(int p, int p2){
        System.out.println("Inserindo dados...");
    }
    
    public static int calcIdade(int ano){
        return 2017 - ano;
        
    }
    
    public static int pedirNumero(){
        Scanner e = new Scanner(System.in);
        System.out.println("Digite um numero");
        int n = e.nextInt();
        return n;
    }

    public static void main(String[] args) {
        System.out.println("Idade: "+ calcIdade(1988));
    }
    
}
