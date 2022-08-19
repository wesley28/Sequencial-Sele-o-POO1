package Sequencial;

import java.util.Scanner;
public class Exercicio_06 {

	public static void main(String[] args) {
            try ( // TODO Auto-generated method stub
                    Scanner input = new Scanner(System.in)) {
                System.out.print("Digite um raio: ");
                float raio = input.nextFloat();
                System.out.println("A Area e; "+((raio*raio)*3.14));
            }
	}
}

