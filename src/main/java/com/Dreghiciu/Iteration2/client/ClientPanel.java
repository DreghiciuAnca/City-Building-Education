package com.Dreghiciu.Iteration2.client;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClientPanel extends JPanel {
    public JTextField search_bar = null;
    public JButton search_bar_button = null;
    public JButton add_place = null;



    public ClientPanel()
    {
        this.setLayout(new GridLayout(2,2));
        createPanel();
    }

    private void createPanel()
    {
        search_bar = new JTextField("");
        search_bar_button = new JButton("Search");
        add_place = new JButton("Add a new place");


        this.add(search_bar);
        this.add(search_bar_button);
        this.add(add_place);
        add_place.addActionListener(new ActionPlace());
        search_bar_button.addActionListener(this::actionPerformed);
    }

    public void actionPerformed(ActionEvent e) {
        String[] searchBarText = null;
        String text_search = this.search_bar.getText();
        searchBarText = text_search.split(" ");



    }
    static class ActionPlace implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            JFrame place_action = new JFrame("Add a place");
            JFrame message_location = new JFrame();


            place_action.setLocation(800,100);
            place_action.setVisible(true);
            place_action.setSize(300,400);


            JLabel label_name = new JLabel("name: ");
            JTextField text_name = new JTextField("");

            JLabel label_display_name = new JLabel("display name: ");
            JTextField text_display_name = new JTextField("");

            JLabel label_address = new JLabel("adress: ");
            JTextField text_address = new JTextField("");

            JLabel label_capacity = new JLabel("capacity: ");
            JTextField text_capacity = new JTextField("");

            JLabel label_availability = new JLabel("availability: ");
            JTextField text_availability = new JTextField("");

            JLabel label_contact = new JLabel("contact: ");
            JTextField text_contact = new JTextField("");

            JPanel panel_place = new JPanel();
            panel_place.setLayout(new GridLayout(6,2));


            panel_place.add(label_name);
            panel_place.add(text_name);

            panel_place.add(label_display_name);
            panel_place.add(text_display_name);

            panel_place.add(label_address);
            panel_place.add(text_address);

            panel_place.add(label_capacity);
            panel_place.add(text_capacity);

            panel_place.add(label_availability);
            panel_place.add(text_availability);

            panel_place.add(label_contact);
            panel_place.add(text_contact);


            place_action.add(panel_place);

            JOptionPane.showMessageDialog(message_location, "Press where do you want a place on map!");

        }
    }

}
