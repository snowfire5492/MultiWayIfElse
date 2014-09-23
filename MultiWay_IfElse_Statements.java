package multi.way_if.else_statements;

/**
 *Lab:SelfTestExercise8Page106
 *
 *@author Eric Schenck
 * 
 *09 - 24 - 2012
 *
 *
 *Problem Statement:Write a multiway if-else statement that classifies
 *the value of an int variable into one fo the follow categories and writes
 *out an appropriate message.
 * n < 0 or 0 <= n < 100 or n >= 100
 *
 *
 *Plan:
 *1.
 *
 *
 */
import javax.swing.JOptionPane;

public class MultiWay_IfElse_Statements 
{
    
    public static void main(String[] args) 
    {
     String userInput = JOptionPane.showInputDialog(null, "please enter "
      + "any number of your choosing.\nHint: Your number may be "
      + "negative or positive");
      
      double userVariable = Double.parseDouble(userInput);
      
      if(userVariable < 0)
      {
       JOptionPane.showMessageDialog(null, "The variable you entered "
        + "is less than 0");
      }
      else if(userVariable >= 0 && userVariable < 100)
      {
       JOptionPane.showMessageDialog(null, "The variable you entered "
        + "is greater than or equal too 0, yet less than 100");
      }
      else 
      {
       JOptionPane.showMessageDialog(null, "The variable you entered "
        + "is greater than or equal too 100");
      }
      
     
     
     
     
        
        
       
    }// end of main
}// end of class SelfTestExercise8page106
