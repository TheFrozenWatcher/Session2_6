package BaiTap;

public class Ex11 {
    public static void main(String[] args) {
        String string=" 123 456 ";

        System.out.println(removeBlank(string));
        System.out.println(string);
    }
    public static String removeBlank(String str){
        return str.trim();
    }
}
