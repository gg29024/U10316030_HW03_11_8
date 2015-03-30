//U10316030
//·¨¤l¨|
//11.8


import java.util.ArrayList;
import java.util.Scanner;

public class TestAccount{
	//Main method
    public static void main(String[] args) {
		
		Account object = new Account(1122,1000,"George");
		object.setAnnualInterestRate(1.5);
		object.Deposit(30);
		object.Deposit(40);
		object.Deposit(50);
		object.Withdraw(5);
		object.Withdraw(4);
		object.Withdraw(2);
		System.out.println(object.toString());
		for(int i = 0; i<6 ; i++){
			System.out.println(object.transactions.get(i).toString());
		}
		
	}

}
	
	
class Account{
	//Data fields
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private java.util.Date dateCreated;
	private String name;
	
	//Construct a no-arg constructor
	Account(){
	
	dateCreated = new java.util.Date();
	
	}
	
	//Constructor with the specified id and balance
	Account(int id, double balance,String name){
	
    this.id = id;
    this.balance = balance;
	this.name = name;
	dateCreated = new java.util.Date();
	
	}
	
	//Create a list to store transactions
	ArrayList<Transaction> transactions = new ArrayList<Transaction>();
	
	
	
	//Return id
	public int getID(){
	
		return id;
		
	}
	
	//Set a new id
	public void setID(int id){
	
		this.id = id;
	
	}
	
	//Return balance
	public double getBalance(){
	
		return balance;
	
	}
	//Set a new balance
	public void setBalance(double balance){
	
		this.balance = balance;
	
	}
	
	//Set a new annualInterestRater
	public void setAnnualInterestRate(double annualInterestRate){
	
		this.annualInterestRate = annualInterestRate;
	
	}
	
	//Get dateCreated
	public java.util.Date getDateCreated(){
	
		return dateCreated;
		
	}
	
	//Return name
	public String getName(){
		
		return name;
		
	}
	
	//Set a new name
	public void  setName(String name){
		
		this.name = name;
		
	}
	
	//Return MonthlyInterestRate
	public double getMonthlyInterestRate(){
	
		return annualInterestRate / 12;
	
	}
	
	//Return MonthlyInterest
	public double getMonthlyInterest(){
	
		return balance*getMonthlyInterestRate()/100;
	
	}
	
	//set withdraw
	public void Withdraw(double take){
		
		balance = balance - take;
		transactions.add(new Transaction(take, balance,'W', ""));
		
	}
	
	//set deposit
	public void Deposit(double store){
		
		balance = balance + store;
		transactions.add(new Transaction(store,balance, 'D', ""));
		
	}
	
	
	//Return a string representation of this object
	public String toString(){
	
		return "Name: " + getName() + "  ID: " + getID() +  "  MonthlyInterest: " + getMonthlyInterest() + "  Balance: " +getBalance() + "\n";
	
	}

}




class Transaction{
	
	private double amount = 0;
	private double balance = 0;
	private char type;
	private String description;
	private java.util.Date dateCreated;
	
	
	
	Transaction(double amount,double balance,char type,String description){
		
		this.amount = amount;
		this.balance = balance;
		this.type = type;
		this.description = description;
		dateCreated = new java.util.Date();
	
	}
	
	//return amount
	public double getAmount(){
	
		return amount;
		
	}
		
	//set a new amount
	public void setAmount(double amount){
	
		this.amount = amount;
		
	}
	
	//return balance
	public double getBalance(){
	
		return balance;
	
	}
	
	//set a new balance
	public void setBalance(double balance){
	
		this.balance = balance;
	
	}
	
	//return type
	public char getType(){
	
		return type;
	
	}
	
	//set a new type
	public void setType(char type){
	
		this.type = type;
	
	}
	
	//return description
	public String getDescription(){
	
		return description;
	
	}
	
	//set a new description
	public void setDescription(String description){
	
		this.description = description;
	
	}
	
	//Get dateCreated
	public java.util.Date getDateCreated(){
	
		return dateCreated;
		
	}
	
	//Return a string representation of this object
	public String toString(){
		
		return "Amount: " + getAmount() + "  Balance: " + getBalance() + "  Type: " + getType() + "  Description: " + getDescription() + "\n";
	
	}

	
}