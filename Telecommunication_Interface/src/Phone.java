import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Phone implements Telephone{

    private long myNumber;
    private HashMap list;
    private boolean isRinging;

    public Phone(HashMap list){
        this.list=list;
    }

    @Override
    public void powerON() {
        System.out.println("Phone is powered ON!");
    }

    @Override
    public void dial(long phoneNumber) {
        this.myNumber=phoneNumber;
        isRinging=true;
        int count=0;
        for(; myNumber != 0; myNumber/=10, ++count);
        if(count==10) {
            System.out.println("Now Dialing: +1-" + phoneNumber);
            System.out.println("Enter random Number: ");
            Scanner sc = new Scanner(System.in);
            long no = sc.nextLong();
            answer(no);
        }
        else {
            System.out.println("Please check the number you have dialed and Re-dial");
            System.out.println("Enter the Number again: ");
            Scanner sc = new Scanner(System.in);
            long no = sc.nextLong();
            dial(no);
        }
    }

    @Override
    public void answer(long phoneNumber) {
        if(isRinging){
            if(list.containsValue(phoneNumber)){
            isRinging=false;
            System.out.println("Answering the call +1-"+phoneNumber);
        }
            else System.out.println("UNKNOWN NUMBER");
        }
        else System.out.println("Phone not ringing");
    }

    @Override
    public boolean isRinging() {
        return false;
    }
}
