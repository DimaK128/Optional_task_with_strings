public class Part_3 {
    public static void main(String[] args) {
        String text = "Hello,my name is Dmitriy.";
        String reversed = reverseString(text);
        System.out.println(reversed);
    }

    public static String reverseString(String text) {

        if (text.length() <= 1) {
            return text;
        }

            return reverseString(text.substring(1)) + text.charAt(0);
    }
}
