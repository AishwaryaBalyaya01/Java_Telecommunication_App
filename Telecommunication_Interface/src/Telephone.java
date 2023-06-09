public interface Telephone {
    //power ON or OFF
    //Dial a Number
    //Answer a phonecall
    //call another phone
    //is Ringing?

    void powerON();
    void dial(long phoneNumber);
    void answer(long phoneNumber);
    boolean isRinging();
}
