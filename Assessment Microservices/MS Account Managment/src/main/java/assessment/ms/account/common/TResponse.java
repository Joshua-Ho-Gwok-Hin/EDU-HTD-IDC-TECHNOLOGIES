package assessment.ms.account.common;

import assessment.ms.account.enitity.Account;
import lombok.Data;

@Data
public class TResponse {

    private Account account;
    private double amount;

}
