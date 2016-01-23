//Author: Mike Jones
//from a UML implements the Account class.

import java.util.Date;
public class Account{
   private int Id;
   private double balance;
   private double annualInterestRate;
   private Date DateCreated;
//constructor
   public Account(int i, double b, double a,Date d){
      Id = i;
      balance = b;
      annualInterestRate = a;
      DateCreated = d;
   }
   
   //setters or modifiers
   public void setId(int i){
      Id = i;
   }
   public void setBalance(double b){
      balance = b;
   }
   public void setAnnualInterestRate(double a){
      annualInterestRate = a;
   }
   //getters or returns
   public int getId(){
      return Id;
   }
   public double getBalance(){
      return balance;
   }
   public double getAnnualInterestRate(){
      return annualInterestRate;
   }
   public Date getDateCreated(){
      return DateCreated;
   }
   public double getMonthlyInterestRate(){
      return annualInterestRate/12;
   }
   public double getMonthlyInterest(){
      return balance * (annualInterestRate/12);
   }
   double withDrawal;
   double deposit;
   //methods
   public void Withdrawal(double amount){
      balance -= amount;
   }
   public void deposit(double amount){
      balance += amount;
   }

}