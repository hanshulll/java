
// How to use non-static variable inside a static method?
class Mobile{
    String brand;
    int price;
    static String name;
    public static void show1(Mobile obj){
        System.out.println(obj.brand+":"+obj.price+":"+name);
    }
}
public class StaticMethod {
    public static void main(String [] args){
        Mobile obj1 = new Mobile();
        obj1.brand="apple";
        obj1.price=1500;
        Mobile.name = "SmartPhone";

        Mobile.show1(obj1);
    }

}
