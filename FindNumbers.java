package Letcode;

import java.util.Scanner;

public class FindNumbers {
    public static void main(String[] args) {
        int age;
        int sayac=0;
        int total=0;
        Scanner sc=new Scanner((System.in));
        System.out.println("Sayı Giriniz : ");
        age=sc.nextInt();
        System.out.println("Sayılar: ");
         for(int i=1; i<age; i++){
             if(i%3==0 && i%4==0){
                 sayac++;
                 total+=i;
                 System.out.print(i + " ");

             }

         }
         double avarage=(total/sayac);
        System.out.println("Sayıların Ortalaması : "+ avarage);
    }
}
