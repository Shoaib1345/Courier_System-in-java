/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package courier;

/**
 *
 * @author Shoaib Ahmed Bullo <your.name at your.org>
 */
class Temporary{
private int i;
private float parcels[];
private String location;
private int j;

Temporary(int noOfParcels){
this.parcels=new float[noOfParcels];
this.j=0;
this.i=0;
}

void addParcels(float weight , String location){
if(this.i<this.parcels.length){
    parcels[this.i++]=weight;
    this.location=location;
}
else 
        System.out.println("courier is  full");
}
    float getParcelsPrice(){
       if(this.j<parcels.length){
       if(this.location.equalsIgnoreCase("city")){
       return(this.parcels[this.j++]*2)+20;
       }
       }
       else
               System.out.println("Parcels has not been added because parcels limit is full");
    return  -1;
    }
}
public class Courier {
    public static void main(String[] args) {
        // TODO code application logic here
      Temporary leopard =new  Temporary(5);
      leopard.addParcels(10.0F, "city");
        System.out.println(leopard.getParcelsPrice());
    
         leopard.addParcels(2.90F, "out");
        System.out.println(leopard.getParcelsPrice());
    }
    
}
