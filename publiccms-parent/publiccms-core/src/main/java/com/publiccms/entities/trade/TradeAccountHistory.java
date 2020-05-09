package com.publiccms.entities.trade;
// Generated 2019-6-16 9:22:05 by Hibernate Tools 6.0.0-SNAPSHOT

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.publiccms.common.database.CmsUpgrader;
import com.publiccms.common.generator.annotation.GeneratorColumn;

/**
 * TradeAccountHistory generated by hbm2java
 */
@Entity
@Table(name = "trade_account_history")
public class TradeAccountHistory implements java.io.Serializable {

    /**
    *
    */
    private static final long serialVersionUID = 1L;

    @GeneratorColumn(title = "ID")
    private Long id;
    @GeneratorColumn(title = "站点ID", condition = true)
    @JsonIgnore
    private short siteId;
    @GeneratorColumn(title = "流水号")
    private String serialNumber;
    @GeneratorColumn(title = "账户ID", condition = true)
    private long accountId;
    @GeneratorColumn(title = "用户ID", condition = true)
    private Long userId;
    @GeneratorColumn(title = "变动")
    private BigDecimal amountChange;
    @GeneratorColumn(title = "金额")
    private BigDecimal amount;
    @GeneratorColumn(title = "余额")
    private BigDecimal balance;
    @GeneratorColumn(title = "状态", condition = true)
    private int status;
    @GeneratorColumn(title = "描述")
    private String description;
    @GeneratorColumn(title = "创建日期", condition = true, order = true)
    private Date createDate;

    public TradeAccountHistory() {
    }

    public TradeAccountHistory(short siteId, String serialNumber, long accountId, BigDecimal amountChange, BigDecimal amount,
            BigDecimal balance, int status, Date createDate) {
        this.siteId = siteId;
        this.serialNumber = serialNumber;
        this.accountId = accountId;
        this.amountChange = amountChange;
        this.amount = amount;
        this.balance = balance;
        this.status = status;
        this.createDate = createDate;
    }

    public TradeAccountHistory(short siteId, String serialNumber, long accountId, Long userId, BigDecimal amountChange,
            BigDecimal amount, BigDecimal balance, int status, String description, Date createDate) {
        this.siteId = siteId;
        this.serialNumber = serialNumber;
        this.accountId = accountId;
        this.userId = userId;
        this.amountChange = amountChange;
        this.amount = amount;
        this.balance = balance;
        this.status = status;
        this.description = description;
        this.createDate = createDate;
    }

    @Id
    @GeneratedValue(generator = "cmsGenerator")
    @GenericGenerator(name = "cmsGenerator", strategy = CmsUpgrader.IDENTIFIER_GENERATOR)

    @Column(name = "id", unique = true, nullable = false)
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "site_id", nullable = false)
    public short getSiteId() {
        return this.siteId;
    }

    public void setSiteId(short siteId) {
        this.siteId = siteId;
    }

    @Column(name = "serial_number", nullable = false, length = 100)
    public String getSerialNumber() {
        return this.serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Column(name = "account_id", nullable = false)
    public long getAccountId() {
        return this.accountId;
    }

    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }

    @Column(name = "user_id")
    public Long getUserId() {
        return this.userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Column(name = "amount_change", nullable = false, precision = 10)
    public BigDecimal getAmountChange() {
        return this.amountChange;
    }

    public void setAmountChange(BigDecimal amountChange) {
        this.amountChange = amountChange;
    }

    @Column(name = "amount", nullable = false, precision = 10)
    public BigDecimal getAmount() {
        return this.amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    @Column(name = "balance", nullable = false, precision = 10)
    public BigDecimal getBalance() {
        return this.balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    @Column(name = "status", nullable = false)
    public int getStatus() {
        return this.status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Column(name = "description")
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "create_date", nullable = false, length = 19)
    public Date getCreateDate() {
        return this.createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

}
