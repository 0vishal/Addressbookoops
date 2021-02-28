
import java.util.Scanner;

 public class Addressbookoops {

     public static String firstName;
    public static String lastName;
    public static String address;
    public static String city;
    public static String state;
    public static String zip;
    public static String phonenumber;
    public static String email;



    public void AddContact() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter FirstName");
        String firstName=sc.next();
        System.out.println("Enter LastName");
        String lastName=sc.next();
        System.out.println("Enter area");
        String address=sc.next();
        System.out.println("Enter CityName");
        String city=sc.next();
        System.out.println("Enter state");
        String state=sc.next();
        System.out.println("Enter phone zip");
        String zip=sc.next();
        System.out.println("Enter phone");
        String phonenumber=sc.next();
        System.out.println("Enter email");
        String email=sc.next();

        System.out.println(" Empname "+ firstName + " Lastname " + lastName + " area " + address + " city " + city + " State " + state + " zip " + zip +
                " phonenumber " + phonenumber + " email " + email);
    }

 public static void main(String[] args) {
        System.out.println("Welcome To Address Book Problem\n");
	AddContact();

 }
