import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {

    private Teclado teclado;


    public Main(){
        setTitle("Calculadora");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,600);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
        teclado = new Teclado();
        add(teclado);
       revalidate();

    }



    public static void main(String args[]){
        new Main();
    }
}
