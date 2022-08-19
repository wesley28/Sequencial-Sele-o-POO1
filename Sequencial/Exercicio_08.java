package Sequencial;

import java.util.Scanner;
public class Exercicio_08 {

	public static void main(String[] args) {
		
            try (Scanner entrada = new Scanner(System.in)) {
                System.out.println("quanto voce ganha por hora? ");
                float valor = entrada.nextFloat();
                System.out.println("quantas horas voce trabalha por mes? ");
                float horas=entrada.nextFloat();
                System.out.println("Seu salario mensal e de: "+(valor*horas));
            }

	}

}