package Selecao;

import java.util.Scanner;
public class Exercicio_20 {

	public static void main(String[] args) {
            try ( // TODO Auto-generated method stub
                    Scanner entrada = new Scanner(System.in)) {
                System.out.println("Digite o Ano");
                int ano = entrada.nextInt();
                
                if (((ano%4)==0)&&((ano%100)!=0))
                    System.out.println(ano+" é Bisexto");
                
                else
                    System.out.println(ano+ " não é Bisexto");
            }
				
	}

}