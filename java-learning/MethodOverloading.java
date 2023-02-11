class Sum{
    public int add(int i,int j){
        return i+j;
    }
    public int add(int i ,int j,int k){
        return i+j+k;
    }
    public double add(double x, double y){
        return x+y;
    }
}
public class MethodOverloading {
    public static void main(String[] args){
        Sum s = new Sum();
        System.out.println(s.add(12,15));
        System.out.println(s.add(44,32));
        System.out.println(s.add(13.4,44.2));
    }
}
