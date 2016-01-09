public class Static {

    public static void main(String[] args) {
        Child.print();
    }
}

interface Interface {

     static void print() {
        System.out.println("INTERFACE");
    }
}

class Parent implements Interface {

    public static void print() {
        System.out.println("PARENT");
    }
}

class Child extends Parent {

//    public static void print() {
//        System.out.println("CHILD");
//    }

}