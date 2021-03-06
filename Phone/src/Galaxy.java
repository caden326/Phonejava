

public class Galaxy extends Phone implements Ringable  {
	
	public Galaxy(String versionNumberInput, int batteryPercentageInput, String carrierInput, String ringtoneInput) {
//		this.versionNumber = versionNumberInput;
//    	this.batteryPercentage = batteryPercentageInput;
//    	this.carrier = carrierInput;
//    	this.ringTone = ringtoneInput;
		super(versionNumberInput, batteryPercentageInput, carrierInput, ringtoneInput );
	}

	@Override
	public void displayInfo() {
		// TODO Auto-generated method stub
		
		String info = String.format("Galaxy Details: \n Version Number: %s, \n Battery Percentage: %s, \n Carrier: %s, \n Ringtone: %s", this.getVersionNumber(), this.getBatteryPercentage(), this.getCarrier(), this.getRingTone());
		
		System.out.println(info);
		
	}

	@Override
	public String ring() {
		return "Pleasant Galaxy ringtone";
	}
	
	@Override
	public String unlock() {
		return "Galaxy is unlocked";
	}

	
	
	
	
	

}