class Person1{
    private int age;
    private String name;

    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }

    public void setAge(int a){
        age= a;
    }

    public void setName(String n){
        name = n;
    }
}
public class Setter {
    public static void main(String[] args){
        Person1 obj = new Person1();
        obj.setAge(31);
        obj.setName("Rajesh");
        System.out.println(obj.getName()+" : "+obj.getAge());

    }
}
