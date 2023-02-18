package ejercicio1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Jventana extends JFrame {

    private JTextField nameField;
    private JTextField ageField;
    private JButton submitButton;
    private JButton exitButton;

    public Jventana(){

        //configurar la ventana

        setTitle("Wellcome");
        setSize(300,200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //crear elementos de la interfax
        nameField = new JTextField();
        ageField = new JTextField();

        submitButton = new JButton("SUBMIT");
        exitButton = new JButton("EXIT");

        //añadir los elementos de la ventana

        JPanel panel = new JPanel();

        panel.setLayout(new GridLayout(3,2));

        panel.add(new JLabel("Name: "));
        panel.add(nameField);

        panel.add(new JLabel("Age: "));
        panel.add(ageField);

        panel.add(submitButton);
        panel.add(exitButton);
        add(panel);

        //añadir las acciones de los botones - Eventos

        submitButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){

                String name = nameField.getText();
                String age = ageField.getText();

                JOptionPane.showMessageDialog(Jventana.this,"Wellcome "+name+" your age is "+age+" years");

            }
        });

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

    }
}
