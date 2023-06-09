import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Create PhoneBook List\nHow many contact you want to create?");
        Scanner in = new Scanner(System.in);
        long num = in.nextLong();
        HashMap<String,Long> map = new HashMap<>();
        do{
            Scanner no = new Scanner(System.in);
            System.out.print("Please Enter Name: ");
            String name = no.nextLine();
            System.out.print("Please Enter Number: ");
            long number = no.nextLong();
            map.put(name,number);
            num--;
        }while(num!=0);

        System.out.println("Please Enter Phone Number you want to dial: ");
        Scanner no = new Scanner(System.in);
        long number=no.nextLong();
        Phone phone = new Phone(map);
        phone.powerON();
        phone.dial(number);

    }
}
