package constructor;

public class Constructor {
    public static void main(String [] args){

        Car obj = new Car();
        System.out.printf("Default values Fetched from constructor.Constructor : \n constructor.Car price : %s \n constructor.Car company : %s \n constructor.Car model : %s \n",obj.getPrice(),obj.getCompany(),obj.getModel());

        Car obj1 = new Car();
        obj1.setPrice(150000);
        obj1.setCompany("Mahendra");
        obj1.setModel("Thar");
        System.out.printf("Value fetched after using encapsulation.Setter : \n constructor.Car price : %s \n constructor.Car company : %s \n constructor.Car model : %s",obj1.getPrice(),obj1.getCompany(),obj1.getModel());

        Car obj2 = new Car(100000,"Hyundai","i20");
        System.out.print("\n \n");
        System.out.println(obj2.getCompany()+" : "+obj2.getModel()+" : "+obj2.getPrice());
    }
}
