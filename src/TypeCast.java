public class TypeCast {
    public static void main(String[] args) {
//        int i = 141;
        byte b = 12;
        byte b1 = 12;
        byte b2 = (byte) (b + b1);

//        System.out.println(b2);


//        int k = 8, j = 9;
//        double d = k / (double) j;
//        System.out.println(d);
int i , j;
        for (i = 1; i < 10; i++) {
            for (j = i; j > 0; j--)
                System.out.print(".");
            System.out.println(" ");
        }
    }
}
