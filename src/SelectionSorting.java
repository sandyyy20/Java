import java.util.*;
public class SelectionSorting {
    public static void printarray(int[]arr){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[]args){
        int arr[]={2,4,6,8,3,7,9};
        for(int i = 0;i<arr.length-1;i++){
            int smallest=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[smallest])
                    smallest =j;
                int temp = arr[smallest];
                arr[smallest]=arr[i];
                arr[i]=temp;
            }
        }
        printarray(arr);

    }
}
