/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package si.test.si;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Dejan
 */
@ManagedBean(name="bean")
@RequestScoped
public class Bean {

    private String input;
    private String output;

    public void submit() {
        output = String.format("Hello %s!", input);
    }

    public String getInput() {
        return input;
    }

    public String getOutput() {
        return output;
    }

    public void setInput(String input) {
        this.input = input;
    }
}
