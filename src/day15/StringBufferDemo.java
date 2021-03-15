package day15;

//If we are working on multi-threaded programming we need to use String Buffer
//if not String builder
//String Buffer is Expensive
public class StringBufferDemo {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Good");
        System.out.println(sb);//Good

        sb.append(" Morning");
        System.out.println(sb);//Good Morning

        sb.insert(0, "hello, ");
        System.out.println(sb);//hello, Good Morning

        sb.delete(7,12);
        System.out.println(sb);//hello, Morning

        sb.reverse();
        System.out.println(sb);//gninroM ,olleh
    }
}
