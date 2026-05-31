package es1.d8;

import java.util.Scanner;

/*
Scrivere un'applicazione che legge due numeri interi e ne determini se il primo è multiplo del secondo (Suggerimento: usare l'operatore modulo)
*/

public class D8 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("x: ");
    int valueX = sc.nextInt();

    System.out.println("y: ");
    int valueY = sc.nextInt();
    
    if (valueX == valueY) {
      System.out.println("Numeri uguali");
      return;
    }

    if (valueX % valueY == 0) {
      System.out.println("X è multiplo di Y");
    } else {
      System.out.println("X NON è multiplo di Y");
    }
  }
  
}
