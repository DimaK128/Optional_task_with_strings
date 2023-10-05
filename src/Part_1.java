public class Part_1 {
    public static void main(String[] args) {
        String text = "Hello,my name is Dmitriy.";
        printString(text);
    }

    public static void printString(String text) {
        if (text.isEmpty()) {
            return;
        }

        System.out.println(text.charAt(0));
        printString(text.substring(1));
    }
}
