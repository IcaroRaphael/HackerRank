package ex003;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        if(N >= 1 && N <= 100){
            if(N % 2 != 0){
                System.out.println("Weird");
            }
            else{
                if(N >= 2 && N <= 5){
                    System.out.println("Not Weird");
                }
                if(N >= 6 && N <= 20){
                    System.out.println("Weird");
                }
                if(N > 20){
                    System.out.println("Not Weird");
                }
            }
        }

        sc.close();
    }
}
