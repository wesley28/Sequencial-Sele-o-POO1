package Selecao;

import java.util.Scanner;
public class Exercicio_09 {

	public static void main(String[] args) {
            try ( // TODO Auto-generated method stub
                    Scanner entrada = new Scanner(System.in)) {
                System.out.print("Qual seu sexo?");
                String sexo = entrada.next();
                System.out.print("Qual sua altura?");
                float altura = entrada.nextFloat();
                System.out.println("Qual seu peso?");
                double peso = entrada.nextDouble();
                double pesoideal = 0;
                String masculino = "masculino";
                if (sexo.equals(masculino))
                    pesoideal = ((72.7*altura)- 58);
                else;
                pesoideal = ((62.1*altura) - 44.7);
                
                System.out.println("Sua altura é "+ altura);
                System.out.println("Seu peso é "+peso);
                System.out.println("Seu sexo é "+ sexo);
                System.out.println("Seu peso ideal é "+pesoideal);
                
                if (pesoideal>peso)
                    System.out.println("Voce esta abaixo do peso Ideal");
                
                else if(pesoideal<peso)
                    System.out.println("Voce esta acima do peso ideal");
                
                else
                    System.out.println("Voce esta no peso ideal ");
            }
		
		
		
			
	}

}