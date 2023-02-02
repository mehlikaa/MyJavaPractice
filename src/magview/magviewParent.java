package magview;

public class magviewParent {
    public  int  id;
    public  String firstName;
    public  String lastName;
    public  int theYearOfLogin;
    public  int theExperinceYear;

    public void EmployeeFamily(String spouseName, int numberOfkids, String cityName, int zipCode ){

        spouseName="";
        numberOfkids=0;
        cityName="Cupertino";
        zipCode=95014;

        magviewChild1 employee1=new magviewChild1();
        System.out.println("employee1.firstname : "+ employee1.firstName);
    }

}
