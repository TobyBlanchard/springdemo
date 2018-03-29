
//package bootcamp;
//
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.web.servlet.MockMvc;
//
//import groovy.model.PropertyModel;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//@AutoConfigureMockMvc
//public class GreetingControllerTests {
//
//    @Autowired
//    private MockMvc mockMvc;
//    @Autowired
//   PropertyModel property;
//
//    @Test
//    public void setPropertyName(String name) throws Exception {
//
//        this.mockMvc.perform(get("/addresslookup")).andDo(print()).andExpect(status().isOk())
//                .andExpect(jsonPath("$.content").value(name));
//    }
//
////    @Test
////    public void displayCompleteAddress() throws Exception {
////
////        this.mockMvc.perform(get("/addresslookup").param("name", "Spring Community"))
////                .andDo(print()).andExpect(status().isOk())
////                .andExpect(jsonPath("$.content").value("Hello, Spring Community!"));
////    }
//
//}
