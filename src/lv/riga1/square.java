/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lv.riga1;

/**
 *
 * @author user
 */
public class square {
 public double lenght;
 
 public String color;

public square(double lenght, String color){
    this.color = color;
    this.lenght = lenght;
     } 

public double getArea(){
    return this.lenght*this.lenght;
}
public double getPerimeter(){
        return this.lenght*4;
        //return lenght*4;  
}
public String getColor(){
    return this.color;
}


