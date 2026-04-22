package org.example.Hashing;

import java.util.Scanner;

public class DublicateNo {
    public static void main(String[] args) {
        int n;
        int mini=-10^9;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter n");
        n=scanner.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter Array");
        for(int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
            mini=Math.max(arr[i],mini);
        }
        int[] hash=new int[mini+1];
        for(int i=0;i<n;i++){
            hash[arr[i]]++;
        }
        System.out.println("Enter q");
        int q;
        q=scanner.nextInt();
        while(q>0){
            System.out.println("Enter num");
            int num;
            num=scanner.nextInt();
            if(num>mini){
                System.out.println(0);
            }
            else{
                System.out.println(hash[num]);
            }
            q--;
        }

    }
}
