// This is a class
public class Main {
    // Function that which contains an arguments
    public static void main(String[] args) {
//  First Mobile
        mobile mobile1 = new mobile();
        mobile1.name = "Iphone 14 pro max";
        mobile1.Companyname ="Iphone";
        mobile1.dualSim = false;
        mobile1.Storage = 64;
        mobile1.support4k = true;
        mobile1.SerialNum =14894898;
        System.out.println(mobile1.name+" ,companyname "+mobile1.Companyname+" ,dualsim "+mobile1.dualSim+" ,storage "+mobile1.Storage+" ,support4k "+mobile1.support4k+" and the serial name is "+mobile1.SerialNum);
        mobile1.call();
        mobile1.playMedia();
        mobile1.sendMessage();

// Second mobile
        mobile mobile2 = new mobile();
        mobile2.name = "Samsung Galaxy S20";
        mobile2.Companyname ="Samsung";
        mobile2.dualSim = true;
        mobile2.Storage = 128;
        mobile2.support4k = false;
        mobile2.SerialNum =7678756;
        System.out.println(mobile2.name+" ,companyname "+mobile2.Companyname+" ,dualsim "+mobile2.dualSim+" ,storage "+mobile2.Storage+" ,support4k "+mobile2.support4k+" and the serial name is "+mobile2.SerialNum);
        mobile2.call();
        mobile2.playMedia();
        mobile2.sendMessage();
    }
}