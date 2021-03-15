package day12;

public class ParentChildTest {

    public static void main(String[] args) {
        //this is normal way of calling from different Class
        Parent obj = new Parent();
        System.out.println(obj.name);
        obj.sayHello();
        System.out.println("==========");

        //Now using Inheritance, we can call in following way:
        Child obj1 = new Child();
        System.out.println(obj.name);
        obj.sayHello();
    }
}
/*What cannot be Inherited?
1. private members - members are variables and Methods in a Class
2. hidden variables - if child create same name variable with different value
3. overridden Methods - same name of Method but different logic
 */

