package bootcamp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import bootcamp.model.PropertyModel;
import bootcamp.services.PropertyService;

@RestController
public class PropertyController {

	@Autowired
    PropertyService propertyService;

    @RequestMapping("/addresslookup")
    public PropertyModel getAddressByPropertyName(@RequestParam String name) {
        return propertyService.getPropertyByName(name);
    }
    
    @RequestMapping(name = "/method", method = RequestMethod.GET)
    public List<PropertyModel> getMethod() {
    	List<PropertyModel> list = propertyService.getMethod();
    	return list;
    }
    
    @RequestMapping(name = "/method", method = RequestMethod.POST)
    @ResponseBody
    public List<PropertyModel> postMethod(@RequestBody PropertyModel pm){
		List<PropertyModel> list = propertyService.postMethod(pm);
    	return list;
    }
}
