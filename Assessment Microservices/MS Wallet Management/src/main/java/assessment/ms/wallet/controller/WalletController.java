package assessment.ms.wallet.controller;

import assessment.ms.wallet.entity.Wallet;
import assessment.ms.wallet.service.WalletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/wallet")
public class WalletController {

    @Autowired
    private WalletService walletService;

    @PostMapping("/process")
    public Wallet addAmount(@RequestBody Wallet wallet){
        return walletService.walletGo(wallet);
    }
}
