package com.PsIter1.Iteration1.View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Gui extends JFrame implements MouseListener {

    private JFrame window = new JFrame("City Building");


    public Gui()
    {
        initFrame();
    }

    public void initFrame()
    {

        window.setSize(550,550);
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
        Map nou = new Map(e.getX(),e.getY());

        window.add(nou);
        //window.repaint();
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
