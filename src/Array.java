public class Array {
     int maximum(int[] ints) {
        int max = ints[0];
        for (int i = 1; i < ints.length; i++) {
            if (max < ints[i]) {
                max = ints[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
         Array array = new Array();
        int[] f = {1, 6, 3, 4, 5, 8, 9};
        System.out.println(array.maximum(f));
    }
}
