package com.Dreghiciu.Iteration2.client;

import com.Dreghiciu.Iteration2.dto.PlaceDTO;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClientPanel extends JPanel {
    public JTextField search_bar = null;
    public JButton search_bar_button = null;
    public JButton add_place = null;

    public JLabel label_name =null;
    public JTextField text_name = new JTextField("");

    public JLabel label_display_name = new JLabel("display name: ");
    public JTextField text_display_name = new JTextField("");

    public JLabel label_address = new JLabel("adress: ");
    public JTextField text_address = new JTextField("");

    public JLabel label_capacity = new JLabel("capacity: ");
    public JTextField text_capacity = new JTextField("");

    public JLabel label_availability = new JLabel("availability: ");
    public JTextField text_availability = new JTextField("");

    public JLabel label_contact = new JLabel("contact: ");
    public JTextField text_contact = new JTextField("");

    public JButton button_save = new JButton("Save");





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

        public JLabel label_name = new JLabel("name: ");
        public JTextField text_name = new JTextField("");
        public JLabel label_display_name = new JLabel("display name: ");
        public JTextField text_display_name = new JTextField("");

        public JLabel label_address = new JLabel("adress: ");
        public JTextField text_address = new JTextField("");

        public JLabel label_capacity = new JLabel("capacity: ");
        public JTextField text_capacity = new JTextField("");

        public JLabel label_availability = new JLabel("availability: ");
        public JTextField text_availability = new JTextField("");

        public JLabel label_contact = new JLabel("contact: ");
        public JTextField text_contact = new JTextField("");

        public JLabel label_name_district = new JLabel("district name: ");
        public JTextField text_name_district = new JTextField("");

        public JLabel label_name_city = new JLabel("city name: ");
        public JTextField text_name_city = new JTextField("");


        public JButton button_save = new JButton("Save");

        public String string_name ="";
        public String string_display_name = "";
        public String string_address = "";
        public String string_capacity = "";
        public String string_availability ="";
        public String string_contact ="";
        public String string_district_name= "";
        public String string_city_name ="";



        @Override
        public void actionPerformed(ActionEvent e) {
            JFrame place_action = new JFrame("Add a place");
            JFrame message_location = new JFrame();


            place_action.setLocation(800,100);
            place_action.setVisible(true);
            place_action.setSize(300,400);

            JPanel panel_place = new JPanel();




            panel_place.setLayout(new GridLayout(9,2));


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

            panel_place.add(label_name_district);
            panel_place.add(text_name_district);

            panel_place.add(label_name_city);
            panel_place.add(text_name_city);

            panel_place.add(button_save);
            button_save.addActionListener(this:: actionSave);
            place_action.add(panel_place);

            JOptionPane.showMessageDialog(message_location, "Press where do you want a place on map!");

        }
        public void actionSave(ActionEvent e)
        {
            string_name = text_name.getText();
            string_display_name = text_display_name.getText();
            string_address = text_address.getText();
            string_capacity = text_capacity.getText();
            string_availability = text_availability.getText();
            string_contact = text_contact.getText();
            string_district_name = text_display_name.getText();
            string_city_name = text_name_city.getText();


            text_name.setText("");
            text_display_name.setText("");
            text_address.setText("");
            text_capacity.setText("");
            text_availability.setText("");
            text_contact.setText("");
            text_display_name.setText("");
            text_name_city.setText("");
        }

    }

}