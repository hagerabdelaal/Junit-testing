/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc14
 */
public class myclass {
    int mySquare(int x){
        return x*x;
    }
    
    int myAdd(int x, int y){
        return x+y;
    }
    
    int myMax(int x, int y){
        if(x!=y){
            if(x>y){
                return x;
            }
            else{
                return y;
            }
     
        }
        return 0;
    }
    
}
