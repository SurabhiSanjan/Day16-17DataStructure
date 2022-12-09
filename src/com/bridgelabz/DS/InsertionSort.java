package com.bridgelabz.DS;
public class InsertionSort {

    public int[] sort(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            arr = insertionSort(arr,i);
        }
        return arr;
    }

    private int[] insertionSort(int arr[],int i)
    {
        if(i == 0)
            return arr;
        if(arr[i] < arr[i-1])
        {
            int temp = arr[i];
            arr[i] = arr[i-1];
            arr[i-1] = temp;
        }
        return insertionSort(arr,i-1);
    }

    public static void main(String[] args) {

        int arr[] = {22, 55, 66, 88, 99, 77};

        InsertionSort in = new InsertionSort();
        arr = in.sort(arr);

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + "  ");
        }

    }

}
