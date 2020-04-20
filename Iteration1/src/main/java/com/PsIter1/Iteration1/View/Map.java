package com.PsIter1.Iteration1.View;

import javax.swing.*;
import java.awt.*;

public class Map extends JPanel {
    private int x;
    private int y;
    public Map(int x,int y)
    {
        this.x = x;
        this.y=y;
    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        this.setBackground(Color.WHITE);

        g.setColor(Color.BLUE);
        g.fillRect(x,y,100,100);


    }
}
