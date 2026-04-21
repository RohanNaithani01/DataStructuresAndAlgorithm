package org.example.Arrays;

public class MinimumElement {
    public static void main(String[] args) {
        int[] arr={7,2,8,5,1};

        int min=arr[0];
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println("Min no is: "+min);
        System.out.println("Max no is: "+max);
    }
}
