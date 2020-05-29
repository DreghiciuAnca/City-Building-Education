package com.DreghiciuAnca.Iteration3.gui;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.HashMap;

public class Gui extends JFrame implements MouseListener {
    private JFrame window = new JFrame("City Building");
    private JFrame operation = new JFrame("Operation");
    private ArrayList<Map> mapList = new ArrayList<>();
    private HashMap<Integer,Integer> coordinates = new HashMap<>();
    private int x,y;


    public Gui()
    {
        initFrameConstruction();
        initFrame();
    }

    private void initFrameConstruction()
    {
        window.setSize(600, 600);
        window.setLocation(0,100);
        window.addMouseListener(this);
        window.setDefaultCloseOperation(EXIT_ON_CLOSE);
        window.setVisible(true);
    }
    private void initFrame()
    {
        operation.setSize(400,500);
        Panel panel = new Panel();

        operation.setLocation(600,100);
        operation.add(panel);
        operation.setDefaultCloseOperation(EXIT_ON_CLOSE);
        operation.setVisible(true);

    }


    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println(e.getX() + " " + e.getY());
        JFrame message_coordinates = new JFrame();
        x =e.getX()/100 *100;
        y =e.getY()/100 *100;
        boolean ok =false;

        for(int i = 0; i< coordinates.size(); i++)
        {
            if(coordinates.containsKey(x))
            {
                if(coordinates.get(x) == y) {
                    ok = true;
                    JOptionPane.showMessageDialog(message_coordinates,"You cannot put a place here. Pick another one!");
                    break;
                }
            }
        }
        if(!ok)
            coordinates.put(x,y);
        Map map = new Map(e.getX(), e.getY());


        window.add(map);
        window.setVisible(true);



    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }
}
