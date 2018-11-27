/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author yao-s9
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int passengers = 0;
        int van = 7;
        int bus = 50;
        String operation = null;
        
         Scanner input = new Scanner(System.in);
         
         System.out.println("please enter the number of  passengers");
         passengers = input.nextInt();
         
         if ("/".equals(operation));
        {
            System.out.println("your answer is" + (passengers/ bus));
        
            System.out.println("num of buses=");
            int passenger;
            passenger = (passengers/bus);
            
        int RemianingPassenger = passenger - (passengers/bus*50);
        int vans;
            vans = RemianingPassenger/van;
        int ExtraPeople = vans + 1;
            int RemainingPassenger = ExtraPeople;
        
            
        if (RemianingPassenger>0&&RemainingPassenger<7){
            System.out.println("num of vans = "+ ExtraPeople);
            
        }
        else{
            System.out.println("num of vans = "+ vans);
        }  
        }
        }
        
       
        
    
}
