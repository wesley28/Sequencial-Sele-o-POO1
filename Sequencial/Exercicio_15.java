package Sequencial;

import java.util.Scanner;
public class Exercicio_15 {

	public static void main(String[] args) {
            try ( // TODO Auto-generated method stub
                    Scanner entrada = new Scanner(System.in)) {
                System.out.print("Qual a Área em metros quadrados a ser pintada?");
                float area = entrada.nextFloat();
                float latas = (area/3)/18;
                double custo = (latas*80);
                System.out.println("O Valor de latas a serem compradas é "+ latas);
                System.out.println("O Custo da latas é "+ custo);
            }
	}

}