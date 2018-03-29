package bootcamp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import bootcamp.dao.PropertyDao;
import bootcamp.model.PropertyModel;


public class PropertyService {
	
	@Autowired
	private PropertyDao propertyDao;

	public PropertyModel getPropertyByName(String name) {
		return propertyDao.findAddress(name);
	}	
	
	
}
