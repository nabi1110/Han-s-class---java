package week2;

public class Preview4 {

    public static void main(String[] args) {
        String originalStr = "Hello";
        String reverseStr = "";

        for (int i = 0; i < originalStr.length(); i++) {
            reverseStr = originalStr.charAt(i) + reverseStr;
        }

        System.out.println("Reversed string : " + reverseStr);
    }
}
