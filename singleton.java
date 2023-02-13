/**
 * singleton
 */
class a{
    static a obj=new a();
    private a(){}
    public static a instance(){
        return obj;
    }
    void k(){
        System.out.println("hello shinchan");
    }
}
class b{
    static b obj=new b();
    private b(){}
    public static b instance(){
        return obj;
    }
    void p(){
        System.out.println("hello nobita");
    }
}
public class singleton {

    public static void main(String[] args) {
        a obj=a.instance();
        b ob=b.instance();
        obj.k();
        ob.p();
    }
}