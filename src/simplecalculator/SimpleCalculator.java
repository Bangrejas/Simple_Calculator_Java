/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplecalculator;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


/**
 *
 * @author beecoder
 */
public class SimpleCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Date date=new Date();
        
        System.out.println(new SimpleDateFormat("dd.MM.yyyy  HH:mm").format(date));
        
        Scanner input = new Scanner(System.in); //buat ngeinput
        double num1, num2;
        
        System.out.print("Masukan angka pertama = ");
        num1 = input.nextDouble();
        
        System.out.print("Masukan angka kedua = ");
        num2 = input.nextDouble();
        
        System.out.print("Mau pilih operator apa? (/,*,+,-) = ");
        char operator = input.next().charAt(0);
        
        input.close();
        double hasil;
        
        switch(operator){
            case '+' :
                hasil = num1 + num2;
                break;
            case '-':
                hasil = num1 - num2;
                break;
            case '/':
                hasil = num1 / num2;
                break;
            case '*':
                hasil = num1 * num2;
                break;
            default:
                System.out.printf("Salah operator mas !!!!");
                return;
        }
        System.out.println("Hasil dari "+num1+" "+operator+" "+num2+" adalah = "+hasil);
    }
}