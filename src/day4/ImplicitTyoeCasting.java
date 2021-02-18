package day4;

public class ImplicitTyoeCasting {
    public static void main(String[] args) {
        byte b = 127;
        short s = b;
        int i = s;
        long l = i;
        float f = l;
        double d = f;
        System.out.println(b);//127
        System.out.println(s);//127
        System.out.println(i);//127
        System.out.println(l);//127
        System.out.println(f);//127.0
        System.out.println(d);//127.0
    }
}
