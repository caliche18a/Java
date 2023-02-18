package ventana;

import javax.swing.*;

public class Ventana extends JFrame {

    public Ventana (){
        //Tamaño
        setSize(400,400);
        //titulo
        setTitle("UCOLTIS");
        //finalizar la ventana
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //posicion de la pantalla
        setLocationRelativeTo(null);

    }
}
