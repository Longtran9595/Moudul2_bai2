import java.util.Scanner;

public class First20primeNumber {
    public static void main(String[] args) {
        int count = 0;  // Đếm số lượng số nguyên tố đã tìm thấy
        int number = 2; // Số nguyên dương đầu tiên

        System.out.println("20 số nguyên tố đầu tiên là:");

        while (count < 20) {
            boolean isPrime = true; // Mặc định là số nguyên tố

            // Kiểm tra xem number có phải số nguyên tố hay không
            int i = 2;
            while (i <= number / 2) {
                if (number % i == 0) {
                    isPrime = false;
                    break; // Không cần kiểm tra tiếp nữa nếu không phải số nguyên tố
                }
                i++;
            }

            if (isPrime) {
                System.out.print(number + " ");
                count++;
            }
            number++;
        }
    }
}

