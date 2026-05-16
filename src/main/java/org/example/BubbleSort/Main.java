package org.example.BubbleSort;

public class Main {
    public static void bubblesort(int[] arr, int n){
        for(int i=n-1;i>=0;i--){
            int didswap=0;
            for(int j=0;j<=i-1;j++){
                if(arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    didswap=1;
                }

            }
            if(didswap==0){
                break;
            }
            System.out.println("run");
        }
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int n=arr.length;

        bubblesort(arr,n);
        for(int i:arr){
            System.out.println(i);
        }
    }
}
