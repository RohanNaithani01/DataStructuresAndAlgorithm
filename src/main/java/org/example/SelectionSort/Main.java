package org.example.SelectionSort;

public class Main {
    public static void selection_sort(int[] arr, int n){
        for(int i=0;i<=n-2;i++){
            int mini=i;
            for(int j =i;j<=n-1;j++){
                if(arr[j]<arr[mini]){
                    mini=j;
                }
            }
            int temp=arr[mini];
            arr[mini]=arr[i];
            arr[i]=temp;
        }

    }
    public static void main(String[] args) {
        int[] arr={13,46,24,52,20,9};
        int n=arr.length;

        selection_sort(arr,n);
        for(int i:arr){
            System.out.println(i);
        }

    }


}
