package com.vn.vsii.config;

import com.vn.vsii.model.Account;
import com.vn.vsii.model.Role;
import com.vn.vsii.model.TransactionStatus;
import com.vn.vsii.repository.AccountRepository;
import com.vn.vsii.repository.RoleRepository;
import com.vn.vsii.repository.TransactionStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.HashSet;

@Component
public class DataSeedingListener implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private TransactionStatusRepository billStatusRepository;
    @Override
    public void onApplicationEvent(ContextRefreshedEvent arg0) {
        if (roleRepository.findByName("ROLE_ADMIN") == null) {
            roleRepository.save(new Role("ROLE_ADMIN"));
        }

        if (roleRepository.findByName("ROLE_SUP") == null) {
            roleRepository.save(new Role("ROLE_SUP"));
        }

        if (roleRepository.findByName("ROLE_TELLER") == null) {
            roleRepository.save(new Role("ROLE_TELLER"));
        }
        if (billStatusRepository.findByName("temporarily saved") == null) {
            billStatusRepository.save(new TransactionStatus("temporarily saved"));
        }

        if (billStatusRepository.findByName("Wait for approval") == null) {
            billStatusRepository.save(new TransactionStatus("Wait for approval"));
        }

        if (billStatusRepository.findByName("approved") == null) {
            billStatusRepository.save(new TransactionStatus("approved"));
        }
        if (billStatusRepository.findByName("refuse") == null) {
            billStatusRepository.save(new TransactionStatus("refuse"));
        }

        if (accountRepository.findByUserName("admin") == null) {
            Account admin = new Account();
            admin.setUserName("admin");
            admin.setRole("ROLE_ADMIN");
            admin.setLocked(true);
            admin.setPassword(passwordEncoder.encode("123456"));
            HashSet<Role> roles = new HashSet<>();
            roles.add(roleRepository.findByName("ROLE_ADMIN"));
            admin.setRoles(roles);
            accountRepository.save(admin);
        }

        if (accountRepository.findByUserName("sup") == null) {
            Account user = new Account();
            user.setUserName("sup");
            user.setRole("ROLE_SUP");
            user.setLocked(true);
            user.setPassword(passwordEncoder.encode("123456"));
            HashSet<Role> roles = new HashSet<>();
            roles.add(roleRepository.findByName("ROLE_SUP"));
            user.setRoles(roles);
            accountRepository.save(user);
        }
        if (accountRepository.findByUserName("teller") == null) {
            Account user = new Account();
            user.setUserName("teller");
            user.setRole("ROLE_TELLER");
            user.setLocked(true);
            user.setPassword(passwordEncoder.encode("123456"));
            HashSet<Role> roles = new HashSet<>();
            roles.add(roleRepository.findByName("ROLE_TELLER"));
            user.setRoles(roles);
            accountRepository.save(user);
        }
    }


}
