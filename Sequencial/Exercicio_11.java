package Sequencial;

import java.util.Scanner;

public class Exercicio_11 {

	public static void main(String[] args) {
            try ( // TODO Auto-generated method stub
                    Scanner entrada = new Scanner(System.in)) {
                System.out.print("Qual a sua altura? ");
                float altura = entrada.nextFloat();
                System.out.println("Seu peso ideal é " + ((altura*72.2)-58));
            }
	}

}