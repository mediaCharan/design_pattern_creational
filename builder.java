class vehicle{
    String name;
    String company;
    String number;
    String cost;
    public vehicle(VehicleBuilder vehiclebuilder){
        this.name=vehiclebuilder.getname();
        this.company=vehiclebuilder.getcompany();
        this.number=vehiclebuilder.number();
        this.cost=vehiclebuilder.cost();
    }
    public String getname(){
    return name;
}
public String getcompany(){
    return company;
}
public String number(){
    return number;
}
public String cost(){
    return cost;
}
public String toString(){
    return "name: "+name+"\n" +"company: "+company+"\n"+"number: "+number+"\n"+"cost: "+cost+"\n";

}
}
interface Ivehiclebuilder{
    Ivehiclebuilder name(String name);
    Ivehiclebuilder company(String company);
    Ivehiclebuilder number(String number);
    Ivehiclebuilder cost(String cost);
}
class VehicleBuilder implements Ivehiclebuilder{
    String name;
    String company;
    String number;
    String cost;
    public VehicleBuilder name(final String name){
        this.name=name;
        return this;
    }
    public VehicleBuilder company(final String company){
        this.company=company;
        return this;
    }
    public VehicleBuilder number(final String number){
        this.number=number;
        return this;
    }
    public VehicleBuilder cost(final String cost){
        this.cost=cost;
        return this;
    }
    public vehicle build(){
        return new vehicle(this);
    }
    public String getname(){
        return name;
    }
    public String getcompany(){
        return company;
    }
    public String number(){
        return number;
    }
    public String cost(){
        return cost;
    }
}
public class builder {
        public static void main(String[] args) {
            vehicle obj = new VehicleBuilder()
                    .name("scooty")
                    .company("honda")
                    .number("ap21 bg 2249")
                    .cost("69000")
                    .build();
    
            System.out.println(obj.toString());
        }
    
}