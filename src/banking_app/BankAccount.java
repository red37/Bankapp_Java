/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking_app;

import java.util.Scanner;



/**
 *
 * @author Red
 */
public class BankAccount {
    String cName;
    String cId;
    double balance;
    double preTran;
    
    BankAccount(String cName, String cId){
        this.cName = cName;
        this.cId = cId;
    }
    
    
    void deposit(double amount){
        if (amount != 0){
        balance = balance + amount;
        preTran = amount;
        
    }}
       
    void withdraw(double amount){
        if(amount !=0){
            balance = balance - amount;
            preTran = - amount;
        } 
    }
    
    void getpretran(){
        if (preTran >0){
            System.out.println("Deposited: " + preTran);
            
        }
        else if (preTran <0){
            System.out.println("Withdrawn: " + Math.abs(preTran));
            
        }
        else{
            System.out.println("No transaction");
            
        }
    }
    
    void showMenu(){
         char option = 'o';
        Scanner lolyput = new Scanner(System.in);
         System.out.println("Welcome to your banking app");
         System.out.println("Your name is " + cName + " and your id is "+ cId);
         System.out.println("Your options are");
         System.out.println(" A. Check Balance ");
         System.out.println(" B. Withdraw");
         System.out.println(" C. Deposit");
         System.out.println(" D. Previous transaction");
         System.out.println(" E. Exit");
         
         do
         {
             System.out.println("++++++++++++++++++++++++++++++");
             
             System.out.println(" Please choose an option") ;
             option = Character.toUpperCase(lolyput.next().charAt(0));
             
             System.out.println("++++++++++++++++++++++++++++++");
             
            
             switch(option){
                 case 'A':
                    System.out.println("++++++++++++++++++++++++++++++");
                    
                    System.out.println("Balance is "+ balance) ;
                   
                    System.out.println("++++++++++++++++++++++++++++++");
                   
                    break;
                  
                   case 'B':
                    System.out.println("++++++++++++++++++++++++++++++");
                   
                    System.out.println("Please input how much you want to deposit") ;
                    double amount = lolyput.nextDouble();
                    deposit(amount);
                    System.out.println("++++++++++++++++++++++++++++++");
                    
                       break;
                          
                    case 'C':
                    System.out.println("++++++++++++++++++++++++++++++");
                                        
                    System.out.println("Please input how much you want to withdraw") ;
                    double cmount = lolyput.nextDouble();
                    withdraw(cmount);
                    System.out.println("++++++++++++++++++++++++++++++");
                   
                        break;
                          
                                              
                        
                    case 'D':
                    System.out.println("++++++++++++++++++++++++++++++");
                    getpretran();
                    System.out.println("++++++++++++++++++++++++++++++");
                    
                        break;
                          
                    case 'E':
                    System.out.println("++++++++Exiting+++++++++++++");
                    break;
                        
                   default:
                   System.out.println("Please input a valid option");
                  
                   break;

             }
         }while(option!='E');
        System.out.println("Thank you for our service");
    }
    
}
