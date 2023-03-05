// Задача 1
package java_projects;

import java.util.Scanner;

/**
 * program
 */
public class les1{
    
        public static void main(String[] args) {
            Scanner n = new Scanner(System.in);
            int number = n.nextInt();
            int factorial = number;
            int sum = number;
            for(int i = (number -1 ); i > 0; i--) {
                factorial = factorial * i;
                sum = sum  + i;
            } 
            System.out.println("n! : " + factorial);
            System.out.println("Треугольное число  : " + sum);
            n.close();
         }
      }
