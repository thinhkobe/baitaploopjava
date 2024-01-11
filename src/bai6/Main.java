package bai6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập lựa chọn");
        while (true){
            System.out.println("nhập 1 để kiểm tra số chẵn lẻ");
            System.out.println("nhập 2 để kiểm tra số nguyên tố");
            System.out.println("nhập 3 để kiểm tra số có chia hết cho 3 ha không");
            System.out.println("nhập 4 để thoát");
            int choice=sc.nextInt();

            switch (choice){
                case 1:
                    System.out.println("nhập số cần kiểm tra");
                    int numberA =sc.nextInt();
                    if(numberA%2==0){
                        System.out.println(numberA+"là số chẵn");
                    }else{
                        System.out.println(numberA+"là số lẻ");
                    }
                    break;
                case 2:
                    System.out.println("nhập số cần kiểm tra");
                    int numberB =sc.nextInt();
                   if (numberB<2){
                       System.out.println(numberB+"không phải số nguyên tố");
                   }else {
                       for (int i = 2; i <Math.sqrt(numberB) ; i++) {
                            if (numberB%i==0){
                                System.out.println(numberB+"không phải số nguyên tố");

                            }else {
                                System.out.println(numberB+"là số nguyên tố");

                            }
                       }
                   }
                    break;
                case 3:
                    System.out.println("nhập số cần kiểm tra");
                    int numberC =sc.nextInt();
                    if(numberC%3==0){
                        System.out.println(numberC+"chia hết cho 3");
                    }else{
                        System.out.println(numberC+" không chia hết cho 3");

                    }
                    break;
                case 4:System.exit(0);
                default:
                    System.out.println("nhập lại lựa chọn");
                    choice=sc.nextInt();
            }
        }
    }
}
