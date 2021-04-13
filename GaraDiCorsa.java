/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garadicorsa;

import java.util.ArrayList;
/**
 *
 * @author Alessandro
 */
public class GaraDiCorsa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        int nCorridori = 10;
    
        Corridore c1 = new Corridore("Berthold", 1);
        Corridore c2 = new Corridore("Reiner", 2);
    
        ArrayList<Corridore> classifica = new ArrayList<>();
        
        
        c1.partenzaGara();
        c1.corridoreArrivato();
        
        classifica.add(c1);
        classifica.add(c2);
        
        
        for(int i=0;i<nCorridori;i++){
            
            classifica.get(i).partenzaGara();
            classifica.get(i).corridoreArrivato();
        }
    }
    
    
    
}
