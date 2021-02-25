package day7;

public class Object3 {
    public static void main(String[] args) {

        System.out.println(new Object3().hashCode());

        Object3 ob;
        ob = new Object3();
        System.out.println(ob.hashCode());

        Object3 obj = new Object3();
        System.out.println(obj.hashCode());

        System.out.println(obj);
        System.out.println("day7.Object3@"+Integer.toHexString(obj.hashCode()));
    }

}
