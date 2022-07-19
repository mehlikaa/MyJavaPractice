package part2;

public class Mjp025_StaticKeywords {
    int x;
    static int y;
    public Mjp025_StaticKeywords(){
        x++;
        y=y+3;
    }
    
    Mjp025_StaticKeywords(int i){
        x+=i;
        y+=i;
    }

    public void myMethod1(){
        x++;
        y++;
    }
    public static void myStaticMethod(){
        // x++;   // static olmayan
        y++;
    }
    public static void main(String[] args) {
        new Mjp025_StaticKeywords(2);
        Mjp025_StaticKeywords dnm=new Mjp025_StaticKeywords(3);
        System.out.println("dnm.x,y = " + dnm.x+","+y);
        myStaticMethod();
        // myMethod1(); static olmayan method static mainden cagirilamiyor.

    }
    public void myMethod2(){
        myStaticMethod();
    }

}
