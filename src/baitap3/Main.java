package baitap3;

import java.util.Scanner;

public class Main {//Tính tổng các số chẵn trong khoảng cho trước

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhập vào vị trí bắt đầu và kết thúc");

        int start=sc.nextInt();//lấy giá trị bắt đầu
        int end=sc.nextInt();//lấy giá trị kết thúc
        int total=0;//tạo biến tổng
        for (int i = start; i < end; i++) {
            if (i%2==0){
                total+=i;
            }
        }
        System.out.println("tổng là:"+total);
    }
}
