class A extends Object{
    public A(){
        System.out.println("int a");
    }
    public A(int a){
        System.out.println("in a int");
    }
}
class B extends A{
    public B(){
        this(3);
        System.out.println("in b");
    }
    public B(int n){
        super();
        System.out.println("in b int");
    }
}
public class Super {
    public static void main(String[] args){
        B obj = new B();
    }
}
