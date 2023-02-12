import java.util.Scanner;

interface asign{
    void Sending();
}
class ml implements asign{
    public void Sending(){
        System.out.println("sending ml lecturer");
    }
}
class devops implements asign{
    public void Sending(){
        System.out.println("sending devops lecturer");
    }
}
class cc implements asign{
    public void Sending(){
        System.out.println("sending cc lecturer");
    }
}
class selecting{
    public asign call(String subject){
        if(subject.equals("cc")){
            return new cc();
        }
        else if(subject.equals("ml")){
            return new ml();
        }
        else if(subject.equals("devops")){
            return new devops();
        }
        else{
            return new ml();
        }
    }
}

public class factory {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        String subject=sc.nextLine();
        selecting obj=new selecting();
        asign lecturer=obj.call(subject);
        lecturer.Sending();
        sc.close();
    }
}
