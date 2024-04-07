package assessment.security.controller;

import assessment.security.entity.AuthRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @GetMapping("/")
    public String helloWorld() {
        return "Hello World";
    }

    @GetMapping("auth")
    public String genToken(@RequestBody AuthRequest authRequest) {
        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(
                            authRequest.getUsername(),
                            authRequest.getPassword())
                    );

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
