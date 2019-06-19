package javaapplication1;

import java.util.Scanner;

//CALCULAR PEDINDO NUMERO VIA FUNÇÃO
public class calc {

    public static int pedirNumero() {
        Scanner e = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int n = e.nextInt();
        return n;
    }

    public static int somar() {

        int resultado;
        System.out.println("Função 1 - Somar.");
        int a = pedirNumero();
        int b = pedirNumero();
        resultado = a + b;

        System.out.println("Resultado: " + resultado);
        return resultado;
    }

    public static int subtrair() {

        int resultado;
        System.out.println("Função 2 - Subtrair.");
        int a = pedirNumero();
        int b = pedirNumero();
        resultado = a - b;

        System.out.println("Resultado: " + resultado);
        return resultado;
    }

    public static int dividir() {

        int resultado;
        System.out.println("Função 3 - Dividir.");
        int a = pedirNumero();
        int b = pedirNumero();
        resultado = a / b;

        System.out.println("Resultado: " + resultado);
        return resultado;
    }

    public static int multiplicar() {

        int resultado;
        System.out.println("Função 4 - Multiplicar.");
        int a = pedirNumero();
        int b = pedirNumero();
        resultado = a * b;

        System.out.println("Resultado: " + resultado);
        return resultado;
    }

    public static void main(String[] args) {
        int opcao = 0;
        //while (opcao !=) {
            System.out.println("Bem vindo!\nDigite a opção desejada.\n\n");

            System.out.println("---Menu Principal");
            System.out.println("1 - Somar.");
            System.out.println("2 - Subtrair.");
            System.out.println("3 - Dividir.");
            System.out.println("4 - Multiplicar");
            System.out.println("5 - Fim.");

            opcao = pedirNumero();

            if (opcao == 1) {
                somar();
            } else if (opcao == 2) {
                subtrair();
            } else if (opcao == 3) {
                dividir();
            } else if (opcao == 4) {
                multiplicar();
            } else if (opcao == 5) {
                System.out.println("Programa Finalizado!");
            } else {
                System.out.println("Opção Inválida!");
            }
        //}
    }
}
