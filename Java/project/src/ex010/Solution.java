package ex010;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            int breadth = sc.nextInt();
            int height = sc.nextInt();

            System.out.println(area(breadth, height));
        }
        catch (Exception e){
            System.out.println("java.lang.Exception: " + e.getMessage());
        }
        sc.close();
    }

    public static int area(int breadth, int height) throws Exception {
        if(breadth > 0 && height > 0){
            return breadth * height;
        }
        else {
            throw new Exception("Breadth and height must be positive");
        }
    }
}
