import java.util.Scanner;

 public class CreateContact {

     public static String firstName;
    public static String lastName;
    public static String address;
    public static String city;
    public static String state;
    public static String zip;
    public static String phonenumber;
    public static String email;


     public void EditContact() {
         System.out.println("Enter the name from List to Edit");
         firstName="Vishal";lastName="Salaskar";address="ghatkopar";state="maharashtra";city="Mumbai";phonenumber="757363838";email="vishal@gmail.com";
         System.out.println("Empname "+ firstName + "Lastname " + lastName + "area " + address + "city " + city + "State " + state + "zip " + zip +
                 "phonenumber " + phonenumber + "email " + email);
         Scanner sc = new Scanner(System.in);
         String name = sc.next();
         System.out.println();

         if (firstName.equals(name)) {
             System.out.println("Enter the option to edit 1. FirstNAme 2.Lastname 3.Address 4.State 5.City 6.PhoneNumber 7.Email");
             int option = sc.nextInt();
             switch (option) {
                 case 1:
                     System.out.println("Enter Firstname");
                     firstName=sc.next();
                     break;
                 case 2:
                     System.out.println("Enter LastName");
                     lastName=sc.next();
                     break;
                 case 3:
                     System.out.println("Enter address");
                     address=sc.next();
                     break;
                 case 4:
                     System.out.println("Enter state");
                     state=sc.next();
                     break;
                 case 5:
                     System.out.println("Enter City");
                     city=sc.next();
                     break;
                 case 6:
                     System.out.println("Enter PhoneNumber");
                     phonenumber=sc.next();
                     break;
                 case 7:
                     System.out.println("Enter Email");
                     email=sc.next();
                     break;

             }
         } else {
             System.out.println("Name not in the list");
         }
         System.out.println("Empname "+ firstName + " Lastname " + lastName + " area " + address + " city " + city + " State " + state + " zip " + zip +
                 " phonenumber " + phonenumber + " email " + email);
     }


 public static void main(String[] args) {
        System.out.println("Welcome To Address Book Problem\n");
        CreateContact emp = new CreateContact();
        emp.EditContact();
            }
} 