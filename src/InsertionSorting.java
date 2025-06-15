import java.util.*;
public class InsertionSorting {
    public static void printArray(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[]args){
        int[]arr={3,4,5,2,7,5,9};
        for(int i =0;i<arr.length;i++){
            int curr = arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>curr){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=curr;
        }
        printArray(arr);
    }
}
