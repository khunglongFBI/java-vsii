package com.vn.vsii.repository;

import com.vn.vsii.model.Transaction;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface TransactionRepository  extends PagingAndSortingRepository<Transaction, Long> {
    Transaction findByTransId(Long id);
}