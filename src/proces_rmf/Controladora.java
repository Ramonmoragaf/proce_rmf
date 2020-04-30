/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proces_rmf;

import java.util.ArrayList;

/**
 *
 * @author angel
 */
public class Controladora {
ArrayList<Object> procesos=new ArrayList<>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Controladora C1=new Controladora();
       ventanapro ven=new ventanapro(C1);
       ven.setVisible(true);
       
    }
    
}
