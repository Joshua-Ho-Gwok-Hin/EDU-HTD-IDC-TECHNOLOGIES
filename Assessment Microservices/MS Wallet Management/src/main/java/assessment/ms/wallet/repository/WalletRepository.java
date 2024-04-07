package assessment.ms.wallet.repository;

import assessment.ms.wallet.entity.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WalletRepository extends JpaRepository<Wallet, Long> {
}