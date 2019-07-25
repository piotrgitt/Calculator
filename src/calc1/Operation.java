/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calc1;

import java.math.BigDecimal;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 *
 * @author Piotr
 */
public class Operation {
    

    public Operation(){
  
    }
    
    
    public String calculateEquation(String equation){
        //if last char of equasion is not digit then
        try{
            if(!Character.isDigit(equation.charAt(equation.length()-1))){
                equation = equation.subSequence(0, equation.length()-2).toString(); 
            }
        } catch(StringIndexOutOfBoundsException ex){}
        
        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine = mgr.getEngineByName("JavaScript");    
        String resultString;
        
        try {

            resultString = engine.eval(equation).toString();
            resultString = Utilities.trimLast2Chars(resultString);
            
            return resultString;
        } catch (ScriptException ex) {
            Logger.getLogger(Operation.class.getName()).log(Level.SEVERE, null, ex);
            return equation;
        } catch (NullPointerException ex){
            // do nothing 
        } catch (Exception ex){ 
            // do nothing
        }
        
        return("0");
    }
    
    public String negation(String equation){
        try{
            equation = calculateEquation(equation);
            double equasionTemp = Double.parseDouble(equation);
            equasionTemp = -equasionTemp;
            equation = Double.toString(equasionTemp);
            equation = Utilities.trimLast2Chars(equation);

            return Utilities.trimLast2Chars(Double.toString(equasionTemp));
        } catch (NumberFormatException ex) {
            ex.printStackTrace();
            return equation;
        }
        
    }
    
    public String pow2(String equation){
        try{
            equation = calculateEquation(equation);
           double equasionTemp = Double.parseDouble(equation);
           equasionTemp = equasionTemp * equasionTemp;
           equation = Double.toString(equasionTemp);
           equation = Utilities.trimLast2Chars(equation);

           return Utilities.trimLast2Chars(Double.toString(equasionTemp));
        } catch (Exception ex) {
            ex.printStackTrace();
            return equation;
        }
       
    }
    
    public String sqrt(String equation){
        try{
            equation = calculateEquation(equation);
            double equasionTemp = Double.parseDouble(equation);
            equasionTemp = Math.sqrt(equasionTemp);
            equation = Double.toString(equasionTemp);
            equation = Utilities.trimLast2Chars(equation);

            return Utilities.trimLast2Chars(Double.toString(equasionTemp));
        } catch (Exception ex) {
            ex.printStackTrace();
            return equation;
        }
    }
    
    public String oneByX(String equation){
        try{
            equation = calculateEquation(equation);
            double equasionTemp = Double.parseDouble(equation);
            equasionTemp = 1/equasionTemp;
            equation = Double.toString(equasionTemp);
            equation = Utilities.trimLast2Chars(equation);

            return Utilities.trimLast2Chars(Double.toString(equasionTemp));
        } catch (Exception ex) {
            ex.printStackTrace();
            return equation;
        }
        
    }
    
    public String percentOf(String equation){
        try{
            equation = calculateEquation(equation);
            equation = calculateEquation(equation);
            double equationTemp = Double.parseDouble(equation);
            equationTemp *= 100;
            equation = Double.toString(equationTemp);
            equation = Utilities.trimLast2Chars(equation);
            return equation;  
        } catch (Exception ex) {
            ex.printStackTrace();
            return equation;
        }
    }

}
