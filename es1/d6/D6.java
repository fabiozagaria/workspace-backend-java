package es1.d6;

import java.util.Scanner;

/*
Scrivere un'applicazione che chieda all'utente di inserire 3 numeri e poi visualizzi la somma,la media,il prodotto, il più piccolo ed il più grande di questi tre numeri
(La media per ora va bene se non restituisce un numero con la virgola)
*/

public class D6 {

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.print("x: \n");
    int valueX = sc.nextInt();

    System.out.print("y: \n");
    int valueY = sc.nextInt();

    System.out.print("z: \n");
    int valueZ = sc.nextInt();

    sc.close();

    int somma = valueX + valueY + valueZ;
    int average = somma / 3;
    int prodotto = valueX * valueY * valueZ;

    System.out.printf("La somma è %d\nLa media è %d\nIl prodotto è %d\n", somma, average, prodotto);

    int max = 0;
    
    if (valueX == valueY && valueZ == valueY) {
      System.out.println("Tutti i numeri interi uguali");
      return;
    } else if (valueX > valueY) {
      max = valueX;
    } else {
      max = valueY;
      
    } 

    if (max > valueZ) {
      if (max == valueX) {
          System.out.printf("X (%d) è il piu grande", max);
      } else {
          System.out.printf("Y (%d) è il piu grande", max);
      }
    } else {
      max = valueZ;
      System.out.printf("Z (%d) è il piu grande", max);
    }




  
  
}

}
