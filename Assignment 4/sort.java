// Q5. Write a java program to create a method that reorders the digits of each numerical 
// element in an array based on ascending (asc) or descending (desc) order.

// Examples
// reorderDigits([515, 341, 98, 44, 211], "asc") ➞ [155, 134, 89, 44, 112]
// reorderDigits([515, 341, 98, 44, 211], "desc") ➞ [551, 431, 98, 44, 211]
// reorderDigits([63251, 78221], "asc") ➞ [12356, 12278]
// reorderDigits([63251, 78221], "desc") ➞ [65321, 87221]
// reorderDigits([1, 2, 3, 4], "asc") ➞ [1, 2, 3, 4]
// reorderDigits([1, 2, 3, 4], "desc") ➞ [1, 2, 3, 4]

// Notes
// • Single-digit numbers should be ordered the same regardless of direction.
// • Numbers in the array should be kept the same order.

import java.util.*;
public class sort{
    static void reverseArray(char arr[]){
        int start = 0;
        int end = arr.length - 1;
        while (start < end){
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    static int[] calculate(int arr[], String order){
        for(int i=0;i<arr.length;i++){
            String s = Integer.toString(arr[i]);
            char digits[] = s.toCharArray();
            if(order.equalsIgnoreCase("asc")){
                Arrays.sort(digits);
            }
            else if(order.equalsIgnoreCase("desc")){
                Arrays.sort(digits);
                reverseArray(digits);
            }
            String sorted = new String(digits);
            arr[i] = Integer.parseInt(sorted);
        }
        return arr;
    }
    static void display(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n=sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements:");
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        System.out.print("Enter asc for Ascending and desc for descending: ");
        String order=sc.next();
        arr = calculate(arr,order);
        display(arr);
        sc.close();
    }
}
