package method.overloading;

public class MethodOverloading {
    public static void main(String[] args){
        Sum s = new Sum();
        System.out.println(s.add(12,15));
        System.out.println(s.add(44,32));
        System.out.println(s.add(13.4,44.2));
    }
}

