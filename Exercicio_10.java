package Selecao;

import java.util.Scanner;
public class Exercicio_10{

	public static void main(String[] args) {
            try ( // TODO Auto-generated method stub
                    Scanner entrada = new Scanner(System.in)) {
                System.out.print("Digite o primeiro numero");
                int num1 = entrada.nextInt();
                System.out.print("Digite o segundo numero");
                int num2 = entrada.nextInt();
                System.out.print("Digite o Terceiro numero");
                int num3 = entrada.nextInt();
                int menor = 0;
                int maior = 0;
                
                
                if ((num1<num2)&&(num1<num3))
                    menor = num1;
                
                else if ((num1>num2)&&(num1>num3))
                    maior = num1;
                
                if ((num2<num1)&&(num2<num3))
                    menor = num2;
                
                else if ((num2>num1)&&(num2>num3))
                    maior = num2;
                
                if ((num3<num1)&&(num3<num2))
                    menor = num3;
                
                else if ((num3>num1)&&(num3>num2))
                    maior = num3;
                
                System.out.println("O menor é "+menor);
                System.out.println("O maior é "+maior);
            }

	}

}