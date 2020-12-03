/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.if1.pkg10119040.agusderidermawan;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author User
 * Nama : Agus Deri Dermawan
 * NIM  : 10119040
 * kelas: IF1
 * program menampilkan pembayaran sebuah kasir Rock n Roll haircut
 */
public class Customer extends ServicePrice implements CustomerInvoice {
    private String name, email;
    boolean member;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isMember() {
        return member;
    }

    public void setMember(boolean member) {
        this.member = member;
    }
    
    @Override
    public String currentTime() {
        LocalDateTime waktu = LocalDateTime.now();
        DateTimeFormatter FormatDate = DateTimeFormatter.ofPattern("EEEE, dd MMM yyyy HH:mm:ss");
        String formatWaktu = waktu.format(FormatDate);
        return formatWaktu;   
    }
}