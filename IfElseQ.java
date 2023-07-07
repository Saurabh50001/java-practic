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

// // Q4. A company decided to give bonus of 5% to employee if his/her year of service is more than 5 year. Ask user for their salary and year of service and print net bonus amount?

// import java.util.*;

// public class IfElseQ {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int sal, yr, bn;
//         System.out.print("Enter the salary: ");
//         sal = sc.nextInt();
//         System.out.print("Enter the year of services: ");
//         yr = sc.nextInt();

//         if(yr>5){
//             bn = sal*5/100;
//             System.out.println("the net bonus amount is : " + bn);
//         }
//         else{
//             System.out.println("No bonus");
//         }
//     }
// }

// // Q5. A school has following rules for grading system:
// //     a. Below 25 - F
// //     b. 25 to 45 - E
// //     c. 45 to 50 - D
// //     d. 50 to 60 - C
// //     e. 60 to 80 - B
// //     f. Above 80 - A
// //     Ask user to enter marks and print the corresponding grade.

// import java.util.*;
// public class IfElseQ{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int mark;
//         System.out.print("Enter the marks: ");
//         mark = sc.nextInt();

//         if(mark<25){
//             System.out.println("Grade of user is: F");
//         }
//         else if(mark>=25 && mark<45){
//             System.out.println("Grade of user is: E");
//         }
//         else if(mark>=45 && mark<50){
//             System.out.println("Grade of user is: D");
//         }
//         else if(mark>=50 && mark<60){
//             System.out.println("Grade of user is: C");
//         }
//         else if(mark>=60 && mark<80){
//             System.out.println("Grade of user is: B");
//         }
//         else if(mark>=80 && mark<=100){
//             System.out.println("Grade of user is: A");
//         }
//         else{
//             System.out.println("write correct input");
//         }
//     }
// }

// Q6. Take input of age of 3 people by user and determine oldest and youngest among them.

import java.util.*;
public class IfElseQ{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x,y,z;
        System.out.println("Enter the age of People: ");
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();

        if(x>=y && x>=z){
            System.out.println("X is oldest people");
        }
        else if(y>=x && y>=z){
            System.out.println("Y is oldest people");
        }
        else if(z>=x && z>=y){
            System.out.println("Z is oldest people");
        }
        else{
            System.out.println("nothing");
        }
    }
}