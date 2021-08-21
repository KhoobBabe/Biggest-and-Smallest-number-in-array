package com.khubaib;


import java.util.Scanner;
import java.util.Arrays;

public class LargSmol {

    public static void main(String[] args) {

        //Declaring the input variable
        Scanner input = new Scanner(System.in);

        //asking th euser how many elements they want to add
        System.out.println("How many element sdo u want in the array");
        int total = input.nextInt();

        //declaring the array
        int array[] = new int [total];

        //adding inputs in array
        for (int i = 0 ; i < total; i++ ){

            System.out.print("Enter the number in the array: ");
            array[i] = input.nextInt();

        }


        //sorting the array in ascending order
        Arrays.sort(array);

        System.out.println();
        //printing the smolest and the largest number in the array
        System.out.println("The smallest number in array: " + array[0]);
        System.out.println("The largest number in array: " + array[(array.length-1)]);

    }

}

