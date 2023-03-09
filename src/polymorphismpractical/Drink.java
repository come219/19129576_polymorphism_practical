/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polymorphismpractical;

/**
 *
 * @author qqstj
 */
public abstract class Drink {

    /**
     * @param drinkType the drinkType to set
     */
    public void setDrinkType(Integer drinkType) {
        this.drinkType = drinkType;
    }

    
    public Integer getDrinkType() {
        return drinkType;
    }
    
    // 1 = coffee, 2 = tea
    private Integer drinkType = 1;
    
    
    
    public void prepareRecipe() {
        
//         if(getDrinkType() == 1) {
//            System.out.println("Preparing Coffee");
//        }
//         if(getDrinkType() == 2) {
//            System.out.println("Preparing Tea");
//        }
        
        
        step1_boilWater(  );
        step2_applySubstance( );
        step3_pourLiquid(  );
        step4_addExtras(  );
        
        
       
        
    }   
    
    public abstract void step1_boilWater();
    
   
    
    
    public void step3_pourLiquid() {
        System.out.println("Pour liquid into the cup");
    }
    
    
    abstract public void step2_applySubstance(  );
        
    abstract public void step4_addExtras(  );
    
    
    
    
    
    
}
