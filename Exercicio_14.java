package Selecao;

import java.util.Scanner;
public class Exercicio_14 {

	public static void main(String[] args) {
            try ( // TODO Auto-generated method stub
                    Scanner entrada = new Scanner(System.in)) {
                System.out.print("Digite o Numero do Dia da Semana?");
                int numero = entrada.nextInt();
                
                if(numero==1)
                    System.out.println("Domingo");
                else if(numero==2)
                    System.out.println("Segunda");
                else if (numero==3)
                    System.out.println("Terça");
                else if (numero==4)
                    System.out.println("Quarta");
                else if (numero==5)
                    System.out.println("Quinta");
                else if (numero==6)
                    System.out.println("Sexta");
                else if (numero==7)
                    System.out.println("Sabado");
                else
                    System.out.println("ERRO! Numero invalido");
            }
		

}
}