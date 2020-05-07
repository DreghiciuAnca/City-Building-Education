package com.Dreghiciu.Iteration2.client;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;


public class ClientGui extends JFrame implements MouseListener {

    private JFrame window = new JFrame("City Building");
    private JFrame operation = new JFrame();
    private ArrayList<Map> mapList = new ArrayList<>();
    private int x,y;
    public ClientGui()
    {
        initFrameConstruction();
        initFrame();
    }

    private void initFrameConstruction()
    {
        window.setSize(600, 600);
        window.addMouseListener(this);
        window.setDefaultCloseOperation(EXIT_ON_CLOSE);
        window.setVisible(true);
    }
    private void initFrame()
    {
        operation.setSize(400,500);
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5,2));
        JTextField search_bar = new JTextField("...");
        JButton search_butt = new JButton("search");
        JButton add_place = new JButton("Add Place");


        panel.add(search_bar);
        panel.add(search_butt);
        panel.add(add_place);
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
        Map map = new Map(e.getX(), e.getY());
        window.add(map);
        window.setVisible(true);
        x =e.getX()/100 *100;
        y =e.getY()/100 *100;

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
