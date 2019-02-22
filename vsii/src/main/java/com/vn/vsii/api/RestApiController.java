package com.vn.vsii.api;

import com.vn.vsii.Service.AccountService;
import com.vn.vsii.formatter.CustomErrorType;
import com.vn.vsii.model.Account;
import com.vn.vsii.model.Role;
import com.vn.vsii.repository.RoleRepository;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@Slf4j
@RestController
@RequestMapping("/api")
public class RestApiController {
    public  static final Logger logger = LoggerFactory.getLogger(RestApiController.class);
    @Autowired
    AccountService accountService;
    @Autowired
    RoleRepository roleRepository;
    @RequestMapping(value = "/account/",method = RequestMethod.GET)
    public ResponseEntity<Page<Account>> listAccount(Pageable pageable){
        Page<Account> accounts=accountService.findAll(pageable);
        if (accounts.isEmpty()){

            return new ResponseEntity<Page<Account>>(accounts, HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<Page<Account>>(accounts,HttpStatus.OK);
    }
    @RequestMapping(value = "/account/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> getUser(@PathVariable("id") long id) {
        logger.info("Fetching User with id {}", id);
        Account user = accountService.findById(id);
        if (user == null) {
            logger.error("User with id {} not found.", id);
            return  new ResponseEntity(new CustomErrorType("User with id " + id
                    + " not found"), HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Account>(user, HttpStatus.OK);
    }
    @RequestMapping(value = "/role",method = RequestMethod.GET)
    public ResponseEntity< Page<Role>> listRoles(Pageable pageable){
        Page<Role> roles=roleRepository.findAll(pageable);
        if (roles==null){
            return new ResponseEntity<Page<Role>>(roles, HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<Page<Role>>(roles, HttpStatus.OK);
    }

}
