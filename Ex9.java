package BaiTap;

public class Ex9 {
    public static void main(String[] args) {
        String string1="Hello world";
        String string2="Hello!";
        containerCheck(string1, string2);
    }
    public static void containerCheck(String str1, String str2){
        if (str1.contains(str2)){
            System.out.println("Chuỗi 1 chứa chuỗi 2");
        } else {
            System.out.println("Chuỗi 1 không chứa chuỗi 2");

        }
    }
}
