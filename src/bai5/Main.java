package bai5;

public class Main {//Tìm số nguyên dương nhỏ nhất chia hết cho 5,7 và 11

    public static void main(String[] args) {
        //giá trị bắt đầu kiểm tra
        int number=11;
        while (true){
            if (number%5==0&&number%7==0&&number%11==0){
                System.out.println("số cần tìm là:"+number);
                break;
            }
            number++;
        }
    }
}
