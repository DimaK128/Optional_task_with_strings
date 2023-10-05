public class Part_2 {
    public static void main(String[] args) {
        String text = "Hello,my name is Dmitriy.";
        printReverseString(text);
    }

    public static void printReverseString(String text) {

        if (text.isEmpty()) {
            return;
        }

        System.out.println(text.charAt(text.length() - 1));

        printReverseString(text.substring(0, text.length() - 1));
    }
}
