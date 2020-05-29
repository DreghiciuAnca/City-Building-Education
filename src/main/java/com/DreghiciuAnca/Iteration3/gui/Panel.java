package com.DreghiciuAnca.Iteration3.gui;

import com.DreghiciuAnca.Iteration3.dto.DeletePlaceDto;
import com.DreghiciuAnca.Iteration3.dto.PlaceDTO;
import com.DreghiciuAnca.Iteration3.intent.IntentHandler;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Panel extends JPanel{
    public JTextField search_bar = null;
    public JButton search_bar_button = null;
    public JButton add_place = null;

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
    public String string_district_name= "";
    public String string_city_name ="";




    public int indexAgent = -1;

    public PlaceDTO placeDTO = new PlaceDTO();
    public DeletePlaceDto placeDeleteDTO = null;

    public Panel()
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
        add_place.addActionListener(this::actionPerformedSearch);
        search_bar_button.addActionListener(this::actionPerformed);
    }

    public void actionPerformed(ActionEvent e) {

        String text_search = this.search_bar.getText();

        String re =".*create.+place";
        ArrayList<String> regex = new ArrayList<String>();
        regex.add(re);
        regex.add(".*add.+place");
        regex.add(".*create.+building");
        regex.add(".*add.+building");
        regex.add(".*delete.+place");
        regex.add(".*delete.+building");
        int i;
        for(i=0; i<regex.size(); i++)
        {
            Pattern pt = Pattern.compile(regex.get(i));
            Matcher matcher = pt.matcher(text_search);
            boolean result = matcher.matches();
            if(result)
                break;

        }
        switch (i)
        {
            case 0:
            {


            }
            case 1:
            case 2:
            case 3:
            {

                createPlace();

                this.indexAgent =0;
                break;
            }
            case 4:
            case 5:
            {
                deletePlace();
                this.indexAgent =1;
                break;
            }
        }


    }

        public void actionPerformedSearch(ActionEvent e) {

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
            string_district_name = text_name_district.getText();
            string_city_name = text_name_city.getText();

            placeDTO.setAddress(text_address.getText());
            placeDTO.setAvailability(text_availability.getText());
            placeDTO.setCapacity(text_capacity.getText());
            placeDTO.setContact(text_contact.getText());
            placeDTO.setDistrictDTO(null);
            placeDTO.setName(text_name.getText());
            placeDTO.setDisplayName(text_display_name.getText());


            text_name.setText("");
            text_display_name.setText("");
            text_address.setText("");
            text_capacity.setText("");
            text_availability.setText("");
            text_contact.setText("");
            text_name_district.setText("");
            text_name_city.setText("");
            IntentHandler intentHandler = new IntentHandler(this.indexAgent, placeDTO);

        }
        public void createPlace()
        {
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

        public void deletePlace()
        {
            JFrame place_delete = new JFrame("Delete a place");
            JPanel panel_place_delete = new JPanel();
            JLabel name = new JLabel("name: ");
            JLabel address = new JLabel("address: ");
            JTextField textFieldName = new JTextField(" ");
            JTextField textFieldAddress = new JTextField(" ");

            JButton delete_place_button = new JButton("delete place");
            panel_place_delete.add(name);
            panel_place_delete.add(textFieldName);
            panel_place_delete.add(address);
            panel_place_delete.add(textFieldAddress);
            panel_place_delete.add(delete_place_button);

            placeDeleteDTO.setName(textFieldName.getText());
            placeDeleteDTO.setAddress(textFieldAddress.getText());


            place_delete.add(panel_place_delete);
            delete_place_button.addActionListener(this:: actionDelete);


        }

        public void actionDelete(ActionEvent e)
        {
            IntentHandler intentHandler = new IntentHandler(this.indexAgent, placeDeleteDTO);
        }


}
