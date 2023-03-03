/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

/**
 *
 * @author TranHung
 */
public class Uppercase {
    
    public static String UpperID(String input){
        return input.toUpperCase();
    }
    
    public static String UpperName(String input){
        String output="";
        
        for (int i = 0; i < input.length(); i++) {
            Character c =input.charAt(i);
            if (i==0) {
                c = Character.toUpperCase(c);
            }
            
            if (i>0 && input.charAt(i-1) == ' ') {
                c = Character.toUpperCase(c);
            }
            
            output+=c;
        }
        return output;
    }
    
    public static void main(String[] args) {
        String s = " lam thi Mi";
        System.out.println(UpperName(s));
        
        
    }
}
