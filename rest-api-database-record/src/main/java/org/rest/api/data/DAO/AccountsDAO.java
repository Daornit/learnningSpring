package org.rest.api.data.DAO;

import org.rest.api.data.Entities.Accounts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AccountsDAO extends JpaRepository<Accounts, String> {
    List<Accounts> findByFirstName(String firstName);
}
