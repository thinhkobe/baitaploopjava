package bai4;

public class Main {
    public static void main(String[] args) {
        //tạo biến đếm
        int count=0;
        int number=3;//số cần kiểm tra
        while (count<20){
                boolean check = true;
                for (int j = 2; j <= Math.sqrt(number); j++) {
                    if (number % j == 0) {
                        check = false;
                        break;
                    }
                }
                if (check) {
                    System.out.println( number+ "là số nt");
                    count++;
                }

            number++;
        }
    }
}
