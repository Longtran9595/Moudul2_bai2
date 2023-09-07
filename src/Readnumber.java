import java.util.Scanner;

public class Readnumber {
    private static final String[] ones = {
            "", "One", "Two", "Three", "Four", "Five",
            "Six", "Seven", "Eight", "Nine", "Ten",
            "Eleven", "Twelve", "Thirteen", "Fourteen",
            "Fifteen", "Sixteen", "Seventeen", "Eighteen",
            "Nineteen"
    };

    private static final String[] tens = {
            "", "", "Twenty", "Thirty", "Forty", "Fifty",
            "Sixty", "Seventy", "Eighty", "Ninety"
    };

    public static String convertToWords(int number) {
        if (number < 0 || number > 9999) {
            return "Invalid input";
        }

        if (number == 0) {
            return "Zero";
        }

        String result = "";

        if ((number / 1000) > 0) {
            result += ones[number / 1000] + " Thousand ";
            number %= 1000;
        }

        if ((number / 100) > 0) {
            result += ones[number / 100] + " Hundred ";
            number %= 100;
        }

        if (number > 0) {
            if (number < 20) {
                result += ones[number];
            } else {
                result += tens[number / 10];
                if (number % 10 > 0) {
                    result += "-" + ones[number % 10];
                }
            }
        }

        return result.trim();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số cần đọc: ");
        int number = scanner.nextInt();
        String words = convertToWords(number);
        System.out.println("Số " + number + " đọc thành chữ: " + words);
    }
}
