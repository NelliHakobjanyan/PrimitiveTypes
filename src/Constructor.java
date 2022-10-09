public class Constructor {
//    double width, height, dept;
//
//     Constructor(double w, double h, double d) {
//       width = w;
//       height = h;
//       dept = d;
//    }
//    void setDim(double w, double h, double d) {
//        width = w;
//        height = h;
//        dept = d;
//    }
//
//
//    class Demo {
//        public static void main(String[] args) {
//            Constructor firstObject = new Constructor(10, 20, 30);
//            System.out.println(firstObject.width);
//            firstObject.setDim(10, 20, 30);
//            System.out.println(firstObject.width);
//        }
//    }


    //////// ODD NUMBERS    ///////////

//    static boolean isOdd(int i) {
//        return (i % 2 == 1);
//    }
//
//    static void printOddNumbers(int[] array) {
//        for (int i = 0; i < array.length; ++i) {
//            if (isOdd(array[i]))
//                System.out.println("Odd number is " + array[i]);
//        }
//
//    }
//
//    public static void main(String[] args) {
//        int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
//        printOddNumbers(array);
//    }

    class Box {
        double width;
        double height;
        double dept;

        Box(int w, int h, int d) {
            this.width = w;
            this.height = h;
            this.dept = d;
        }
    }
}


