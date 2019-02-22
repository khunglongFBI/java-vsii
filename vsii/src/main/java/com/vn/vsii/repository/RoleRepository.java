package com.vn.vsii.repository;

import com.vn.vsii.model.Role;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends PagingAndSortingRepository<Role,Long> {

    Role findByName(String role);
}
