package BaiTap;

public class Ex12 {
    public static void main(String[] args) {
        String string="abcs1";
        String string1="abc";
        System.out.println(replaceSbyT(string));
        System.out.println(replaceSbyT(string1));
    }
    public static String replaceSbyT(String string){
        return string.replace("s","t");
    }
}
