package org.rest.api.data;

import org.rest.api.data.DAO.AccountsDAO;
import org.rest.api.data.Entities.Accounts;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@EnableDiscoveryClient
@SpringBootApplication
public class Application {
    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
    @Bean
    public CommandLineRunner demo(AccountsDAO accountsDAO) {
        return (args) ->{
            for (Accounts account : accountsDAO.findAll()) {
                log.info(account.toString());

                //log.info same as system.out.print
                //System.out.println(account.toString());
            }
        };
    }
}
