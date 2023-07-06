// Q1. Take values of length and breadth of a rectangle from user and check if it is square or not?

// import java.util.*;
// public class IfElseQ{
//     public static void main(String args[]){
//         int leng, brth;
//         Scanner sc =new Scanner(System.in);
//         System.out.print("Enter the length valures: ");
//         leng= sc.nextInt();

//         System.out.print("Enter the breadth value: ");
//         brth= sc.nextInt();

//         if(leng==brth){
//             System.out.println("It is square.");
//         }
//         else{
//             System.out.println("It is rectangle.");
//         }
//     }
// }

// Q2. Take two int values from the user and print greater among them. 

import java.util.*;
public class IfElseQ{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int a,b;
        System.out.print("Enter the first value: ");
        a = sc.nextInt();

        System.out.print("Enter the second value: ");
        b = sc.nextInt();

        if(a>b){
            System.out.println("a is greater then b.");
        }
        else{
          System.out.println("b is greater then a.");
        }
    }
}