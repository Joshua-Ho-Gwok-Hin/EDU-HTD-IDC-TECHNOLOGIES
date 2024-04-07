package assessment.ms.gateway;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import reactor.core.publisher.Mono;


public class FallBackController {

    private final static Logger log = LoggerFactory.getLogger(FallBackController.class);

    @RequestMapping("/account")
    public Mono<String> accountFallBack(){
        return Mono.just("There is something wrong with this account. " +
                "Please try again later");
    }

    @RequestMapping("/wallet")
    public Mono<String> walletFallBack(){
        return Mono.just("There is something wrong with this wallet. " +
                "Please try again later");
    }

    @GetMapping("/check")
    public ResponseEntity<String> createLogs(){
        log.warn("Just checking");
        return ResponseEntity.ok().body("Status ok");
    }
}
