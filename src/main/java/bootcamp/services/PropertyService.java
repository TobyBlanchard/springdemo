package bootcamp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import bootcamp.dao.PropertyDao;
import bootcamp.model.PropertyModel;


public class PropertyService {
	
	
	private PropertyDao propertyDao;

	public void getPropertyByName(String name) {
		String property = propertyDao.findAddress("Ashford");
		System.out.println(property);
		//return propertyDao.getPropertyByName();
		//return property;
	}	
	
public void setPropertyDao(PropertyDao propertyDao) {
		this.propertyDao = propertyDao;
	}	
}
