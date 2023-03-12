import java.math.BigInteger;
import java.util.stream.IntStream;

public class SimpleFactorialApp {
public static void main(String[] args) {
    System.out.println(getFactorial(6));
    System.out.println(getFactorial(3));
}

private static BigInteger getFactorial(int num) {
    return IntStream.rangeClosed(1, num)
            .mapToObj(BigInteger::valueOf)
            .reduce(BigInteger.ONE, BigInteger::multiply);

}

}
