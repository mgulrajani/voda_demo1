package com.training.model;

public class OffShoreAccount extends Account {
	
	private String nation;
	private String taxCode;
	
	public OffShoreAccount(long id,double bal,String nation,String taxCode) {
		//super( ) will invoke parent class constructor
		super(id,bal);
		this.nation=nation;
		this.taxCode=taxCode;
		
		
	}
	//getters and setters
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	public String getTaxCode() {
		return taxCode;
	}
	public void setTaxCode(String taxCode) {
		this.taxCode = taxCode;
	}
	@Override
	public String toString() {
		return "OffShoreAccount [=" +super.toString()+" "+ nation + ", taxCode=" + taxCode + "]";
	}
	@Override
	public void addInterest(double amt) {
		// TODO Auto-generated method stub
		double bal = this.getBalance()+amt;
		this.setBalance(bal);
		System.out.println("amt is added as an interest ,offshore account");
		
	}
	
	

}
