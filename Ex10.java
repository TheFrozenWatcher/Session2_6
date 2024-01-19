package BaiTap;

public class Ex10 {
    public static void main(String[] args) {
        String string="Hello World!";
        System.out.println(turnLower(string));
        System.out.println(turnUpper(string));
    }
    public static String turnUpper(String str){
        return str.toUpperCase();
    }
    public static String turnLower(String str){
       return str.toLowerCase();
    }
}
