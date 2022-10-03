public class LowercaseUppercase {
    public static void main(String args[]) {

        char ch;
        // uppercase letters
        System.out.println("Uppercase Alphabets are:");
        for (ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print(ch + " ");
        }
        System.out.print("\n");
        // lowercase letters
        System.out.println("Lowercase Alphabets are:");
        for (ch = 'a'; ch <= 'z'; ch++) {
            System.out.print(ch + " ");
        }
    }
}
