/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package codabook.agecalculator.ejb;

import java.util.Calendar;
import javax.ejb.Remote;

/**
 *
 * @author sangeethas
 */
@Remote
public interface AgeCalculatorBeanRemote {
    public int calculateAge(Calendar dateOfBirth);
}
