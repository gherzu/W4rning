/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio.pkg9;

/**
 *
 * @author Gerardo
 */
public class ShapeFactory {
    
    public Shape get(String shapeType){
        
        if(shapeType != null) {
            
            if(shapeType.equals("Circle")) {
               return new Circle();
            } else if(shapeType.equals("Rectangle")) {
                return new Rectangle();
            } else if(shapeType.equals("Square")) {
                return new Square();
            }

        }
        return null;
    }

}
    
