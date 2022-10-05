class FactorialAndRecurision {
    static int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return (n * factorial(n - 1));
    }

    class Test {
        int fact(int n) {
            int result;

            if (n == 1 || n==0) return 1;
            result = fact(n - 1) * n;
            return result;
        }
    }

    public static void main(String args[]) {
        int i, fact = 1;
        int number = 4;//It is the number to calculate factorial
        fact = factorial(number);
        System.out.println("Factorial of " + number + " is: " + fact);
    }
}

