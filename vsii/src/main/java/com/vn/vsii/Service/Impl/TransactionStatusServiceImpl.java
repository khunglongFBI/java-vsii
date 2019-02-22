package com.vn.vsii.Service.Impl;

import com.vn.vsii.Service.TransactionStatusService;
import com.vn.vsii.model.TransactionStatus;
import com.vn.vsii.repository.TransactionStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class TransactionStatusServiceImpl implements TransactionStatusService {
    @Autowired
    private TransactionStatusRepository transactionStatusRepository;
    @Override
    public Iterable<TransactionStatus> findAll() {
        return transactionStatusRepository.findAll();
    }

    @Override
    public TransactionStatus findById(Long id) {
        return transactionStatusRepository.findById(id).orElse(null);
    }

    @Override
    public void save(TransactionStatus billStatus) {
        transactionStatusRepository.save(billStatus);
    }

    @Override
    public void remove(Long id) {
        transactionStatusRepository.deleteById(id);
    }

    @Override
    public TransactionStatus findByName(String name) {
        return transactionStatusRepository.findByName(name);
    }
}
