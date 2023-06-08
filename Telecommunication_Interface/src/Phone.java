public class Phone implements Telephone{

    private String myNumber;
    private boolean isRinging;

    public Phone(String myNumber){
        this.myNumber=myNumber;
    }

    @Override
    public void powerON() {

    }

    @Override
    public void dial(String phoneNumber) {

    }

    @Override
    public void answer() {

    }

    @Override
    public boolean callPone() {
        return false;
    }

    @Override
    public boolean isRinging() {
        return false;
    }
}
