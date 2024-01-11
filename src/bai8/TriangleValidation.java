package bai8;

import java.util.Scanner;

public class TriangleValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double side1, side2, side3;

        while (true) {
            System.out.println("Nhập vào độ dài 3 cạnh của tam giác:");
            System.out.print("Cạnh 1: ");
            side1 = scanner.nextDouble();
            System.out.print("Cạnh 2: ");
            side2 = scanner.nextDouble();
            System.out.print("Cạnh 3: ");
            side3 = scanner.nextDouble();

            if (isValidTriangle(side1, side2, side3)) {
                double perimeter = calculatePerimeter(side1, side2, side3);
                double area = calculateArea(side1, side2, side3);

                System.out.println("Chu vi tam giác là: " + perimeter);
                System.out.println("Diện tích tam giác là: " + area);

                break; // Dừng vòng lặp khi nhập dữ liệu hợp lệ
            } else {
                System.out.println("Không thoả mãn điều kiện của tam giác. Vui lòng nhập lại.");
            }
        }
    }

    // Hàm kiểm tra điều kiện của tam giác
    public static boolean isValidTriangle(double side1, double side2, double side3) {
        return (side1 > 0 && side2 > 0 && side3 > 0) && (side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1);
    }

    // Hàm tính chu vi tam giác
    public static double calculatePerimeter(double side1, double side2, double side3) {
        return side1 + side2 + side3;
    }

    // Hàm tính diện tích tam giác theo công thức Heron
    public static double calculateArea(double side1, double side2, double side3) {
        double s = calculatePerimeter(side1, side2, side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
}
