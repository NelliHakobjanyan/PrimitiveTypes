public class LowercaseUppercase {
    public static void main(String args[]) {


        /////upperLower

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

        ///////max with methods

        Object object = new Object();
        System.out.println('\n');
        System.out.println("the max value is: " + object.maxMethod(10, 23));

    }

}

class Object {
    public int maxMethod(int x, int y) {
        return (x>y?x:y);
    }
}
