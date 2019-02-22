package com.vn.vsii.Service;

import com.vn.vsii.model.Account;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
public interface AccountService {
Page<Account> findAll(Pageable pageable);
    Account findById(Long id);
    void save(Account user);

    void remove(Long id);

    void setupRole(String role,Account account);

    Page<Account> findAllByStudentName(String nickname, Pageable pageable);

    Account findByUserName(String username);

}
