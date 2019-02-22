package com.vn.vsii.Service;


import com.vn.vsii.model.TransactionStatus;

public interface TransactionStatusService {
    Iterable<TransactionStatus> findAll();

    TransactionStatus findById(Long id);

    void save(TransactionStatus bill);

    void remove(Long id);

    TransactionStatus findByName(String name);
}

