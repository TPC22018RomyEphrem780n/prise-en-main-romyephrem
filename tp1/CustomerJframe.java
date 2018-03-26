/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1;

import java.awt.Desktop;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import tp1.Client.ClientBuilder;
import tp1.IButtonListener;

/**
 *
 * @author Romy
 */
public class CustomerJframe extends JFrame{
    
    static IButtonListener listener;
    private static ButtonListener buttonlistener;
    
    public static void main(String[] args) {
    buttonlistener = new ButtonListener();
    listener = (IButtonListener) buttonlistener;
        
    JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        // labels
        JLabel labelid = new JLabel("Id");
        JLabel labelnom = new JLabel("Nom");
        JLabel labelprenom = new JLabel("Prenom");
        JLabel labelville = new JLabel("Ville");
        JLabel labelcode = new JLabel("Code");
        JLabel labeltelephone = new JLabel("Telephone");
        JLabel labeletat = new JLabel("Etat");
        JLabel labelpays = new JLabel("Pays");
        JLabel labelrue = new JLabel("Rue");
        JLabel labelmail = new JLabel("Mail");
        
        // buttons
        JButton create = new JButton();
        create.setText("Creer un client");
        JButton update = new JButton();
        update.setText("Update un client");
        JButton delete = new JButton();
        delete.setText("Supprimer un client");
        
        final JTextField id = new JTextField();
        final JTextField nom = new JTextField();
        final JTextField prenom = new JTextField();
        final JTextField ville = new JTextField();
        final JTextField code = new JTextField();
        final JTextField telephone = new JTextField();
        final JTextField etat = new JTextField();
        final JTextField pays = new JTextField();
        final JTextField rue = new JTextField();
        final JTextField mail = new JTextField();
        
        panel.add(labelid);
        panel.add(labelnom);
        panel.add(labelprenom);
        panel.add(labelville);
        panel.add(labelcode);
        panel.add(id);
        panel.add(nom);
        panel.add(prenom);
        panel.add(ville);
        panel.add(code);
        
        panel.add(labeltelephone);
        panel.add(labeletat);
        panel.add(labelpays);
        panel.add(labelrue);
        panel.add(labelmail);
        panel.add(telephone);
        panel.add(etat);
        panel.add(pays);
        panel.add(rue);
        panel.add(mail);

               
        panel.add(create);
        panel.add(update);
        panel.add(delete);
        panel.setLayout(new GridLayout(5,5));

        frame.add(panel);
        frame.setSize(300, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        
        create.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae)
            {
                Client newClient = new Client.ClientBuilder(
                        id.getText().toString(),
                        prenom.getText().toString(),
                        nom.getText().toString(),
                        telephone.getText().toString(),
                        rue.getText().toString(),
                        ville.getText().toString(),
                        etat.getText().toString(),
                        code.getText().toString(),
                        pays.getText().toString(),
                        mail.getText().toString()
                ).build();
                
                listener.OnClickCreate(newClient);
            }
        });
       
    }
}
