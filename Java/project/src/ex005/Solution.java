package ex005;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] inteiros = new int[3];
        String[] palavras = new String[3];

        for(int i=0;i<3;i++) {
            palavras[i] = sc.next();
            inteiros[i] = sc.nextInt();
        }

        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            System.out.printf("%-15s", palavras[i]);
            System.out.printf("%03d\n", inteiros[i]);
        }
        System.out.println("================================");

        sc.close();
    }
}
