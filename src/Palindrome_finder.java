
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ElizabethReed PC
 */
public class Palindrome_finder {
    
    HashMap<Integer, String> hmap = new HashMap<Integer, String>();
    
    public char[] charA(String input){
        char[] charA = input.toCharArray();
        return charA;
    }
    
     public boolean isTrivial(String input){
        return input.length() == 0 || input.length() == 1;
    }
    
    public boolean isPalindrome(char[] charA){ //verify it's a palindrome
        StringBuilder firstHalf = new StringBuilder();
        StringBuilder secondHalf = new StringBuilder();
        
        for(int i = 0; i < charA.length/2 ; i++){ //first half
            char curr = charA[i];
            firstHalf.append(curr);
        }
        
        for(int i = charA.length-1; i>=0; i--){ //flipped second half
            char curr = charA[i];
            secondHalf.append(curr);
        }
        
        return firstHalf == secondHalf;
    }
       
    public void findPalindrome(char[] charA){ //consecutive palindromes
        
        for(int i = 0; i< charA.length/2; i++){
            char curr = charA[i];
            
            for(int j = 0; j< i; j++){ //check right and left of curr
                if(isPalindrome(charA)){
                    //log in hashmap
//                    hmap.put(charA);
                }
            }
        }
    }
    
    public void check(String input){ //final method for all cases
        char[] charA = input.toCharArray();
        if(isTrivial(input)){
            System.out.println("This is a trivial case");
        }
        else if(isPalindrome(charA)){
            System.out.println("The whole word is a palindrome!");
        }
    }
}
