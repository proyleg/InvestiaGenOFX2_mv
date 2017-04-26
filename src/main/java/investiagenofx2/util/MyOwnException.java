/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package investiagenofx2.util;

/**
 *
 * @author Pierre
 */
public class MyOwnException extends Exception {

    public MyOwnException() {
    }

    public MyOwnException(String message) {
        super(message);
    }

    public MyOwnException(Throwable cause) {
        super(cause);
    }

    public MyOwnException(String message, Throwable cause) {
        super(message, cause);
    }
}
