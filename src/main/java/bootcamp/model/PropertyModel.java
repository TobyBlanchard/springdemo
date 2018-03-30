package bootcamp.model;

public class PropertyModel {

    private String name;
    private String address;
    private String city;
    private String unitNumber;
    
    
   public PropertyModel() {
	  
   }
   
   public PropertyModel(String name, String address, String city, String unitNumber) {
	   this.name = name;
	   this.address = address;
	   this.city = city;
	   this.unitNumber = unitNumber;
   }
   public void setName(String name) {
	this.name = name;
}

public void setAddress(String address) {
	this.address = address;
}

public void setUnitNumber(String unitNumber) {
	this.unitNumber = unitNumber;
}

public void setCity(String city) {
	this.city = city;
}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}
	
	public String getCity() {
		return city;
	}

	public String getUnitNumber() {
		return unitNumber;
	}
	
	
	

    
}
