/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import static java.lang.Character.isDigit;
import static java.lang.Character.isLetter;

/**
 *
 * @author waleed
 */
public class Validation {
    static boolean valid1(String x){
        boolean v = true ;
        for(int i=0 ; i<x.length();i++){
            v = isDigit(x.charAt(i));
        }
        return v;
    }
     static boolean valid2(String x){
        boolean v = true ;
        for(int i=0 ; i<x.length();i++){
            v = isLetter(x.charAt(i));
        }
        return v;
    }
}
