import java.util.Scanner;
public class MethodPractice {

      // Girilen sayı 0 veya negatif olduğu yere kadar girilen sayıdan 5
      // rakamını çıkarın. Her çıkarma işlemi sırasında ekrana son değeri yazdırın.
      // Sayı negatif veya 0 olduktan sonra tekrar 5 ekleyin. Yine her ekleme işleminde sayının son değerini ekrana yazdırın.


   static void method() {
       Scanner input = new Scanner(System.in);
       System.out.println("Welcome...");
       System.out.println("Enter a number : ");
       int number = input.nextInt();
       int  firstnumber = number;
       for (int i = 0; i < 12; i++) {
           if (i < 6) {
               number -= 5;
           } else {
               number += 5;
           }
           System.out.println(number);
           }


           }



    public static void main(String[]args) {
       method();
   }











}
