package assessment.ms.account.service;

import assessment.ms.account.common.TRequest;
import assessment.ms.account.common.TResponse;
import assessment.ms.account.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private RestTemplate restTemplate;


    public TResponse saveAcc(TRequest tRequest) {
    }
}
