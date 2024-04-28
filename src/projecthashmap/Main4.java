/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecthashmap;

/**
 *
 * @author dosen
 */
public class Main4 {
    public static void main(String[] args) {
        registerSightingCounter reg = new registerSightingCounter();
        reg.addSighting("sense");
        System.out.println(reg.timesSighted("sense"));
        
        reg.addSighting("sense");
        System.out.println(reg.timesSighted("sense"));
    }
}
