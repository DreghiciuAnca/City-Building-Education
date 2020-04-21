package com.PsIter1.Iteration1.View;

import com.PsIter1.Iteration1.service.PictureService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class Gui extends JFrame implements MouseListener {

    private JFrame window = new JFrame("City Building");
    private ArrayList<Map> mapList = new ArrayList<>();
    private int x,y;

    @Autowired
    private PictureService pictureService;

    public Gui() {
        initFrame();
    }

    public void initFrame() {

        window.setSize(600, 600);
        window.addMouseListener(this);
        window.setDefaultCloseOperation(EXIT_ON_CLOSE);
        window.setVisible(true);


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


        //PlaceController placeController = new PlaceController();

        //placeController.insertPlace(x,y);
       // PlaceController placeController = new PlaceController();
       // placeController.insertPlace(e.getX(),e.getY());
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