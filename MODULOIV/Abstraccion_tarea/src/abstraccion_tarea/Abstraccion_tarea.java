/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstraccion_tarea;

import helpers.UNAH_Rector;
import helpers.UPNFM_Rector;
import helpers.UTH_Rector;

/**
 *
 * @author TANIA
 */
public class Abstraccion_tarea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        UTH_Rector uth = new UTH_Rector();
        UNAH_Rector unah = new UNAH_Rector();
        UPNFM_Rector upnfm = new UPNFM_Rector();
        
        System.out.println(uth.getUniversidad());
        System.out.println(uth.getRector());
        
        System.out.println(unah.getUniversidad());
        System.out.println(unah.getRector());
        
        System.out.println(upnfm.getUniversidad());
        System.out.println(upnfm.getRector());
    }
    
}
