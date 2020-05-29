package com.DreghiciuAnca.Iteration3.agent;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class AgentCreatePlace {
    private String noun;
    private String verb;


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

    public AgentCreatePlace()
    {
        this.verb ="";
        this.noun ="";
        createPlace();
    }

    public void setNoun(String noun){this.noun = noun;}
    public String getNoun(){return this.noun;}
    public void setVerb(String verb){this.verb = verb;}
    public String getVerb(){return this.verb;}

    public void createPlace(){

         String string_name ="";
         String string_display_name = "";
         String string_address = "";
         String string_capacity = "";
         String string_availability ="";
         String string_contact ="";
         String string_district_name= "";
         String string_city_name ="";


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
