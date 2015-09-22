/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timeUtils;

/**
 *
 * @author tapioto
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int aika = 30;
        String tulos = TimeUtils.secToTime(aika);
        System.out.println(aika+" sec on "+tulos);
        String aika2 = "0:30:00";
        int tulos2 = TimeUtils.timeToSec(aika2);
        System.out.println(aika2+" on "+tulos2);
        System.out.println("Github toimii!!");
    }
    
}
