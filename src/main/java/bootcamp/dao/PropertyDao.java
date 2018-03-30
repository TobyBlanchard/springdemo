package bootcamp.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;

import bootcamp.model.PropertyModel;

@Controller
public class PropertyDao {
	
	private List<PropertyModel> list = new ArrayList<PropertyModel>();

	public PropertyDao() {
		list.add(new PropertyModel("Ashford", "123 Herodian Way", "Atlanta, GA 30067", "Unit 1"));
		list.add(new PropertyModel("Ashford", "123 Herodian Way", "Atlanta, GA 30067", "Unit 2"));
	}

	public PropertyModel findAddress(String name) {
		PropertyModel returnProperty = null;

		for (PropertyModel p : list) {
			if (p.getName().equals(name)) {
				returnProperty = p;
			}
		}

		return returnProperty;

	}

	public List<PropertyModel> getMethod() {
		return list;
	}

	public List<PropertyModel> postMethod(PropertyModel pm) {
		list.add(pm);
		return list;
	}



}
