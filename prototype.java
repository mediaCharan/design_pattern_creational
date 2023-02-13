import java.util.ArrayList;
import java.util.List;

abstract class mobile{
    String battery;
    int memory;
    String name;
    String mp;
    String processor;
    
    mobile(){}   //default constructor
    public mobile(mobile m){  //parameterized constructor
        if(m!= null){
            // Copying values from original object into the prototyped object
            this.battery=m.battery;
            this.name=m.name;
            this.memory=m.memory;
            this.mp=m.mp;
            this.processor=m.processor;
        }
    }
    public abstract mobile clone();
    public String toString(){
        return "name : "+this.name+"\nmemory : "+this.memory+"\nbattery : "+this.battery+ "\nmegapixal : "+this.mp+"\nprocessor : "+this.processor+"\n";

    }

}
class realme extends mobile{
    public realme(){}
    public realme(realme r){
        super(r);
    }
    public mobile clone(){
        return new realme(this);
    }
}

class oppo extends mobile{
    public oppo(){}
    public oppo(oppo o){
        super(o);
    }
    public mobile clone(){
        return new oppo(this);
    }
}
public class prototype {
    public static void main(String[] args) {
        List<mobile> obj=new ArrayList<>();
        List<mobile> objcopy=new ArrayList<>();
        
        realme r=new realme();
        r.battery="33 watts";
        r.name="realme 10 Pro 5G Coca-Cola Edition";
        r.memory=128;
        r.mp="108 mp";
        r.processor="8 gb";


        obj.add(r);

        oppo op=new oppo();
        op.battery="4230 mAh";
        op.name="oppo A31";
        op.memory=128;
        op.mp="20 x 1600 pixels ";
        op.processor="6 gb";
        obj.add(op);

        for (mobile Mobile : obj){
                objcopy.add(Mobile.clone());
        }
        System.out.print("original Objects:- \n");
        System.out.println("");
        for(mobile Mobile:obj){
            System.out.println(Mobile.toString());
            System.out.println("---------------------");
        }
        System.out.print("prototyped Objects:- \n");
        System.out.println("");
        for(mobile Mobile:objcopy){
            System.out.println(Mobile.toString());
            System.out.println("---------------------");
        }
    }
}




original Objects:- 

name : realme 10 Pro 5G Coca-Cola Edition
memory : 128
battery : 33 watts
megapixal : 108 mp
processor : 8 gb

---------------------
name : oppo A31
memory : 128
battery : 4230 mAh
megapixal : 20 x 1600 pixels 
processor : 6 gb

---------------------
prototyped Objects:-

name : realme 10 Pro 5G Coca-Cola Edition
memory : 128
battery : 33 watts
megapixal : 108 mp
processor : 8 gb

---------------------
name : oppo A31
memory : 128
battery : 4230 mAh
megapixal : 20 x 1600 pixels
processor : 6 gb

---------------------
