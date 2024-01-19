package BaiTap;

import java.util.Scanner;

public class Ex14 {
}

class countWordLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi");
        String string = sc.nextLine();
        System.out.println("Nhập độ dài");
        int length = sc.nextInt();
        System.out.println("Số từ có độ dài lớn hơn "+ length+ " là "+lengthCount(string, length));
    }

    private static int lengthCount(String input, int minLength) {
        String[] words = input.split("\\s+");

        int count = 0;

        // Đếm số từ có độ dài lớn hơn hoặc bằng giá trị cho trước
        for (String word : words) {
            if (word.length() >= minLength) {
                count++;
            }
        }
        return  count;


    }
}