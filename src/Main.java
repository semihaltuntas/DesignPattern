public class Main {
    public static void main(String[] args) {
        byte b = 127;
        short sd = b;
        int i = sd;
        long l = i;
        l = Long.MAX_VALUE;
        System.out.println(l);
        float f = l;
        System.out.println(f);
    }
}