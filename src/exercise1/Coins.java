/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise1;

import java.util.Scanner;

/**
 *
 * @author mark_
 */
public class Coins extends Object{
    public static void main(String []args)
    {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter amout");
        int coin = input.nextInt();
        Coins change = new Coins();
        change.getCoin(coin);
   
        
    }
    
    public void getCoin(int num){
        int coin = num;
        int quarter = 0;
        int dimes = 0;
        int nickels = 0;
        int penny = 0;
        
         quarter = num / 25;
         coin = num % 25;
         if(quarter != 0)
        {
            System.out.println("Quarter: " + quarter);
        }
         if(dimes != 0)
        {
            System.out.println("Dime: " + dimes);
        }
         dimes = coin/10;
         coin %= 10;
        
         nickels = coin / 5;
         coin %= 5;
          if(nickels != 0)
        {
            System.out.println("Nickel: " + nickels);
        }
          
         penny= coin;
         if(coin != 0)
         {
             System.out.println("Penny: " + penny);
         }
         
        
    }
    
   
}
