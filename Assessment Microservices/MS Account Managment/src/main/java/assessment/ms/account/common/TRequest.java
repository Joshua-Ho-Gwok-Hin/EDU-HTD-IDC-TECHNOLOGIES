package assessment.ms.account.common;

import assessment.ms.account.enitity.Account;
import lombok.Data;

@Data
public class TRequest {

    private Account account;
    private Wallet wallet;
}
