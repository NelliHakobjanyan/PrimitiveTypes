import java.util.Random;

public class RandomNumberHomework {
    int[] array = new int[100];

    void generateArray() {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            System.out.print(array[i] + ", ");
        }
    }

    void calculate() {
        int countArray[] = new int[101];
        for (int i = 0; i < countArray.length - 1; i++) {
            countArray[i] = 0; //check karch dzev 0ner lcnelu
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(countArray[array[i]] ++ + ", ");
        }
        System.out.println();
        System.out.println("//////////////");
    }
}

class DemoClass {
    public static void main(String[] args) {

        RandomNumberHomework randomNumberHomework = new RandomNumberHomework();
        System.out.println("array from 100 elements is: ");
        randomNumberHomework.generateArray();
        System.out.println('\n' +"the count of numbers which are duplicated");
        randomNumberHomework.calculate();
    }
}
