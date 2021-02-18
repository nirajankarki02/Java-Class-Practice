package day4;

public class ExplicitTypeCasting {
    public static void main(String[] args) {
        double d = 100.98;
        float f = (float) d;
        long l = (long) f;
        int i = (int) l;
        short s = (short) i;
        byte b = (byte) s;

        System.out.println(d);//100.98
        System.out.println(f);//100.98
        System.out.println(l);//100
        System.out.println(i);//100
        System.out.println(s);//100
        System.out.println(b);//100
    }
}
