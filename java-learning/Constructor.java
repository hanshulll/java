class Car{
    private int price;
    private String company;
    private String model;

    // DefaultConstructor
     Car(){
        price = 0000000;
        company = "xyz";
        model = "xyz";
    }
    //ParameterizedConstructor
    Car(int price,String company,String model){
         this.price = price;
         this.company = company;
         this.model = model;
    }
    public int getPrice(){
        return price;
    }
    public String getCompany(){
        return company;
    }
    public String getModel(){
        return model;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public void setCompany(String company){
        this.company = company;
    }
    public void setModel(String model){
        this.model = model;
    }
}

public class Constructor {
    public static void main(String [] args){

        Car obj = new Car();
        System.out.printf("Default values Fetched from Constructor : \n Car price : %s \n Car company : %s \n Car model : %s \n",obj.getPrice(),obj.getCompany(),obj.getModel());

        Car obj1 = new Car();
        obj1.setPrice(150000);
        obj1.setCompany("Mahendra");
        obj1.setModel("Thar");
        System.out.printf("Value fetched after using Setter : \n Car price : %s \n Car company : %s \n Car model : %s",obj1.getPrice(),obj1.getCompany(),obj1.getModel());

        Car obj2 = new Car(100000,"Hyundai","i20");
        System.out.print("\n \n");
        System.out.println(obj2.getCompany()+" : "+obj2.getModel()+" : "+obj2.getPrice());


    }
}
