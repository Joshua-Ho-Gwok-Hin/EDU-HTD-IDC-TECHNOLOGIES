package idc.orm.ControlSvcRepo;

import idc.orm.OneToMany.Employee;
import idc.orm.OneToMany.Qualification;
import idc.orm.OneToMany.ToDoTask;
import idc.orm.OneToOne.Login;
import idc.orm.OneToOne.UserProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Autowired
    private DemoService demoService;

    @PostMapping("/add-employee")
    public Employee addEmployee(@RequestBody Employee e) {
        e.getTaskList().forEach(t -> t.setEmployee(e));
        return demoService.save(e);
    }

    @PostMapping("/add-by-userprofile")
    public UserProfile addByUserProfile(@RequestBody UserProfile up) {
//        up.getLogin().setUserProfile(up);
        return demoService.save(up);
    }
//    {"firstName":"Peter","lastName":"Parker","login":{"username":"hellopeter", "password":"password"}}

    @PostMapping("/add-by-login")
    public Login addByUserLogin(@RequestBody Login lg) {
        return demoService.save(lg);
    }

//    {"username": "newuser","password": "password","userProfile": {"firstName": "Harry","lastName": "Potter"}}









}
