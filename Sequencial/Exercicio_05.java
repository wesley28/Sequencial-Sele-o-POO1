package Sequencial;

import java.util.Scanner;

public class Exercicio_05 {

	public static void main(String[] args) {
            try ( // TODO Auto-generated method stub
                    Scanner input = new Scanner(System.in)) {
                System.out.print("Escreva uma medida em metros; ");
                float medida = input.nextFloat();
                System.out.println("A medida em centimetro e: "+(medida*100));
            }
		
	}

}