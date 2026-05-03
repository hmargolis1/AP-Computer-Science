public class ConversionTester {
    public static void main(String[] args) {
        try {
            System.out.println(BinaryAndHexadecimalConversion.convertIntToBinary(5));
            System.out.println(BinaryAndHexadecimalConversion.convertIntToBinary(100));
            System.out.println(BinaryAndHexadecimalConversion.convertIntToBinary(1000));
        } catch (Exception e) {
            throw new IllegalArgumentException();
        }
        System.out.println();
        try {
            System.out.println(BinaryAndHexadecimalConversion.convertBinaryToInt("101"));
            System.out.println(BinaryAndHexadecimalConversion.convertBinaryToInt("1001"));
            System.out.println(BinaryAndHexadecimalConversion.convertBinaryToInt("101011110011100101"));
        } catch (Exception e) {
            throw new IllegalArgumentException();
        }
        System.out.println();
        try {
            System.out.println(BinaryAndHexadecimalConversion.convertIntToHexadecimal(5));
            System.out.println(BinaryAndHexadecimalConversion.convertIntToHexadecimal(289));
            System.out.println(BinaryAndHexadecimalConversion.convertIntToHexadecimal(980));
        } catch (Exception e) {
            throw new IllegalArgumentException();
        }
    }
}
