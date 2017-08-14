package com.company;

public class Lab15 {
    public static void main ( String[] args){
        for (int i = 1; i < 12; i++){ //Количесво строк
            for (int j = 10; j > 0; j--){//Количество столбцов
                if (j < i) {
                    System.out.print(j + " ");
                }
            }
            System.out.println(" ");
        }
    }
}
   // Write a program to produce on console the following : 1 2 1 3 2 1 4 3 2 1 5 4 3 2 1 6 5 4 3 2 1 7 6 5 4 3 2 1 8 7 6 5 4 3 2 1