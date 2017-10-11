package com.company;
import java.io.*;
import java.util.*;


public class Main {

    public static void main(String[] args) {

        Scanner kbin = new Scanner(System.in);

        System.out.println("Enter something like 8+33+1345+137");
        String s = kbin.nextLine();

        Scanner sc = new Scanner(s);


        sc.useDelimiter("\\s*\\-\\s*");
        sc.useDelimiter("\\s*\\+\\s*");


        int sum = 0;
        while(sc.hasNextInt()){

            sum-=sc.nextInt();
boolean b;
            if(b = s.startsWith("-")){

                sum -=sc.nextInt();
            }
            else if(sc.hasNextInt()){
                sum-=sc.nextInt();
            }

        }

        System.out.println("Sum is: "+ sum);





    }
}
