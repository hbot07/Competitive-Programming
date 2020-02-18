//Problem Statement: You are developing a smartphone app. You have a list of potential customers for your app.
//Each customer has a budget and will buy the app at your declared price if and only if the price is less than or equal to the customer's budget.
//You want to fix a price so that the revenue you earn from the app is maximized. Find this maximum possible revenue.
//For instance, suppose you have 4 potential customers and their budgets are 30, 20, 53 and 14.
//In this case, the maximum revenue you can get is 60.
//https://www.codechef.com/ZCOPRAC/problems/ZCO14003
import java.util.Scanner;
import java.util.Arrays;
public class ZCO14003 {

    public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();//the total number of potential customers
            long arr[]=new long[n];//array to store budgets
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextLong();
            }
            Arrays.sort(arr);
            long max=-1;
            for(int i=0;i<arr.length;i++)
            {
                if((arr[i]*(arr.length-i))>max) {
                    max=arr[i]*(arr.length-i);
                }
            }
            System.out.print(max);
        }
}

