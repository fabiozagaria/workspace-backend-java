package es1.d9;

/*
Scrivere un'applicazione che visualizzi una scacchiera così:
* * * * * * * *
 * * * * * * * *
* * * * * * * *
 * * * * * * * *
* * * * * * * *
 * * * * * * * *
* * * * * * * *
 * * * * * * * *
*/

public class D9 {
  public static void main(String[] args) {
    

      for (int i = 1; i <= 8; i++) {
        if (i % 2 == 0) System.out.print(" ");
        System.out.print("* ");

        for (int j = 1; j <= 7; j++) {
          System.out.print("* ");
          if(j == 7) System.out.print("\n");
        }

      }
  }

      
    
}
