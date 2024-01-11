package bai7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (true){
            System.out.println("1,Tính chu vi và diện tích hình chữ nhật .\n" +
                    "2.Tính chu vi và diện tích hình tam giác\n" +
                    "3.Tính chu vi và diện tích hình tròn.\n" +
                    "4.Thoát\n");
            int choice=sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("nhập chiều rộng và chiều cao hình chữ nhật");
                    float height=sc.nextFloat();
                    float width=sc.nextFloat();
                    float chuvi=(height+width)*2;
                    float dientich=height*width;
                    System.out.println("chu vi ="+chuvi+"\ndien tich="+dientich);
                    break;
                case 2:
                System.out.println("nhập 3 cạnh của tam giác");
                float a=sc.nextFloat();
                float b=sc.nextFloat();
                float c=sc.nextFloat();
                float chuvitamgiac = a+b+c;
                float p=chuvitamgiac/2;
                float dientichtamgiac= (float) Math.sqrt(p*(p-a)*(p-b)*(p-c));
                    System.out.println("chu vi ="+chuvitamgiac+"\ndien tich="+dientichtamgiac);

                    break;
                case 3:
                System.out.println("nhập bán kính hình tròn");
                float bankinh=sc.nextFloat();
                float chuvihinhtron= (float) (bankinh*2*3.14);
                float dientichhinhtron=(float) (3.14*Math.pow(bankinh,2));
                    System.out.println("chuvihinhtron ="+chuvihinhtron+"\ndientichhinhtron="+dientichhinhtron);

                    break;
                case 4:System.exit(0);
            }
        }
    }
}
