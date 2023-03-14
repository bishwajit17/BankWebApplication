package com.bank.Main;

import java.util.Random;
import java.util.Set;

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
public class BankDetails {
	@Id
	@GeneratedValue
	@Column
	private Integer NumberOfAccount;
	@Column
	private String FullName;
	@Column
	private String DoB;
	@Column
	private long PhoneNumber;
	@Column
	private String Email;
	@Column
	private Integer Balance ;
	@Column
	private long AccountNumber ;
	@Column
	private long SortCode;
	@Column
	private String PinNumber;
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "PinNumber")
	private Set<Transaction> transaction;
	
	
	
	
	public BankDetails() {
		super();
	}
	public BankDetails(String fullName, String doB, long phoneNumber, String email,
			Integer balance, String pinNumber) {
		super();
		FullName = fullName;
		DoB = doB;
		PhoneNumber = phoneNumber;
		Email = email;
		Balance = balance;
		AccountNumber = new Random().nextInt(10000000);
		SortCode = new Random().nextInt(1000000);
		PinNumber = pinNumber;
	}
	
	public Integer getNumberOfAccount() {
		return NumberOfAccount;
	}
	public void setNumberOfAccount(Integer numberOfAccount) {
		NumberOfAccount = numberOfAccount;
	}
	public String getFullName() {
		return FullName;
	}
	public void setFullName(String fullName) {
		FullName = fullName;
	}
	public String getDoB() {
		return DoB;
	}
	public void setDoB(String doB) {
		DoB = doB;
	}
	public long getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public Integer getBalance() {
		return Balance;
	}
	public void setBalance(Integer balance) {
		Balance = balance;
	}
	public long getAccountNumber() {
		return AccountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		AccountNumber = accountNumber;
	}
	public long getSortCode() {
		return SortCode;
	}
	public void setSortCode(long sortCode) {
		SortCode = sortCode;
	}
	public String getPinNumber() {
		return PinNumber;
	}
	public void setPinNumber(String pinNumber) {
		PinNumber = pinNumber;
	}
	
	public Set<Transaction> getTransaction() {
		return transaction;
	}
	
	public void setTransaction(Set<Transaction> transaction) {
		this.transaction = transaction;
	}
	
	
	
}
