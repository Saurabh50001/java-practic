// // Q1. Take values of length and breadth of a rectangle from user and check if it is square or not?

// import java.util.*;
// public class IfElseQ{
//     public static void main(String[] args){
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

// // Q2. Take two int values from the user and print greater among them. 

// import java.util.*;
// public class IfElseQ{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         int a,b;
//         System.out.print("Enter the first value: ");
//         a = sc.nextInt();

//         System.out.print("Enter the second value: ");
//         b = sc.nextInt();

//         if(a>b){
//             System.out.println("a is greater then b.");
//         }
//         else{
//           System.out.println("b is greater then a.");
//         }
//     }
// }

// // Q3. A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
// //     Ask user for quantity
// //     Suppose, a unit will cost 100.
// //     judge and print total cost for user.

// import java.util.*;
// public class IfElseQ{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int ut, disc,cost;
//         System.out.print("Enter the quantity");
//         ut = sc.nextInt();
//         cost = ut * 100;  // one unit cost will 100.

//         if(cost>1000){
//             disc = cost * 10/100;
//             cost = cost-disc;

//             System.out.println("The total cost for user: " + cost);
//         }
//         else{
//             System.out.println("The total cost for user: " + cost);
//         }
//     }
// }

// Q4. A company decided to give bonus of 5% to employee if his/her year of service is more than 5 year. Ask user for their salary and year of service and print net bonus amount?

import java.util.*;

public class IfElseQ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sal, yr, bn;
        System.out.print("Enter the salary: ");
        sal = sc.nextInt();
        System.out.print("Enter the year of services: ");
        yr = sc.nextInt();

        if(yr>5){
            bn = sal*5/100;
            System.out.println("the net bonus amount is : " + bn);
        }
        else{
            System.out.println("No bonus");
        }
    }
}