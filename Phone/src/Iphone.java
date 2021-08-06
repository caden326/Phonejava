public class Iphone extends Phone implements Ringable {
	
    public Iphone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    
    
    @Override
    public String ring() {
        return "Stupid iphone ringtone";
    }
    
    
    @Override
    public String unlock() {
    	return " iphone unlocked";
    }
    
    
    @Override
    public void displayInfo() {
    	String info = String.format("Iphone Details: \n Version Number: %s, \n Battery Percentage: %s, \n Carrier: %s, \n Ringtone: %s", this.getVersionNumber(), this.getBatteryPercentage(), this.getCarrier(), this.getRingTone());  
    	System.out.println(info);
    }
}

