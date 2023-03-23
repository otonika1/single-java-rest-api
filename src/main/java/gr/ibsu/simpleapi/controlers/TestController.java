package gr.ibsu.simpleapi.controlers;

import gr.ibsu.simpleapi.dto.Test;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/test")
public class TestController {
    @RequestMapping(value = "/call",method = RequestMethod.GET, produces = {"application/json"})
    public Test test(){
        return new Test("Ilia","Chavchavadze");
    }
    @RequestMapping(value = "/post",method = RequestMethod.POST, produces = {"application/json"})
    public Test testPost(@RequestBody Test test){
        System.out.println(test.getFirstName() + " " + test.getLastName());
        return new Test(test.getFirstName() + " from server", test.getLastName());
    }
}
