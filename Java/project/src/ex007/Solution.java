package ex007;

import java.util.Scanner;

public class Solution {
    public static void main(String []argh){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();

            double incremento = a;
            for(int j = 0; j < n; j++){
                incremento += Math.pow(2, j) * b;
                System.out.printf("%.0f ", incremento);
            }
            System.out.println();
        }
        sc.close();
    }
}