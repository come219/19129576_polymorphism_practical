/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polymorphismpractical;

/**
 *
 * @author qqstj
 */
public class PolymorphismPractical {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Drink d1 = new Coffee(    );
        Drink d2 = new Tea(    );
        
        d1.prepareRecipe();
        d2.prepareRecipe();
       
        
    }
    
}


