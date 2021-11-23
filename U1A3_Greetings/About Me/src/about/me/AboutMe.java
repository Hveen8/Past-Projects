/*
About Me
By Harry van der Veen
Made on 09/10/19

This is an introductory program
 */
package about.me;

import java.awt.*;
import javax.swing.*;

public class AboutMe extends JFrame{


    public AboutMe () {
        super ("About Me");
        
        String nam = "Harry van der Veen",
               schl = "Southwood Secondary School",
               musc = "Hits from the 80s to 90s",
               tvshw = "One Punch Man",
               colr = "Green";
        
        String info = "<html>My Name: " + nam + "<p>" +
                      "My School: " + schl + "<p>" +
                      "My Favoutrite Music: " + musc + "<p>" +
                      "My Favourite TV Show: " + tvshw + "<p>" +
                      "My Favourite Colour: " + colr + "</html>";
        
        setSize(350,150);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel pageLabel = new JLabel(info);
        FlowLayout flo = new FlowLayout();
        setLayout(flo);
        add(pageLabel);
        setVisible(true);

    }

    public static void main(String[] args) {
        AboutMe am = new AboutMe();
    }
    
}
