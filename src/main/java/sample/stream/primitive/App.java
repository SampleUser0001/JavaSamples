package sample.stream.primitive;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        int[] intArray = {1,2,3,4,5};
        Arrays.stream(intArray)
              .forEach(System.out::println);

        // int, double, longは処理できるが、byteは処理できない。
        // IntStream, DoubleStream, LongStreamはあるが、ByteStreamはないため、
        // Arrays.streamメソッドは、byte[]を受けられない。。
        // byte[] array = {0x01, 0x02, 0x03, 0x04, 0x05};
        // Arrays.stream(array);
        //       .forEach(System.out::println;
    }
}
