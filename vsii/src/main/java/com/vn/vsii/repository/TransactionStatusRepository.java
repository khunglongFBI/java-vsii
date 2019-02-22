package com.vn.vsii.repository;

import com.vn.vsii.model.TransactionStatus;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionStatusRepository  extends PagingAndSortingRepository<TransactionStatus, Long> {
    TransactionStatus findByName(String name);
}
