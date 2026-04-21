package org.example.Arrays;

public class reverseArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};

        int left=0;
        int right=arr.length-1;

        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;

            left++;
            right--;
        }


//
//        int n=arr.length;
//        for(int i=0;i<arr.length/2;i++){
//            arr[i]=arr[i]+arr[n-1-i];
//            arr[n-1-i]=arr[i]-arr[n-1-i];
//            arr[i]=arr[i]-arr[n-1-i];
//        }
        for (int i:arr){
            System.out.print(i);
        }

    }


}
