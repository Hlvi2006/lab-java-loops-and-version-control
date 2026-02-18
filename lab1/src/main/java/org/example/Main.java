package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] arr={12,5,7,8,9,1};
        double[] arr1={12,2,4,9};
        System.out.println(calc_difference(arr));
        finding_smalls(arr1);
        expression(2,4);
    }
    public static int calc_difference(int[] arr){
        int smallest=arr[0];
        int largest=arr[0];
        for(int i=1;i<arr.length;i++){
            if(smallest>arr[i]){
                smallest=arr[i];
            }
            if(largest<arr[i]){
                largest=arr[i];
            }
        }
        return largest-smallest;
    }
    public static void finding_smalls(double[] arr){
        double smallest=arr[0];
        double secsmallest=arr[0];
        for(int i=0;i<arr.length;i++){
            if(smallest>arr[i]){
                smallest=arr[i];
            }
        }
        if(smallest==arr[0]){
            secsmallest=arr[1];
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==smallest){
                continue;
            }
            else{
                if(secsmallest>arr[i]){
                    secsmallest=arr[i];
                }
            }
        }
        System.out.println(smallest);
        System.out.println(secsmallest);
    }
    public static void expression(double x,double y){
        System.out.println(x*x+(4*y/5-x)*(4*y/5-x));
    }
}