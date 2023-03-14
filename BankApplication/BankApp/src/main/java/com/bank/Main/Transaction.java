package com.bank.Main;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Transaction {
	@Id
	@GeneratedValue
	@Column
	private Integer NumberOfTransaction;
	@Column
	private Integer WithDrawbalance;
	@Column
	private Integer Depostibalance;
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "PinNumber")
	private BankDetails bankdetails;
	
	public Transaction(Integer withDrawbalance, Integer depostibalance, BankDetails bankdetails) {
		super();
		WithDrawbalance = withDrawbalance;
		Depostibalance = depostibalance;
		this.bankdetails = bankdetails;
	}
	public Integer getWithDrawbalance() {
		return WithDrawbalance;
	}
	public void setWithDrawbalance(Integer withDrawbalance) {
		if(bankdetails.getBalance() >= withDrawbalance) {
			WithDrawbalance = bankdetails.getBalance() - withDrawbalance;
		}else {
			System.out.println("Insufficent balance");
		}
		
	}
	public Integer getDepostibalance() {
		return Depostibalance;
	}
	public void setDepostibalance(Integer depostibalance) {
		Depostibalance = depostibalance;
	}
	public BankDetails getBankdetails() {
		return bankdetails;
	}
	public void setBankdetails(BankDetails bankdetails) {
		this.bankdetails = bankdetails;
	}

	
}
