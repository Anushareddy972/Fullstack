package com.Fullstack.basics;

import java.util.Scanner;

public class GeneratePrime {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lb ");
        int lb = sc.nextInt();
        System.out.println("Enter the ub ");
        int ub = sc.nextInt();
        for(int i=lb;i<=ub;i++)
        {
            System.out.println(isPrime(i));
        }

    }

    public static int isPrime(int n)
    {
        int count=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
                count++;

        }
        if(count==2)
        {
            System.out.println(n+" "+"is a prime number");
        }
        else{
            System.out.println(n+" "+"is not a prime number");
        }
        System.out.println("JAVA");
        return n;
    }
}

