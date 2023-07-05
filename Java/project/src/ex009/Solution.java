package ex009;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean stop = false;
        int cont = 1;
        while(stop != true){
            if (sc.hasNext()) {
                String input = sc.nextLine();
                System.out.println(cont + " " + input);
                cont++;
            } else {
                stop = true;
            }
        }

        sc.close();
    }
}
