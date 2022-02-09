public class App {
    private static final String STRING = "Hello, World!"; // variable size
    private static final byte BYTE = 100; // 1 byte
    private static final short SHORT = 30000; // 2 bytes
    private static final int INTEGER = -2000000000; // 4 bytes
    private static final long LONG = 9000000000000000000L; // 8 bytes
    private static final float FLOAT = 5.75f; // 4 bytes
    private static final double DOUBLE = 19.99d; // 8 bytes
    private static final boolean BOOLEAN = true; // 1 bit
    private static final char CHAR = 'A'; // 2 bytes

    public static void main(String[] args) throws Exception {
        System.out.println(STRING);
        System.out.println(BYTE);
        System.out.println(SHORT);
        System.out.println(INTEGER);
        System.out.println(LONG);
        System.out.println(FLOAT);
        System.out.println(DOUBLE);
        System.out.println(BOOLEAN);
        System.out.println(CHAR);
    }
}
