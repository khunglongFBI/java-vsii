package com.vn.vsii.Service.Impl;

import com.vn.vsii.Service.AccountService;
import com.vn.vsii.model.Account;
import com.vn.vsii.model.Role;
import com.vn.vsii.repository.AccountRepository;
import com.vn.vsii.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import java.util.HashSet;
import java.util.Set;
@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    AccountRepository accountRepository;
    @Autowired
    RoleRepository roleRepository;
    @Override
    public Page<Account> findAll(Pageable pageable) {
        return accountRepository.findAll(pageable);
    }

    @Override
    public Account findById(Long id) {
        return accountRepository.findAllById(id).orElse(null);
    }

    @Override
    public void save(Account user) {
    accountRepository.save(user);
    }

    @Override
    public void remove(Long id) {
        accountRepository.deleteById(id);
    }

    @Override
    public void setupRole(String role, Account account) {
        Set<Role> roles=new HashSet<>();
        roles.add(roleRepository.findByName(role));

    }

    @Override
    public Page<Account> findAllByStudentName(String nickname, Pageable pageable) {
        return null;
    }

    @Override
    public Account findByUserName(String username) {
        return accountRepository.findByUserName(username);
    }


}
