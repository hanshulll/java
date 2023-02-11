package method.overriding;

public class MethodOverriding {
    public static void main(String[] args){
        Parent obj = new Parent();
        obj.show();
        Parent obj1 = new Child();
        obj1.show();
    }
}