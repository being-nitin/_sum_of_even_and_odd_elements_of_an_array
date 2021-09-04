package com.nitincodes;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// java program to find the sum of even and odd elements of an array:
        Scanner sc = new Scanner(System.in);
        int arr1[] = new int[10];
        int sEven = 0;
        int sOdd = 0;
        for(int i=0;i< arr1.length;i++){
            arr1[i] = sc.nextInt();
        }
        for(int j=0;j< arr1.length;j++){
            if(arr1[j]%2==0){
                sEven = sEven +arr1[j];
            }
            else{
                sOdd = sOdd + arr1[j];
            }
        }
        System.out.println("Sum of even elements are " +sEven);
        System.out.println("Sum of even elements are " +sOdd);









    }
}
