package com.vn.vsii.Service;


import com.vn.vsii.model.Transaction;
import org.springframework.data.domain.Page;
        import org.springframework.data.domain.Pageable;


public interface TransactionService {
    Page<Transaction> findAll(Pageable pageable);

    Transaction findById(Long id);

    void save(Transaction bill);

    void remove(Long id);

    Transaction findByTransId(long id);

}
