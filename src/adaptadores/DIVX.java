/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adaptadores;

/**
 *
 * @author david
 */
public class DIVX implements MediaDivX{

    @Override
    public void playFilm(String filename) {
        System.out.println("reproduciendo Divx "+ filename);
    }
    
}
