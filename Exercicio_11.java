package Selecao;


import java.util.Scanner;
public class Exercicio_11 {

	public static void main(String[] args) {
            try ( // TODO Auto-generated method stub
                    Scanner entrada = new Scanner(System.in)) {
                System.out.print("Em que turno você estuda? M-Matutino,V-vespertino,N-Noturno");
                String periodo = entrada.nextLine();
                String M = "M";
                String V = "V";
                
                
                if(periodo.equals(M))
                    System.out.println("Bom Dia");
                else if(periodo.equals(V))
                    System.out.println("Boa Tarde");
                else
                    System.out.println("Boa Noite");
            }
		
	}

}