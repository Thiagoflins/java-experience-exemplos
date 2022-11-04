import java.util.jar.Manifest;

import javax.swing.event.SwingPropertyChangeSupport;

public class citTeste1 {
    public static void main(String[] args) {
        
        sayHello("thiago");
    }   
    public static String sayHello(String name) {
        if ( name == null ){
            System.out.println("Hello!");
        }else{
            System.out.println("Hello, " + name);
        }  
        return name;
    }
}
    
