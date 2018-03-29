package bootcamp;

public class PropertyModel {
	
	 private String name;
	    private String address;
	    private String unitNumber;
	    
	   public PropertyModel() {
		   this.name = "Ashford";
		   this.address = "123 Herodian Way, Atlanta, GA 30067";
		   this.unitNumber = "unit 1";
		   
	   }

	    public PropertyModel(String name, String address, String unitNumber) {
	        this.name = name;
	        this.address = address;
	        this.unitNumber = unitNumber;
	    }

		public String getName() {
			return name;
		}

}
