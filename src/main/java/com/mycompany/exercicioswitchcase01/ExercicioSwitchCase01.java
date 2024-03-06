package com.mycompany.exercicioswitchcase01;

import java.util.Scanner;

public class ExercicioSwitchCase01 {

    public static void main(String[] args) {
       
      Scanner teclado = new Scanner(System.in);   

      int a;
      
        System.out.println("TONY: Jarvis, costure um 'terno armadura' para daqui alguns meses, por favor.\n");
        System.out.println("JARVIS: Senhor, o terno seria para o verão, inverno, ou alguma outra estação?\n");
        System.out.println("TONY: Hmmmm, deixe me ver...\n");
       
        System.out.println(""" 
                           JARVIS: Senhor, as opções:
                           
                           Opção 1 | Terno Cinza  | Inverno
                           Opção 2 | Terno Marrom | Outono
                           Opção 3 | Terno Preto  | Verão
                           Opção 4 | Terno Branco | Primavera
                           """);
      
      a = teclado.nextInt();
      
      switch (a) {
        case 1 -> System.out.println("\nJARVIS: Certo senhor, irei construir um terno de Inverno.");
        case 2 -> System.out.println("\nJARVIS: Certo senhor, irei construir um terno de Outono.");
        case 3 -> System.out.println("\nJARVIS: Certo senhor, irei construir um terno de Verão.");
        case 4 -> System.out.println("\nJARVIS: Certo senhor, irei construir um terno de Primavera.");
        default -> System.out.println("\nJARVIS: Essa não é uma opção, senhor.");
        }
    }
}
