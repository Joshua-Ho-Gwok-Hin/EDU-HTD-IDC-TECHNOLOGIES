package assessment.ms.account.controller;

import assessment.ms.account.common.TRequest;
import assessment.ms.account.common.TResponse;
import assessment.ms.account.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @PostMapping("/process-wallet")
    public TResponse process(@RequestBody TRequest tRequest) {
        return accountService.saveAcc(tRequest);
    }
}
