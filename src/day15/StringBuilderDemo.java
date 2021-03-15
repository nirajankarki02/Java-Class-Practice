package day15;

//Now if we need mutable String, StringBuilder comes to assist
public class StringBuilderDemo {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Good");
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
