package com.vn.vsii.formatter;

import com.vn.vsii.Service.TransactionStatusService;
import com.vn.vsii.model.TransactionStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.Locale;

@Component
public class TransactionStatusFormatter implements Formatter<TransactionStatus> {

    @Autowired
    private TransactionStatusService billStatusService;
    @Autowired
    public TransactionStatusFormatter(TransactionStatusService billStatusService) {
        this.billStatusService = billStatusService;
    }

    @Override
    public TransactionStatus parse(String text, Locale locale) throws ParseException {
        return billStatusService.findById(Long.parseLong(text));
    }

    @Override
    public String print(TransactionStatus object, Locale locale) {
        return "[" + object.getStatus_id() + ", " +object.getName() + "]";
    }
}
