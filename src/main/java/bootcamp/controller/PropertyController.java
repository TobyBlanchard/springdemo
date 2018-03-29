package bootcamp.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
}
