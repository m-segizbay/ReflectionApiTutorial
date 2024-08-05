package kz.segizbay;

public class Cat {
    private int privateA;
    int defaultA;
    protected int protectedA;
    public int publicA;

    public Cat() {
    }

    public Cat(int privateA, int publicA) {
        this.privateA = privateA;
        this.publicA = publicA;
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    private void privateVoidMethod(){
        System.out.println("private void method");
    }

    void defaultVoidMethod(){
        System.out.println("default void method");
    }

    public void publicVoidMethod(){
        System.out.println("public void method");
    }
}
