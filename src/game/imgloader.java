package game;
import java.io.*;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Msk & Company
 */

public class imgloader {
    int dl;
    public imgloader(int ilosc) {
        if (ilosc > 0 && ilosc < 25) {
        dl = ilosc;
        }
        else {
            System.err.println("ERROR 0x000FF - tmi");
            System.exit(-1);
        }
    }
    public ImageIcon[] load() {
        ImageIcon[] image = new ImageIcon[dl];
        String[] karty = {"A1", "K1", "Q1", "J1", "101", "91","A2", "K2", "Q2", "J2", "102", "92","A3", "K3", "Q3", "J3", "103", "93","A4", "K4", "Q4", "J4", "104", "94"};           
        for (int i=0;i<karty.length;i++) {
        image[i] = new ImageIcon("img/"+karty[i]+".png");
        }
        return image;
    }
//    
//    public ImageIcon check() {
//        
//        return null;
//    }
    public ImageIcon[] load(String[] ukl) {
        ImageIcon[] image = new ImageIcon[ukl.length];
        for (int i=0;i<ukl.length;i++) {
            image[i] = new ImageIcon("img/"+ukl[i]+".png");
        }
        return image;
    }
}
