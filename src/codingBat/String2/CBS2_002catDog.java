package codingBat.String2;

public class CBS2_002catDog {
// Return true if the string "cat" and "dog" appear the same number of times in the given string.
    //  catDog("catdog") → true
    //  catDog("catcat") → false
    //  catDog("1cat1cadodog") → true

    public static void main(String[] args) {
        catDog("catDog");
    }
    public static boolean catDog(String str) {

        int countCat=0;
        int countDog=0;
        boolean result=false;

        //if(str.toLowerCase().contains("dog")&&str.toLowerCase().contains("cat")){
            for (int i = 0; i <str.length()-2 ; i++) {
                if(str.toLowerCase().substring(i,i+3).contains("cat")) countCat++;
                if(str.toLowerCase().substring(i,i+3).contains("dog")) countDog++;
            }
            if(countCat==countDog) result=true;

       // }
        System.out.println("countCat : " + countCat + "  countDog : "+ countDog + "    Result : "+result);

        return result;
    }
}
