package BaiTap;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi gốc");
        String string1 = sc.nextLine();
        System.out.println("Nhập chuỗi cần thêm");
        String string2 = sc.nextLine();
        System.out.println("Nhập vị trí cần chèn");
        int i = sc.nextInt();
        System.out.println("Chuỗi mới là: "+insertString(string1, string2,i));

    }

    private static String insertString(String input1, String input2, int index) {
        StringBuilder stringBuilder = new StringBuilder(input1);
        if (index>stringBuilder.length()){
            return "Vị trí cần thêm không hợp lệ";
        } else {
        StringBuffer stringBuffer = new StringBuffer(stringBuilder.insert(index, input2));
        return stringBuffer.toString();
        }
    }
}
