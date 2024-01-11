package demo;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        //vòng lặp for dùng khi biết trước số lần lặp
//
//        //while/do while
//        int count = 0; //số lượng số chia hết cho 3
//        int number = 1;//giá trị cần kiểm tra
////        while (count<5){ //điều kiện để tiếp tục điều kiện
////            if(number%3==0){
////                System.out.println("số"+number);
////                count++;
////            }
////            number++;
////        }
//        do {
//            if (number % 3 == 0) {
//                System.out.println("số" + number);
//                count++;
//            }
//            number++;
//        } while (count < 5);

        // break :dừng và thoát vòng lặp
        //continue: bỏ qua và vào vong lặp kế tiếp
        // bài toán : nhập kí tự từ bàn phím v hiển thị các kí tự vừa nhập
//        while (true) {
//
//            System.out.println("nhập vào kí tự");
//            char kitu = new Scanner(System.in).nextLine().charAt(0);
//            System.out.println("số" + kitu);
//
//        }

        //Array

        //khai báo mảng
        int[] arrName = {1, 2, 3, 4, 5, 6};

        int[] newArr=addElement(arrName,7);

        int[] newArr2=removeElement(arrName,3);
        System.out.println("mangr moi"+Arrays.toString(newArr2));

        //bản chất của String là 1 char[]
        //khai báo theo độ dài
        int[] array = new int[10];//tất cả các phần tử trong mảng này sẽ mang giá trị mặc định
//        System.out.println(Arrays.toString(array));
        //truy cập và thay đổi giá trị theo idex
        array[3] = 100;

        //kiểm tra snt
    }

    //tạo hàm để kiểm tra số nguên tố
    public static boolean checkPrime(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return number >= 2;
    }
    //tạo ra các phương thức để
    //1.thêm mới một giá trị vào một mảng số nguyên và trả về mảng mới cần 2 tham số là mảng và giá trị cần thêm
    public static int[] addElement(int[]array,int number){
        int[] newArray= new int[array.length+1];
        for (int i = 0; i < array.length; i++) {
            newArray[i]=array[i];
        }
        newArray[newArray.length-1]=number;
        return newArray;
    }
    //2.xóa một phần tử tại một vị trí chỉ định
    public static int[] removeElement(int[]array,int index){
        int[] newArr=new int[array.length-1];
        for (int i = 0; i < array.length; i++) {
            if (i==index){
                continue;
            }
            if(i<index){
                newArr[i]=array[i];
            }
            if (i>index){
                newArr[i-1]=array[i];
            }
        }
        return newArr;
    }
}
