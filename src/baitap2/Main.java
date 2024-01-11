package baitap2;

import java.util.Scanner;

public class Main {
    // bài tập hiển thị các hình
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("nhập 1 để in ra hình chũ nhật");
            System.out.println("nhập 2 để in ra tam giác vông");
            System.out.println("nhập 3 để in ra tam giác cân");
            int choies = sc.nextInt();
            switch (choies) {
                case 1:
                    int chieuDai = 5;  // Độ dài của hình chữ nhật
                    int chieuRong = 3;  // Độ rộng của hình chữ nhật

                    // Vòng lặp để in ra hình chữ nhật
                    for (int i = 0; i < chieuRong; i++) {
                        for (int j = 0; j < chieuDai; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();  // Xuống dòng sau khi in một hàng
                    }
                    break;
                case 2:
                    System.out.println("nhập 1 để in ra tam giác vuông ở góc Trên cùng bên trái");
                    System.out.println("nhập 2 để in ra tam giác vuông ở góc Trên cùng bên phải");
                    System.out.println("nhập 3 để in ra tam giác vuông ở góc Dưới cùng bên trái");
                    System.out.println("nhập 4 để in ra tam giác vuông ở góc Dưới cùng bên phải");
                    int choie = sc.nextInt();
                    switch (choie) {
                        case 1:
                            // Vòng lặp để in ra tam giác vuông ở góc Trên cùng bên trái
                            for (int i = 0; i < 4; i++) {
                                for (int j = 4 - i; j > 0; j--) {
                                    System.out.print("* ");
                                }
                                System.out.println();  // Xuống dòng sau khi in một hàng
                            }
                            break;
                        case 2:
                            // Vòng lặp để in ra tam giác vuông ở góc Trên cùng bên phải
                            for (int i = 0; i < 4; i++) {
                                for (int j =0; j <i; j++) {
                                    System.out.print(" ");
                                }
                                for (int k = 4 - i; k > 0; k--) {
                                    System.out.print("*");
                                }
                                System.out.println();  // Xuống dòng sau khi in một hàng
                            }
                            break;
                        case 3:
                            // Vòng lặp để in ra tam giác vuông ở góC dưới  cùng bên trái
                            for (int i = 0; i < 4; i++) {
                                for (int j =0; j <i+1; j++) {
                                    System.out.print("*");
                                }

                                System.out.println();  // Xuống dòng sau khi in một hàng
                            }
                            break;
                        case 4:
                            // Vòng lặp để in ra tam giác vuông ở góC dưới  cùng bên phair
                            for (int i = 0; i < 4; i++) {
                                for (int j =4-i; j <i; j--) {
                                    System.out.print(" ");
                                }
                                for (int k = 4 - i; k > 0; k--) {
                                    System.out.print("*");
                                }
                                System.out.println();  // Xuống dòng sau khi in một hàng
                            }
                            break;
                    }

                    break;
                case 3:
                    //in ra tam giác vuông CÂN

                    break;
                case 4:
                    System.exit(0);
            }
        }
    }
}
