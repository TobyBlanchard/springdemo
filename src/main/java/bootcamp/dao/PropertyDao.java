package bootcamp.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import bootcamp.model.PropertyModel;

public class PropertyDao {

	private List<PropertyModel> list = new ArrayList<PropertyModel>();

	public PropertyDao() {
		list.add(new PropertyModel("Ashford", "123 Herodian Way", "Atlanta, GA 30067", "Unit 1"));
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

	public PropertyModel getPropertyByName(String name) {

		return null;
	}

}
