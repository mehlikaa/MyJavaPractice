package part2;

public class Mjp025_StaticKeywords {
    int x;
    static int y;
    
    Mjp025_StaticKeywords(int i){
        x+=i;
        y+=i;
    }

    public static void main(String[] args) {
        new Mjp025_StaticKeywords(2);
        Mjp025_StaticKeywords dnm=new Mjp025_StaticKeywords(3);
        System.out.println("dnm.x,y = " + dnm.x+","+y);
    }
}
