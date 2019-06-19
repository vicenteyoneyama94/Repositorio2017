package javaapplication1;

import java.util.Random;

public class Atividade2 {

    public static int solicitar() {
        Random r = new Random();
        
        System.out.println("Digite o limite: ");
        int n = r.nextInt(50);

        System.out.println("O Número é: "+n);
        return n;
    }

    public static void main(String[] args) {
        int num = solicitar(); 
    }

}
