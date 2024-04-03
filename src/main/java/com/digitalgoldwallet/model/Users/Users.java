package com.digitalgoldwallet.model.Users;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.digitalgoldwallet.model.Addresses.Addresses;

@Entity
@Table(name="USERS")
public class Users {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="USER_ID")
	private int userId;
	@Column(name="EMAIL")
	private String email;
	@Column(name="NAME")
	private String name;
	@ManyToOne
	@JoinColumn(name="ADDRESS_ID")
	private Addresses address;
	@Column(name="BALANCE")
	private double balance;
	@Column(name="CREATED_AT")
	private LocalDateTime createdAt;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Addresses getAddress() {
		return address;
	}
	public void setAddress(Addresses address) {
		this.address = address;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public LocalDateTime getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}
	@Override
	public String toString() {
		return "Users [userId=" + userId + ", address=" + address + ", balance=" + balance + ", createdAt=" + createdAt
				+ "]";
	}
}