package baitap1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       //in ra số nguyên tố nhỏ hơn 100
        for (int i = 2; i < 100; i++) {
            boolean check = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println(i + "là số nt");
            }
        }

    }
}
