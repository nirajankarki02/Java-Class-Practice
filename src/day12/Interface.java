package day12;
//you can either write abstract on interface or not, if not compiler gives it
public /*abstract*/ interface Interface {

    //Method in Interface cannot have body. to give body we make separate implementing Class
    void m1();

    public void m2();

    abstract void m3();

    public abstract void m4();//by default so we don't have to write (public abstract)

    //initializing variable
    //int a1; cannot do this

    int a1 = 5;
    public int a2 = 5;
    static int a3 = 5;
    final int a4 = 5;
    public static int a5 = 5;
    static final int a6 = 5;
    public final int a7 = 5;
    public static final int a8 = 5;//by default

    //Cannot make CONSTRUCTOR on interface
    //public Interface (){}

}
