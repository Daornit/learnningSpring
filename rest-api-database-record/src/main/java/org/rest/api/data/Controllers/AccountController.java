package org.rest.api.data.Controllers;

import org.rest.api.data.Application;
import org.rest.api.data.Entities.Accounts;
import org.rest.api.data.Service.AccountService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/account")
public class AccountController {
    private static final Logger log = LoggerFactory.getLogger(Application.class);

    @Autowired
    private AccountService accountService;

    @PostMapping(value = "/save")
    public @ResponseBody Accounts createAccount(@RequestBody Accounts account){
        return accountService.saveAccount(account);
    }
    @GetMapping(value = "/show")
    public @ResponseBody List<Accounts> showAccount(){
        return accountService.showAccounts();
    }
}