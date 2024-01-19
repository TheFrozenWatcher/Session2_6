package BaiTap;

public class Ex4 {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Nhập chuỗi:");
//        String string=sc.nextLine();
//        System.out.println("Mảng mới là: "+ Arrays.toString(splitString(string)));
//
//    }
//
//    private static String[] splitString(String input){
//        return input.split("\\s+");
        String inputString = "Chuỗi mẫu.";

        // Gọi phương thức để tách chuỗi thành mảng các từ
        String[] wordsArray = splitStringToArray(inputString);

        // Hiển thị mảng các từ
        System.out.println("Mảng các từ:");
        for (String word : wordsArray) {
            System.out.println(word);
        }
    }

    private static String[] splitStringToArray(String input) {
        // Tách các từ trong chuỗi sử dụng khoảng trắng làm dấu phân cách
        return input.split("\\s+");
    }
}

