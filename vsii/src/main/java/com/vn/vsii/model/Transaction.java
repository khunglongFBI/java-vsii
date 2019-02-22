package com.vn.vsii.model;

import org.springframework.format.annotation.DateTimeFormat;
import javax.persistence.*;
import java.util.Date;

@Entity
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long bill_id;
    private long transId;
    private String trans_type_code;
    private String cust_ref;
    private String bidv_ref;
    private String cust_name;
    private String cust_address;
    private int cif_no;
    private float amount;
    private String curr_code;
    private String remark;
    @ManyToOne
    @JoinColumn(name = "trans_status_code")
    private TransactionStatus trans_status_code;
    private int is_confirm;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date create_date;
    private String create_user;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date send_date;
    private String send_user;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date apporve_reject_date;
    private String approve_reject_user;
    private String trans_id_code;
    private String branch_code;
    private int create_by;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date payment_date;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date effective_date;
    private String update_user;
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private Date update_date;


    public Transaction(long transId, String trans_type_code, String cust_ref, String bidv_ref, String cust_name, String cust_address, int cif_no, float amount, String curr_code, String remark, TransactionStatus trans_status_code, int is_confirm, Date create_date, String create_user, Date send_date, String send_user, Date apporve_reject_date, String approve_reject_user, String trans_id_code, String branch_code, int create_by, Date payment_date, Date effective_date, String update_user, Date update_date) {
        this.transId = transId;
        this.trans_type_code = trans_type_code;
        this.cust_ref = cust_ref;
        this.bidv_ref = bidv_ref;
        this.cust_name = cust_name;
        this.cust_address = cust_address;
        this.cif_no = cif_no;
        this.amount = amount;
        this.curr_code = curr_code;
        this.remark = remark;
        this.trans_status_code = trans_status_code;
        this.is_confirm = is_confirm;
        this.create_date = create_date;
        this.create_user = create_user;
        this.send_date = send_date;
        this.send_user = send_user;
        this.apporve_reject_date = apporve_reject_date;
        this.approve_reject_user = approve_reject_user;
        this.trans_id_code = trans_id_code;
        this.branch_code = branch_code;
        this.create_by = create_by;
        this.payment_date = payment_date;
        this.effective_date = effective_date;
        this.update_user = update_user;
        this.update_date = update_date;
    }

    public Transaction() {
    }

    public long getTransId() {
        return transId;
    }

    public void setTransId(long transId) {
        this.transId = transId;
    }

    public String getTrans_type_code() {
        return trans_type_code;
    }

    public void setTrans_type_code(String trans_type_code) {
        this.trans_type_code = trans_type_code;
    }

    public String getCust_ref() {
        return cust_ref;
    }

    public void setCust_ref(String cust_ref) {
        this.cust_ref = cust_ref;
    }

    public String getBidv_ref() {
        return bidv_ref;
    }

    public void setBidv_ref(String bidv_ref) {
        this.bidv_ref = bidv_ref;
    }

    public String getCust_name() {
        return cust_name;
    }

    public void setCust_name(String cust_name) {
        this.cust_name = cust_name;
    }

    public String getCust_address() {
        return cust_address;
    }

    public void setCust_address(String cust_address) {
        this.cust_address = cust_address;
    }

    public int getCif_no() {
        return cif_no;
    }

    public void setCif_no(int cif_no) {
        this.cif_no = cif_no;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public String getCurr_code() {
        return curr_code;
    }

    public void setCurr_code(String curr_code) {
        this.curr_code = curr_code;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public TransactionStatus getTrans_status_code() {
        return trans_status_code;
    }

    public void setTrans_status_code(TransactionStatus trans_status_code) {
        this.trans_status_code = trans_status_code;
    }

    public int getIs_confirm() {
        return is_confirm;
    }

    public void setIs_confirm(int is_confirm) {
        this.is_confirm = is_confirm;
    }

    public Date getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }

    public String getCreate_user() {
        return create_user;
    }

    public void setCreate_user(String create_user) {
        this.create_user = create_user;
    }

    public Date getSend_date() {
        return send_date;
    }

    public void setSend_date(Date send_date) {
        this.send_date = send_date;
    }

    public String getSend_user() {
        return send_user;
    }

    public void setSend_user(String send_user) {
        this.send_user = send_user;
    }

    public Date getApporve_reject_date() {
        return apporve_reject_date;
    }

    public void setApporve_reject_date(Date apporve_reject_date) {
        this.apporve_reject_date = apporve_reject_date;
    }

    public String getApprove_reject_user() {
        return approve_reject_user;
    }

    public void setApprove_reject_user(String approve_reject_user) {
        this.approve_reject_user = approve_reject_user;
    }

    public String getTrans_id_code() {
        return trans_id_code;
    }

    public void setTrans_id_code(String trans_id_code) {
        this.trans_id_code = trans_id_code;
    }

    public String getBranch_code() {
        return branch_code;
    }

    public void setBranch_code(String branch_code) {
        this.branch_code = branch_code;
    }

    public int getCreate_by() {
        return create_by;
    }

    public void setCreate_by(int create_by) {
        this.create_by = create_by;
    }

    public Date getPayment_date() {
        return payment_date;
    }

    public void setPayment_date(Date payment_date) {
        this.payment_date = payment_date;
    }

    public Date getEffective_date() {
        return effective_date;
    }

    public void setEffective_date(Date effective_date) {
        this.effective_date = effective_date;
    }

    public String getUpdate_user() {
        return update_user;
    }

    public void setUpdate_user(String update_user) {
        this.update_user = update_user;
    }

    public Date getUpdate_date() {
        return update_date;
    }

    public void setUpdate_date(Date update_date) {
        this.update_date = update_date;
    }

    public long getBill_id() {
        return bill_id;
    }

    public void setBill_id(long bill_id) {
        this.bill_id = bill_id;
    }
}
