public class LearningClasses {
    void method(double[] b, double k) {
        for (int i = 0; i < b.length; i++) {
            if (b[i] == k) {
                b[i] = k;
                System.out.println("the number is: " + k);
                return;
            }
        }
        System.out.println("number doesn't exist");
    }
}
//return b[i]==k?k:Double.parseDouble(a); //todo ask question

//Vardan's homework 1
class Demo {
    public static void main(String[] args) {
        LearningClasses learningClasses = new LearningClasses();
        learningClasses.method(new double[]{2,3,4,10,78,17}, 10);
    }
}