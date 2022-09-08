public class PrimitiveTypesDeclaration {
    public static void main(String[] args) {
        long longNumber;
        int intNumber;
        short shortNumber;
        byte byteNumber;

        longNumber = Long.MAX_VALUE + 2; //todo ask why the value becomes negative
        intNumber = Integer.MAX_VALUE;
        shortNumber = Short.MAX_VALUE; //32767
        byteNumber = Byte.MAX_VALUE; //127

        System.out.println("the max value of long is :" + longNumber);
        System.out.println("the max value of int is :" + intNumber);
        System.out.println("the max value of short is :" + shortNumber);
        System.out.println("the max value of byte is :" + byteNumber);
    }
}
