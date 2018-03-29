package bootcamp

import bootcamp.dao.PropertyDao
import bootcamp.model.PropertyModel
import spock.lang.Specification
import bootcamp.services.PropertyService

class PropertySpec extends Specification {
	

	
	def "another"(){
		given: "A property name"
		PropertyModel property = new PropertyModel();
		PropertyModel md = new PropertyModel();
		property.setName("Ashford");
		property.setAddress("123 Herodian Way");
		property.setCity("Atlanta, GA 30067");
		property.setUnitNumber("Unit 1");
		
		
		
		and: " A property DAO"
		PropertyDao propertyDao = Stub(PropertyDao.class);
		propertyDao.findAddress("Ashford") >> property;
		
		and: "A property service in test"
		PropertyService propertyService = new PropertyService()
		propertyService.propertyDao = propertyDao
		
		when: "A Property Name is entered"

		md = propertyService.getPropertyByName("Ashford")
		println md.getUnitNumber();		
		
		then: "The property name, address, and unit number is given"
		property == md;
		//property == propertyService.getPropertyByName("The Ritz");
		
		
	}
	

}
