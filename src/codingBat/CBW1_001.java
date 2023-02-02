package codingBat;
//The parameter weekday is true if it is a weekday, and the parameter
//     vacation is true if we are on vacation.
//     We sleep in if it is not a weekday or we're on vacation.
//     Return true if we sleep in.
//sleepIn(false, false) → true
//sleepIn(true, false) → false
//sleepIn(false, true) → true
public class CBW1_001 {
    public static void main(String[] args) {
        String day = "Saturda";
        boolean weekday = false;
        boolean vacation = false;
        if (day == "Monday" || day == "Tuesday" || day == "Wednesday" || day == "Thursday" || day == "Friday") {
            weekday = true;
        } else if (day=="Saturday"||day=="Sunday") {weekday = false;}
        else {System.out.println("Gecerli bir gun ismi giriniz ..."); weekday=false;}

        System.out.println("Day : "+day+"\t"+"Weekday : "+weekday+"\t"+"Vacation :"+vacation);
        sleepIn(weekday,vacation);
    }
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        boolean sleep = false;
        if(weekday==true){
            sleep=false;
        } else if(weekday==false) {
            if (vacation == false || vacation == true) {
                sleep = true;
            }
        }
        System.out.println(sleep);
        return sleep;}

}

