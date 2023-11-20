// Class that define the objects (UML)
public class mobile {
    String Companyname;
    Short Storage;
    long SerialNum;
    String name;
    boolean dualSim;
    boolean support4k;

    // Method that call and send message and playmedia the mobile phone
    void call(){
        System.out.println(name+" Call");
    }
    void sendMessage(){
        System.out.println(name+" send message");
    }
    void playMedia(){
        System.out.println(name+" play media");
    }

}
