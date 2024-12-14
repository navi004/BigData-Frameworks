//3. Program to check the given number is Palindrome or not

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int remainder,reversen = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number:\n");
        int n = input.nextInt();

        int originalnum = n;
        while(n!=0) {
            remainder = n%10;
            reversen = (reversen * 10) + remainder;
            n = n/10;
        }
        System.out.println("The original number is " + originalnum);
        System.out.println("The reversed number is "+reversen);
        if(originalnum == reversen) {
            System.out.println("The given number is a palindrome");
        }
        else {
            System.out.println("The given number is not a palindrome");
        }
    }
    
}


//output
/*
Enter the number:
121
The original number is 121
The reversed number is 121
The given number is a palindrome
*/
