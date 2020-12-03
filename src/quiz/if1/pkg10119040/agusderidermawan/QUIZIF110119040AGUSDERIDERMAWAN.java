/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.if1.pkg10119040.agusderidermawan;

import java.util.Scanner;

/**
 *
 * @author User
 * Nama : Agus Deri Dermawan
 * NIM  : 10119040
 * kelas: IF1
 * program menampilkan pembayaran sebuah kasir Rock n Roll haircut
 */
public class QUIZIF110119040AGUSDERIDERMAWAN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Customer costumer = new Customer();
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("===Program Kasir Rock n Roll Haircut");
        System.out.print("Customer Name : ");
        costumer.setName(input.nextLine());
        System.out.print("Customer Email : ");
        costumer.setEmail(input.nextLine());
        
        costumer.displayService();
        costumer.getPrice(input.nextInt());
        
        System.out.print("Are you Member (yes/no) : ");
        costumer.setMember(costumer.checkMemberStatus(input.next()));
        
        System.out.println("#**************************#");
        System.out.println("#*****CUSTOMER INVOICE*****#");
        System.out.println("Date Transaction : ".concat(costumer.currentTime()));
        System.out.println("Service Price : " + costumer.getPriceService());
        costumer.getSale(costumer.isMember(), costumer.getPriceService());
        System.out.println("Discount : " + costumer.getSale(costumer.isMember(), costumer.getPriceService()));
        System.out.println("Service Price : " + costumer.getTotalPay(costumer.getPriceService(), costumer.getSale(costumer.isMember(), costumer.getPriceService())));       
    }
    
}