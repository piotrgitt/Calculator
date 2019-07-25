/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calc1;

/**
 *
 * @author Piotr
 */
public class Utilities {
    
    /**
     * if result of equation is Even (like 1.0, 3.0, 12.0 etc) 
     * 
     * @param result(String)
     * 
     * @return String without last 2 chars or whole string if result is not even
     * 
     */
    public static String trimLast2Chars(String result){
        if( result.matches(".*\\.0$") ){
                return result.substring(0, result.length()-2);       
        }
        
        return result;
    }
}
