/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosnumericos_2;
import java.util.Arrays;
/**
 *
 * @author Master
 */
public class seidelimplements {
    
    
    private double [] vals;
    
    public seidelimplements(){
        this.vals = new double[3];
        Arrays.fill(this.vals,0);
    }
    /*
    public  double[] getimage(){ //CUADERNO 1
                
        this.vals[0]=(-2-(1*this.vals[1])+this.vals[2])/-5;
        this.vals[1]=(-21-(3*this.vals[2])-(2*this.vals[0]))/-10;
        this.vals[2]=(10-this.vals[1]-(3*this.vals[0]))/-5;
        
        return this.vals;
    }*/
    
    
    public  double[] getimage(){  //TAREA 1
                
        this.vals[0]=(-3-(this.vals[2]*3)+(this.vals[1]*4))/11;
        this.vals[1]=(-2+this.vals[2]-(this.vals[0]*3))/12;
        this.vals[2]=(-2+(this.vals[1]*2)+(this.vals[0]*3))/-12;
        
        return this.vals;
    }
    
    
    /*public double [] getimage(){ //TAREA 2
        this.vals[0]=(7.85+(this.vals[2]*.2)+(this.vals[1]*.1))/3;
        this.vals[1]=(-19.30+(this.vals[2]*.3)-(this.vals[0]*.1))/7;
        this.vals[2]=(71.40+(this.vals[1]*.2)-(this.vals[0]*.3))/-10;

        return this.vals;
    }*/
    
    /*public double[] getimage(){ //TAREA 3
        
        this.vals[0]=(18+(this.vals[2]*2)+(this.vals[1]*3))/11;
        this.vals[1]=(2-(this.vals[2]*2)-(this.vals[0]*4))/-7;
        this.vals[2]=(13+(this.vals[1]*2)-(this.vals[0]*5))/-8;        
        
        return this.vals;
    }*/
    
}
