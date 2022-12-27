/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package temelifdemo;
import java.util.Scanner;
public class Temelifdemo {

    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        System.out.print("Bir doğum yılı giriniz:");
                   int dy = giris.nextInt();
                   
                   int yas = 2022-dy;
                   
                   if (yas<18){
                       System.out.println("reşit değildir");
                       System.out.println("yas:" + yas);
                   }
                   
                   else {
                       System.out.println("reşitsin");
                        System.out.println("yas:" + yas);
                   }
    }
        }  
