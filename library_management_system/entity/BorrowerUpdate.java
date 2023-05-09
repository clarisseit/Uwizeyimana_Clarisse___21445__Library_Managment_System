package com.fsp.entity;

public class BorrowerUpdate {
	private String borrower_name;
	private String borrower_address;
	private String borrower_type;
	private String borrower_status;

	public BorrowerUpdate(String borrower_name, String borrower_address, String borrower_type, String borrower_status) {
		super();
		this.borrower_name = borrower_name;
		this.borrower_address = borrower_address;
		this.borrower_type = borrower_type;
		this.borrower_status = borrower_status;
	}


	public BorrowerUpdate() {
		super();
	}


	public String getBorrower_address() {
		return borrower_address;
	}

	public void setBorrower_address(String borrower_address) {
		this.borrower_address = borrower_address;
	}

	public String getBorrower_type() {
		return borrower_type;
	}

	public void setBorrower_type(String borrower_type) {
		this.borrower_type = borrower_type;
	}

	public String getBorrower_status() {
		return borrower_status;
	}

	public void setBorrower_status(String borrower_status) {
		this.borrower_status = borrower_status;
	}

	public String getBorrower_name() {
		return borrower_name;
	}

	public void setBorrower_name(String borrower_name) {
		this.borrower_name = borrower_name;
	}


	public String getBorrower_status_active() {
		return "Active";
	}

}

