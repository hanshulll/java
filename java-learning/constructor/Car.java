package constructor;

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

