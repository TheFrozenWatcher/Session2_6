package BaiTap;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập chuỗi: ");
        String string=sc.nextLine();
        System.out.println("Chuỗi ngược: "+ reverseString(string));

    }

    private static String reverseString(String input){
        StringBuffer stringBuffer= new StringBuffer(input);
        StringBuffer newSringBuffer= stringBuffer.reverse();
        return newSringBuffer.toString();
    }

}
