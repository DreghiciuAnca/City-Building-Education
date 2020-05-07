package com.Dreghiciu.Iteration2.client;

import javax.swing.*;
import java.awt.*;

public class Map extends JPanel {
    private int x;
    private int y;
    public Map()
    {

    }
    public Map(int x,int y)
    {
        this.x=x;
        this.y=y;

    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        this.setBackground(Color.WHITE);
        g.setColor(Color.BLACK);
        int auxX = x/100;
        int auxY = y/100;

        auxX = auxX * 100;
        auxY = auxY * 100;

        g.fillRect(auxX,auxY,100,100);
        repaint(auxX,auxY,100,100);

    }
}
