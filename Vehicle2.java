/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicle;


public class Vehicle {
  private String color;
  
  Vehicle(){
      this.setColor("Red");
  }
  Vehicle(String c){
  this.setColor(c);
  }
  
  
    
    // Getter
    public String getColor() {
        return color;
    }
    
    // Setter
    public void setColor(String c) {
        this.color = c;
    }
   
    public static void main(String[] args) {
       Vehicle v1 = new Vehicle();
       Vehicle v2=new Vehicle("blue");
       
        System.out.println(v2.getColor());
    }
   }

