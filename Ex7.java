package BaiTap;

public class Ex7 {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Hello, ");
        appendStringToEnd(stringBuffer, "world!");
        System.out.println(stringBuffer.toString()); // Output: Hello, world!
    }

    // Phương thức để thêm chuỗi vào cuối của StringBuffer
    public static void appendStringToEnd(StringBuffer stringBuffer, String strToAdd) {
        stringBuffer.append(strToAdd);
    }
}
