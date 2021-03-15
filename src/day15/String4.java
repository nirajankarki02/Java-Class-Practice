package day15;

public class String4 {

    public static void main(String[] args) {
        String s1 = "good";
        System.out.println(s1);//good

        s1.concat(" evening");
        System.out.println(s1);//good
        //Even with concat s1 still displays "good" instead of "good evening", this is example of immutability of String
        //here evening has been concatenated with good but s1 is still referring to "good". "good evening" is created here but not referred by any

        //NOW
        String s2 = s1.concat(" evening");//this s2 refers to newly created 'good evening'
        System.out.println(s2);//good evening
    }
}
