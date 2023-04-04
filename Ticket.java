/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticket;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class Ticket {

    private String movie;
   private int row;
   private int seat;

   //complete the constructor
   public Ticket(String movie,int row,int seat){
       this.movie= movie;
       this.row=row;
       this.seat=seat; 
       
       public String getMovie(){
           return movie;
       }
       public int getRows(){
           return row;
       }
       public int getSeat(){
           return seat;
       }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String movie=sc.nextLine();
        int row=sc.nextInt();
        int seat=sc.nextInt();
        
        Ticket ticket=new Ticket(movie,row,seat);
        System.out.println("Movie: "+ticket.getMovie());
        System.out.println("Rows: "+ticket.getRows());
        System.out.println("Seats: "+ticket.getSeat());
               
    }
    
}
