public class asd {
    public static void main(String[] args) {
        String text = args [0];
        nummeriereBuchstaben(text);
    }
    public static void nummeriereBuchstaben(String text) {
        for (int i = 0; i < text.length(); i++) {
            char buchstabe = text.charAt(i);
            if (Character.isLetter(buchstabe)) {
                System.out.println((i + 1) +  + buchstabe);
            }
        }
    }
}
