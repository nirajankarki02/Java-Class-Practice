package day11;

public class MethodArray2 {

    public void printElementsofAnArray(int... arr){
        for (int a : arr) {
            System.out.println(a);
        }
    }

    public static void main(String[] args) {
        int [] arr = {10,20,30};

        MethodArray2 ob = new MethodArray2();
        ob.printElementsofAnArray(arr);//OR
        ob.printElementsofAnArray(new int[]{40,50,60}); //To directly give element from this argument
        ob.printElementsofAnArray(40,50,60);// this step can give any number of elements but gotta change Method to
                                            //"public void printElementsofAnArray(int... arr)" NOTE: those '...' should
                                            //be three not less nor more, ALSO 'int... arr' should be last arg
                                            // if other are involved
    }

}
