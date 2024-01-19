package BaiTap;

public class Ex5 {
    public static void main(String[] args) {
        String string1="abc";
        String string2="xyz";
        System.out.println(concatString(string1,string2));
    }
    private static String concatString(String str1, String str2){
        return str1.concat(str2);
    }
}
