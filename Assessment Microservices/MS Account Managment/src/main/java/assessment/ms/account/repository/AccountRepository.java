package assessment.ms.account.repository;

import assessment.ms.account.enitity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Integer> {
}