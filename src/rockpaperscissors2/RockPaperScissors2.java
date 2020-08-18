/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rockpaperscissors2;

import java.util.Scanner;

/**
 *
 * @author Edgaras
 */
public class RockPaperScissors2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int cc2RockCount = 0;
        int cc2PaperCount = 0;
        int cc2ScissorsCount = 0;
        
        int ccRockCount = 0;
        int ccPaperCount = 0;
        int ccScissorsCount = 0;
        
        int computer2WinCount = 0;
        int computerWinCount = 0;
        int tieCount = 0;
        
        boolean cycle = true;
        
        System.out.println("Enter play times:");
        
        int playTimes = sc.nextInt();
        
        while (true) {
            if (playTimes < 1) {
            System.out.println("Play Times should be more than zero!");
            break;
        }
            int cc = (int)(Math.random()*3+1);
            int cc2 = (int)(Math.random()*3+1);
            
            if (!cycle) {
                int computer2Procent = (computer2WinCount * 100 / count);
                int computerProcent = (computerWinCount * 100 / count);
                int tieProcent = (tieCount * 100 / count);
                
                System.out.println("STATISTICS:");
                System.out.print("Played ");
                System.out.print(count);
                System.out.println(" times");
                
                System.out.print("Computer2 win ");
                System.out.print(computer2WinCount);
                System.out.print(" times ");
                System.out.print(computer2Procent);
                System.out.println("%");
                
                System.out.print("Computer win ");
                System.out.print(computerWinCount);
                System.out.print(" times ");
                System.out.print(computerProcent);
                System.out.println("%");
                
                System.out.print("Tie ");
                System.out.print(tieCount);
                System.out.print(" times ");
                System.out.print(tieProcent);
                System.out.println("%");
                
                System.out.print("Computer2 chiose - rock: ");
                System.out.print(cc2RockCount);
                System.out.println(" times");
                
                System.out.print("Computer2 chiose - paper: ");
                System.out.print(cc2PaperCount);
                System.out.println(" times");
                
                System.out.print("Computer2 chiose - scissors: ");
                System.out.print(cc2ScissorsCount);
                System.out.println(" times");
                
                System.out.print("Computer chiose - rock: ");
                System.out.print(ccRockCount);
                System.out.println(" times");
                
                System.out.print("Computer chiose - paper: ");
                System.out.print(ccPaperCount);
                System.out.println(" times");
                
                System.out.print("Computer chiose - scissors: ");
                System.out.print(ccScissorsCount);
                System.out.println(" times");
                
                break;
            }
            if(cc2 == 1 && cc != 1) {
                cc2RockCount += 1;
                if (cc == 2) {
                    ccPaperCount += 1;
                    computerWinCount += 1;
//                    System.out.println("Computer2 choise - rock");
//                    System.out.println("Computer choise - paper");
//                    System.out.println("COMPUTER WIN!!!");
                }
                if (cc == 3) {
                    ccScissorsCount += 1;
                    computer2WinCount += 1;
//                    System.out.println("Computer2 choise - rock");
//                    System.out.println("Computer choise - scissors");
//                    System.out.println("COMPUTER2 WIN!!!");
                }
            }
            else if(cc2 == 2 && cc != 2) {
                cc2PaperCount += 1;
                if (cc == 1) {
                    ccRockCount += 1;
                    computer2WinCount += 1;
//                    System.out.println("Computer2 choise - paper");
//                    System.out.println("Computer choise - rock");
//                    System.out.println("COPUTER2 WIN!!!");
                }
                if (cc == 3) {
                    ccScissorsCount += 1;
                    computerWinCount += 1;
//                    System.out.println("Computer2 choise - paper");
//                    System.out.println("Computer choise - scissors");
//                    System.out.println("COMPUTER WIN!!!");
                }
            }
            else if(cc2 == 3 && cc != 3) {
                cc2ScissorsCount += 1;
                if (cc == 1) {
                    ccRockCount += 1;
                    computerWinCount += 1;
//                    System.out.println("Computer2 choise - scissors");
//                    System.out.println("Computer choise - rock");
//                    System.out.println("COMPUTER WIN!!!");
                }
                if (cc == 2) {
                    ccPaperCount += 1;
                    computer2WinCount += 1;
//                    System.out.println("Computer2 choise - scissors");
//                    System.out.println("Computer choise - paper");
//                    System.out.println("COMPUTER2 WIN!!!");
                }
            }
            else if(cc2 == cc) {
                if(cc2 == 1 && cc == 1) {
                    cc2RockCount += 1;
                    ccRockCount += 1;
                    tieCount +=1;
//                    System.out.println("Computer2 choise - rock");
//                    System.out.println("Computer choise - rock");
//                    System.out.println("TIE!!!");
                }
                else if(cc2 == 2 && cc == 2) {
                    cc2PaperCount += 1;
                    ccPaperCount += 1;
                    tieCount +=1;
//                    System.out.println("Computer2 choise - paper");
//                    System.out.println("Computer choise - paper");
//                    System.out.println("TIE!!!");
                }
                else if(cc2 == 3 && cc == 3) {
                    cc2ScissorsCount += 1;
                    ccScissorsCount += 1;
                    tieCount +=1;
//                    System.out.println("Computer2 choise - scissors");
//                    System.out.println("Computer choise - scissors");
//                    System.out.println("TIE!!!");
                }
            }
            count += 1;
            if (count == playTimes) {
                cycle = false;
            }
        }
    }    
}
