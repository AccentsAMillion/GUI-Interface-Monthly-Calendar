/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guidisplaycalendar;

import javax.swing.JOptionPane;
import javax.swing.*; // Utilizes JOption and JLabel
import java.awt.*; // font contorl

public class GUIDisplayCalendar {

    public static void main(String[] args) {
         String strYear = "";
         int intYear = 0;
         String strBeginDay = "";
         int intBeginDay = 0;
         int endMonthDays = 0;
         int counterMonths = 1;
         int counterWeek = 1;
         int counterDay = 1;
         int daysOfMonth = 1;
         int dayGridCounter = 1;
         
         //New variables to determine the requested month.
         String strGivinMonthRequested = "";
         int intGivinMonthRequested = 0;
         // Needed for Both monospace and multiline text
         String strMessageMonth = "<html>";
         
         //Data block pulled from
         JOptionPane.showMessageDialog(null, "Welcome lets get to displaying your Calendar.");
         strYear = JOptionPane.showInputDialog(null, "Enter a year:", "Input", JOptionPane.QUESTION_MESSAGE);
         intYear = Integer.parseInt(strYear);
         
         //Sets the strBeginDay variable
         strBeginDay = JOptionPane.showInputDialog(null, "Enter a number where the first day of the year will fall:\nFor Sunday enter 0\nFor Monday enter 1\nFor Tuesday enter 2\nFor Wednesday enter 3\nFor Thurday enter 4\nFor Friday enter 5\nFor Saturday enter 6\n", "Input", JOptionPane.QUESTION_MESSAGE);
         intBeginDay = Integer.parseInt(strBeginDay);
         
         if(intYear%4==0)
             JOptionPane.showMessageDialog(null, "We show " + intYear + " as a leap year.");
         
         // New to get the requested month from user
         strGivinMonthRequested = JOptionPane.showInputDialog(null,"Enter a number for the month you want to display:\n1 for January\n2 for February\n3 for March\n4 for April\n5 for May\n and so on:","Month Entry", JOptionPane.QUESTION_MESSAGE);
         intGivinMonthRequested = Integer.parseInt(strGivinMonthRequested);
                 
         for(counterMonths = 1; counterMonths <= 12; counterMonths++)
         {
             if(counterMonths>intGivinMonthRequested) break;// break out
         //setting days of the month
         switch(counterMonths)
            {
                    case 1: { endMonthDays = 31; if(counterMonths == intGivinMonthRequested) strMessageMonth += "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;January " +strYear+ "<br/-----------------------------<br/> Sun Mon Tues Wed Thu Fri Sat<br/>";}
                        break;
                    case 2: { endMonthDays = 28; if(counterMonths == intGivinMonthRequested) strMessageMonth += "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;February " +strYear+ "<br/>-----------------------------<br/> Sun Mon Tues Wed Thu Fri Sat";}
                        break;
                    case 3: { endMonthDays = 31; if(counterMonths == intGivinMonthRequested) strMessageMonth += "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;March " +strYear+ "<br/>-----------------------------<br/> Sun Mon Tues Wed Thu Fri Sat";}
                        break;
                    case 4:  { endMonthDays = 30; if(counterMonths == intGivinMonthRequested) strMessageMonth += "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;April " +strYear+ "\n-----------------------------\n Sun Mon Tues Wed Thu Fri Sat";}
                        break;
                    case 5: { endMonthDays = 31; if(counterMonths == intGivinMonthRequested) strMessageMonth += "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;May " +strYear+ "\n-----------------------------\n Sun Mon Tues Wed Thu Fri Sat";}
                        break;
                    case 6: { endMonthDays = 30; if(counterMonths == intGivinMonthRequested) strMessageMonth += "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;June " +strYear+ "\n-----------------------------\n Sun Mon Tues Wed Thu Fri Sat";}
                        break;
                    case 7:  { endMonthDays = 31; if(counterMonths == intGivinMonthRequested) strMessageMonth += "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;July " +strYear+ "\n-----------------------------\n Sun Mon Tues Wed Thu Fri Sat";}
                        break;
                    case 8: { endMonthDays = 31; if(counterMonths == intGivinMonthRequested) strMessageMonth += "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;August " +strYear+ "\n-----------------------------\n Sun Mon Tues Wed Thu Fri Sat";}
                        break;
                    case 9: { endMonthDays = 30; if(counterMonths == intGivinMonthRequested) strMessageMonth += "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;September " +strYear+ "\n-----------------------------\n Sun Mon Tues Wed Thu Fri Sat";}
                        break;
                    case 10: { endMonthDays = 31; if(counterMonths == intGivinMonthRequested) strMessageMonth += "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;October " +strYear+ "\n-----------------------------\n Sun Mon Tues Wed Thu Fri Sat";}
                        break;
                    case 11: { endMonthDays = 30; if(counterMonths == intGivinMonthRequested) strMessageMonth += "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;November " +strYear+ "\n-----------------------------\n Sun Mon Tues Wed Thu Fri Sat";}
                        break;
                    case 12: { endMonthDays = 31; if(counterMonths == intGivinMonthRequested) strMessageMonth += "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;December " +strYear+ "\n-----------------------------\n Sun Mon Tues Wed Thu Fri Sat";}
                        break;
                    default: { endMonthDays = 30; strMessageMonth += "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Month " +strYear+ "\n-----------------------------\n Sun Mon Tues Wed Thu Fri Sat";}
                        break;
            } // end the set Days of the Month switch structure
         
            //if ((counterMonths==2)&&(intYear%4==0))
                   // {
                    //    daysOfMonth = 29;
                  //  }  // end february adjustment if
                  //  */    
              
      if ((counterMonths==2)&&(intYear%4==0)) //Adjust February to 29 Leap Year
                { 
                  endMonthDays = 29;
                }
      for (counterWeek=1; counterWeek <= 6; counterWeek++)
            {
                  if(counterWeek==1)
                        counterDay=1;
                  while((dayGridCounter<=counterWeek*7)&&((dayGridCounter-intBeginDay)<=endMonthDays)) 
                  {
                  if(counterDay<=intBeginDay)
                  {
                    System.out.print("    ");
                  }
                  if (dayGridCounter-intBeginDay<10)
                  {
                    //System.out.print("   "+(dayGridCounter-intBeginDay));
                  
                  }
                  // Print 2 blanks and the date if the date has 2 digigs until the end of the month
                  else (dayGridCounter-intBeginDay <= endMonthDays)
                  {
                    //System.out.print("  "+(dayGridCounter-intBeginDay));
                      if(counterMonths == intGivinMonthRequested) 
                      {
                          strMessageMonth += "&nbsp;&nbsp;"+(dayGridCounter-intBeginDay);
                      }
                  }
                  
                  // increment the counter to step from day to day
                  dayGridCounter++;
                  
              }  // end of counterDay loop
                  
                  
            } // end the dayGridCounter loop
                  //System.out.println();
                  if(counterMonths == intGivinMonthRequested) 
                  {
                        strMessageMonth += "<br/>"; // Change the \n code to <br/> tag.
                  }
                  
            } // end of counterWeek loop
                  intBeginDay=(intBeginDay+endMonthDays)%7;
         } // end the counterMonth loop
         
         strMessageMonth += "</html>"; // close html code
         JLabel calendarLabel = new JLabel (strMessageMonth);
         
         //Create JLabe object to control the font
         calendarLabel.setFont(new Font("Monospaced", Font.BOLD,14));
         
         JOptionPane.showMessageDialog(null, calendarLabel,
         "Calendar", JOptionPane.PLAIN_MESSAGE);
   
}  // JOptionPane.showMessageDialog(null, strMessageMonth);
}  // end main() Method
} // end CalendarTable
        
 
