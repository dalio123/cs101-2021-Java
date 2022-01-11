/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dz13;

/**
 *
 * @author david
 */
public class EmptyFieldException extends Exception {
public EmptyFieldException() {
}
public EmptyFieldException(String message) {
super(message);
}
public EmptyFieldException(String message, Throwable cause) {
super(message, cause);
}
public EmptyFieldException(Throwable cause) {
super(cause);
}
}
