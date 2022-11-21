package first;

import java.util.Scanner;

public class muksayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number:");
        int n = input.nextInt();

        int sum=0;
        for(int i=1; i<=n;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        if(n==sum-n){
            System.out.println(n+" is a perfect number.");
        }else {
            System.out.println(n+" is not a perfect number.");
        }
    }
}
