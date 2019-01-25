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

public class BottlesOfBeer  extends Object{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BottlesOfBeer song = new BottlesOfBeer();
        //int numOfbottles = song.enterInput();
        //numOfbottles = song.validInput(numOfbottles);
        int numbOfbottles = song.validInput(song.enterInput());
        song.printSong(numbOfbottles);
    }
    
    /**
     * 
     * @param num the number of bottles
     * @return the validated number of bottles
     */
    public int validInput(int num)
    {
        while(num < 0)
        {
            System.out.println("Negative Number: please enter a positive number");
            num = enterInput();
        }
        return num;
    }
    
    
    /**
     * 
     * @return the number of bottles after checking for valid integer
     */
    public int enterInput(){
        int bottles;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of botlles: ");
        try{
            bottles = input.nextInt();
            }
        catch (Exception e){
            System.out.println("This is not an interger." + 
                    " Please enter a positive number");
            return enterInput();
            }
        return bottles;
        }
    
    public void printFirstLine(String bot, int num){
        System.out.println(num + " " + bot + " of beer on the walls, " + num + 
                " " + bot + " of beers");
    }
    
    
    /**
     * 
     * @param bot the version of the bottle word in singular or plural
     * @param num of the bottles
     */
    public void printSecondLine(String bot, int num){
        if (num > 0) {
            System.out.println("Take one down and pass it around, " + 
                    num + " " + bot + " of beer on the wall\n");
        } else {
            System.out.println("Take one down and pass it around, " + 
                    " no more bottles of beer on the wall\n");
        }
          
    }
    
    /**
     * 
     * @param num of the bottles
     */
    public void printLastLyrics(int num)
    {
        System.out.println("No more bottles of beer on the wall, "+
                "no more bottles of beer");
        if (num != 1) {
            System.out.println("Go to store and buy some more, " +
                    num + " bottles of beer on the wall");
        } else {
            System.out.println("Go to store and buy some more, " +
                    num + " bottle of beer on the wall");
        }
    }
    
    /**
     * 
     * @param initialNum the initial number of bottles
     */
    public void printSong(int initialNum){
        String plural = "bottles";
        String single = "bottle";
        int num= initialNum;
        while (num > 0) {
            if (num > 1) {
                printFirstLine(plural, num);
                num--;
                if (num > 1) {//check if num is still > 1
                    printSecondLine(plural, num);
                } else {
                    printSecondLine(single, num);
                }
                
            } else {
                printFirstLine(single, num);
                num--;
            } 
        }
        printLastLyrics(initialNum);
    }
}
