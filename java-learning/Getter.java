
class Person{
    private int age = 27;
    private String name = "Rahul";

    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }
}
public class Getter {
    public static void main(String[] args){
        Person obj = new Person();
        System.out.println(obj.getName()+" : "+obj.getAge());
    }
}
