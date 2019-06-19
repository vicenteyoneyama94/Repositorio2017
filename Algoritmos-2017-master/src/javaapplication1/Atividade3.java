package javaapplication1;

import java.util.Scanner;

public class Atividade3 {

    public static int solicitar() {
        System.out.println("Digite um número:");

        Scanner e = new Scanner(System.in);
        int a = e.nextInt();

        System.out.println("O numero Digitado é:" + a);
        return a;

    }

    public static String selecao() {
       String mes;

        int b = solicitar();

        if (b == 1) {
            mes = "Janeiro";
        } else if (b == 2) {
            mes = "Fevereiro";
        } else if (b == 3) {
            mes = "Março";
        } else if (b == 4) {
            mes = "Abril";
        } else if (b == 5) {
            mes = "Maio";
        } else if (b == 6) {
            mes = "Junho";
        } else if (b == 7) {
            mes = "Julho";
        } else if (b == 8) {
            mes = "Agosto";
        } else if (b == 9) {
            mes = "Setembro";
        } else if (b == 10) {
            mes = "Outubro";
        } else if (b == 11) {
            mes = "Novembro";
        } else if (b == 12) {
            mes = "Dezembro";
        } else {
            mes = "Inválido";
        }

        //System.out.println("O mes correspondente é:"+ b);
        return mes;
    }

    public static void main(String[] args) {
        String num = selecao();
        System.out.println("O mes é: "+num);
    }

}
