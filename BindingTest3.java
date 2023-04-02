public class BindingTest3 {
    public static void main(String[] args) {
        Parent p = new Child();
        Child c = new Child();

        System.out.println(p.x);        //100
        p.method();     //자손 메서드 호출
        System.out.println();
        System.out.println(c.x);        //200
        c.method();     //자손 메서드 호출
    }
}

class Parent {
    int x = 100;

    void method()   {
        System.out.println("Parent Method");
    }
}

class Child extends Parent  {
    int x = 200;

    void method()   {
        System.out.println(x);
        System.out.println(super.x);
        System.out.println(this.x);
    }
}
