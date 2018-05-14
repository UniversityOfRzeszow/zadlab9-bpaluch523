/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl9;
import java.util.HashMap;
import java.util.Scanner;
/**
 *
 * @author maarchyl
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //ZAD4
        System.out.println("ZAD 4");
        
        HashMap<String, String> sl = new HashMap<>();
        sl.put("klawiatura","keyboard");
        sl.put("komputer","computer");
        sl.put("wzmacniacz","amplifier");
        sl.put("glosnik","speaker");
        sl.put("mikrofon","microphone");
        sl.put("samochod","car");
        sl.put("rower","bicycle");
        sl.put("radio","radio");
        sl.put("motocykl","motorcycle");
        sl.put("mysz","mouse");
        sl.put("woda","water");
        sl.put("pilka","ball");
        sl.put("sciana","wall");
        sl.put("krzeslo","chair");
        sl.put("kabel","cable");
        sl.put("drzwi","door");
        sl.put("butelka","bottle");
        sl.put("paliwo","fuel");
        sl.put("zegarek","watch");
        sl.put("portfel","wallet");
        
        Scanner input=new Scanner(System.in);
        String s="";
        while(!"koniec!".equals(s)){
        System.out.println("Wybierz i podaj slowo z podanych do przetlumaczenia na angielski");
        System.out.println("klawiatura, komputer, wzmacniacz\nglosnik, mikrofon, samochod\nrower, radio, motocykl\nmysz, woda, pilka\nsciana, krzeslo, kabel\ndrzwi, butelka, paliwo\nzegarek, portfel");
        System.out.println("lub wpisz komende 'koniec!' aby wyjsc");
        
        s=input.next();
        
        System.out.println(s+" to po angielsku: "+sl.get(s)+"\n---------");
        }
        
        
        
    }
    
}
