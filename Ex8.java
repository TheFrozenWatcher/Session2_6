package BaiTap;

public class Ex8 {
    public static void main(String[] args) {
        StringBuffer str= new StringBuffer("Hello from the other side");
        System.out.println(replaceString(str," world ",5,6));
    }
    public static StringBuffer replaceString(StringBuffer input, String string,int i, int j){
        return input.replace(i,j,string);
    }
}
