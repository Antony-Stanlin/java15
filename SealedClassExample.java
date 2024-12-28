sealed class A extends Object{
    public void print(){
        System.out.println("Sealed");
    }
}

non-sealed class B extends A{
    public void print(){
        System.out.println("Non sealed");
    }

}

final class C extends A {
    
    
}

class D extends B{

}


public class SealedClassExample {

    public static void main(String[] args) {
        new A().print();
        new B().print();
        new C().print();
        new D().print();
        
    }

}
