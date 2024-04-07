package assessment.ms.wallet.service;

import assessment.ms.wallet.entity.Wallet;
import assessment.ms.wallet.repository.WalletRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;
import java.util.UUID;

@Service
public class WalletService {

    @Autowired
    private WalletRepository walletRepository;

    public Wallet walletGo(Wallet wallet) {
        wallet.setStatus(walletProcessing());
        wallet.setTId(UUID.randomUUID().toString());
        return walletRepository.save(wallet);
    }

    private String walletProcessing(){
        return new Random().nextBoolean()?"Ok":"No";
    }

}
