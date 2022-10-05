public class Recursion {

    int recursionSum(int n) {
        if (n <= 1)
            return n;
        return n + recursionSum(n - 1);
    }

}

class Main{
    public static void main(String[] args) {
            int n = 6;
            System.out.println(new Recursion().recursionSum(n));
    }
}
