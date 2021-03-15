package day15;

public class String8 {

    public static void main(String[] args) {

        System.out.println(isYes("yes"));//true
        System.out.println(isYes("Yes"));//false

        System.out.println(isY_yes("yes"));//true
        System.out.println(isY_yes("Yes"));//true

        System.out.println(isYesNo("No"));//true
        System.out.println(isYesNo("Yes"));//true
        System.out.println(isYesNo("yes"));//false

        System.out.println(isY_yesN_no("No"));//true
        System.out.println(isY_yesN_no("Yes"));//true
        System.out.println(isY_yesN_no("yes"));//true
        System.out.println(isY_yesN_no("no"));//true

        System.out.println(isNumber("123"));//true
        System.out.println(isNumber("123abc"));//false
    }

    public static boolean isYes(String s){

        return s.matches("yes");
    }
    public static boolean isY_yes(String s){
        return s.matches("[Y|y]es");
    }
    public static boolean isYesNo(String s){
        return s.matches("Yes|No");
    }
    public static boolean isY_yesN_no(String s){
        return s.matches("[Y|y]es|[N|n]o");
    }

    public static boolean isNumber(String n){
        return n.matches("[0-9]+");//return n.matches("\\d+")
    }
}
