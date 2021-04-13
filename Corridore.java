/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garadicorsa;

/**
 *
 * @author Alessandro
 */
public class Corridore {
    
    public static int metri=5;
    public String nome;
    public boolean arrivato;
    public int numPartecipante;
    
    public Corridore(String n, int num){
        
        nome = n;
        arrivato = false;
        numPartecipante = num;
    }
    
    public void partenzaGara(){
        
        for(int i=1;i<= metri;i++){
             
                System.out.println("nome corridore: " + nome + " numero partecipante: " + numPartecipante  + " metri percorsi: " + i );
                
                if(i == 100){
                
                arrivato=true;
            }
        }
        
        
      
    }
        
    
    public void corridoreArrivato(){
        
        if(arrivato==true){
            
            System.out.println("Il corridore ha terminato la gara");
        }

}
    
}


    
     

