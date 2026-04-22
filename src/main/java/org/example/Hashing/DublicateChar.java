package org.example.Hashing;

import java.util.Scanner;

public class DublicateChar {
    public static void main(String[] args) {
        int n;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter n");
        n=scanner.nextInt();
        int[] hash=new int[26];
        char[] arr=new char[n];
        System.out.println("Enter array");
        for (int i=0;i<n;i++) {
            arr[i] = scanner.next().charAt(0);
            hash[arr[i]-97]++;
        }
        System.out.println("Enter q");
        int q;
        q=scanner.nextInt();
        while(q>0){
            System.out.println("Enter num");
            char num;
            num=scanner.next().charAt(0);
                System.out.println(hash[num-'a']);
            q--;
        }
    }
}
