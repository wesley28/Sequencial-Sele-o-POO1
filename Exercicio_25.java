package Selecao;

import java.util.Scanner;
public class Exercicio_25 {

	public static void main(String[] args) {
            try ( // TODO Auto-generated method stub
                    Scanner entrada = new Scanner(System.in)) {
                System.out.print("Digite um Numero");
                int numero = entrada.nextInt();
                if ((numero%2)==0)
                    System.out.println("Par");
                else
                    System.out.println("Impar");
            }

	}

}