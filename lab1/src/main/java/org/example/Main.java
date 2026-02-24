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
        double smallest=Double.MAX_VALUE;
        double secsmallest=Double.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(smallest>arr[i]){
                secsmallest=smallest;
                smallest=arr[i];
            }
            else if(secsmallest>arr[i] && arr[i]!=smallest){
                secsmallest=arr[i];
            }
        }
        if(secsmallest==Double.MAX_VALUE){
            System.out.println("Small and second small are the same.");
            secsmallest=smallest;
        }

        System.out.println(smallest);
        System.out.println(secsmallest);
    }
    public static void expression(double x,double y){
        System.out.println(Math.pow(x,2)+Math.pow((4*y/5-x),2));
    }
}