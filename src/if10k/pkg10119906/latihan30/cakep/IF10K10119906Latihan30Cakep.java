/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if10k.pkg10119906.latihan30.cakep;
import java.util.Scanner;

/**
 *
 * @author senenngahenen
 * Nama     : Rizqy Ananda RUsmana
 * NIM      : 10119906
 * Kelas    : IF-10K
 * Deskripsi Program : program yang berisi pertanyaan (berwarna) sesuai dengan pilihan.
 */
public class IF10K10119906Latihan30Cakep {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println((char)27+"[01;31m Kamu"+(char)27+"[00;00m" +(char)27+"[01;32m ngerjain sendiri"+(char)27+"[00;00m"
        +(char)27+"[01;33m latihan 17 sampe"+(char)27+"[00;00m" +(char)27+"[01;34m latihan 30 ini?"+(char)27+"[00;00m");
        
        // input jawaban
        System.out.print((char)27+"[01;34m Jawab"+(char)27+"[00;00m" +(char)27+"[01;35m (Yoi/Enggak) : "+(char)27+"[00;00m");
        Scanner scan = new Scanner(System.in);
        String jawab = scan.next();
        
        // output pernyataan
        if (jawab.equalsIgnoreCase("Yoi")) {
            System.out.println();
            System.out.println((char)27+"[01;31m Cakep Bener."+(char)27+"[00;00m"+(char)27+"[01;35m Good Job."+(char)27+"[00;00m");
        } else {
            System.out.println();
            System.out.println((char)27+"[01;31m Tetep cakep sih."+(char)27+"[00;00m");
            System.out.println((char)27+"[01;36m Sing penting paham konsepnya yee."+(char)27+"[00;00m");
            System.out.println((char)27+"[01;37m Keep the code works dude."+(char)27+"[00;00m");
        }
    }
}