package bootcamp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import bootcamp.dao.PropertyDao;
import bootcamp.model.PropertyModel;


@Controller
public class PropertyService {
	
	@Autowired
	private PropertyDao propertyDao;

	public PropertyModel getPropertyByName(String name) {
		return propertyDao.findAddress(name);
	}

	public List<PropertyModel> getMethod() {
		List<PropertyModel> list = propertyDao.getMethod();
		return list;
	}

	public List<PropertyModel> postMethod(PropertyModel pm) {
		List<PropertyModel> list = propertyDao.postMethod(pm);
		return list;
	}	
	
	
}
