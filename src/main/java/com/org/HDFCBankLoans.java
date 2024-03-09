package com.org;

public class HDFCBankLoans extends BankServices{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HDFCBankLoans hdl = new HDFCBankLoans();
		hdl.educationLoan();
		hdl.homeLoan();
	}
	public void agricultureLoan()
	{
		System.out.println("19%");
	}
	public void insurance()
	{
		System.out.println("18%");
	}
	public  void educationLoan()
	{
		System.out.println("20%");
	}
	public  void homeLoan() 
	{
		System.out.println("21%");
	}
	public  void medicalLoan()
	{
		System.out.println("19%");
	}
	

}
