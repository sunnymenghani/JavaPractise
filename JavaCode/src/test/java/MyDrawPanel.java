import com.sun.prism.Graphics;

import javax.swing.*;
import java.awt.*;

/**
 * Created by sunny on 19/04/17.
 */
public class MyDrawPanel extends JPanel {
    public static void main(String[] args) {

    }

    public void paintComponent(java.awt.Graphics g){
        g.setColor(Color.ORANGE);
        g.fillRect(20,50,100,100);

    }
}
