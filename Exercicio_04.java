package Selecao;

import java.util.Scanner;
public class Exercicio_04 {

	public static void main(String[] args) {
            try ( // TODO Auto-generated method stub
                    Scanner entrada = new Scanner(System.in)) {
                System.out.print("Digite um ano com 4 digitos");
                int ano = entrada.nextInt();
                
                if ((ano>999)&&(ano<10000))
                    
                    if ((((ano%4)==0)||(ano%400)==0)&&((ano%100)!=0))
                        System.out.println("Este ano é bissexto");
                    else
                        System.out.println("Este ano não é bissexto");
                else
                    System.out.println("ERRO! Voce digitou um numero que não possui 4 digitos");
            }
	}
	

}