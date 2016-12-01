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
public class Banking_App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String cid, cname;
        Scanner keyput = new Scanner(System.in);
        System.out.println("Please name");
        cname = keyput.nextLine();
        System.out.println("Please id");
        cid=keyput.nextLine();
        
        BankAccount newAcc = new BankAccount(cname, cid);
        newAcc.showMenu();
    }
    
}
