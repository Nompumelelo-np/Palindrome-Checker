/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.palindromechecker;
import java.util.Scanner;

/**
 *
 * @author Acer-User
 */
public class PalindromeChecker {

    public static void main(String[] args) {
        
        String str, rev = "";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");
        str = input.next();
        int length = str.length();
        for ( int i = length - 1; i >= 0; i-- )
        {
             rev = rev + str.charAt(i);
        }
        
        if(str.equals(rev))
        {
            System.out.println(str+ " is a palindrome");
        }
        else
        {
            System.out.println(str+ " is not a palindrome");
        }
    }
}
