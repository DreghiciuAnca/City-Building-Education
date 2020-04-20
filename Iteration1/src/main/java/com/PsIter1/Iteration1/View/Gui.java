package com.PsIter1.Iteration1.View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class Gui extends JFrame implements MouseListener {

    private JFrame window = new JFrame("City Building");
    private ArrayList<Map> mapList = new ArrayList<>();



    public Gui()
    {
        initFrame();
    }

    public void initFrame()
    {

        window.setSize(600,600);
        window.addMouseListener(this);
        window.setDefaultCloseOperation(EXIT_ON_CLOSE);
        window.setVisible(true);


    }


    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

        System.out.println(e.getX()+ " " + e.getY());
        //paint(getGraphics());
        Map map = new Map(e.getX(),e.getY());
        window.add(map);
        //repaint();
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

}
