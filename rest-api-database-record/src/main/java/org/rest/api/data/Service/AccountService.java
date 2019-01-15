package org.rest.api.data.Service;

import org.rest.api.data.Application;
import org.rest.api.data.DAO.AccountsDAO;
import org.rest.api.data.Entities.Accounts;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    @Autowired
    AccountsDAO accountsDAO;

    public Accounts saveAccount(Accounts account){
        log.info(account.getEmail() + " is registered!");
        return accountsDAO.save(account);
    }

    public List<Accounts> showAccounts(){
        log.info("Account table is selected!");
        return accountsDAO.findAll();
    }
}
