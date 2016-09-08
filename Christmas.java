/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package christmas;

import java.util.Scanner;

/**
 *
 * @author Shalibhadra
 */
public class Christmas {

    /**
     * @param args the command line arguments
     */
    public static int a=0,x;
    public static void main(String[] args) {
        // TODO code application logic here
        	int i,j,k,t=0;
	


        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        if(n<=1)
            System.out.print("You cannot generate christmas tree");
        else if(n>20)
        {
            System.err.print("Tree is no more");
            
        }
        else
        {
        x=n*2;
        star(n+1,0);
        star(n-1,2);
        star(n-2,2);
        // System.out.println();
            for(j=0;j<x;j++)
            {
                   System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
            for(j=0;j<x;j++)
            {
                System.out.print(" ");
            } 
            System.out.print("*");
            System.out.println();
        }






}
    static void star(int n,int b)
    {
      int i,j,k,t;
//    if(a==0)
//    {
    for (i = b; i < 2*n+a; i++) 
    {
    if(i%2==0)
    {
        
            for (j = 0; j < x- i; j++) 
            {
                System.out.print(" ");
            }
            for (k = 0; k <= i; k++) 
            {
               
                
                System.out.print("* ");
            }
            
            System.out.println();
            
           
    //}
    }
 }
    a=2;
    }
}
