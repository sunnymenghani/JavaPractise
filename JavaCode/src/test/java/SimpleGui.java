import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by sunny on 19/04/17.
 */
public class SimpleGui implements ActionListener {
    JButton jButton;
    public static void main(String[] args) {
        SimpleGui simpleGui = new SimpleGui();
        simpleGui.go();
    }

    public void go(){
        JFrame jFrame = new JFrame();
         jButton = new JButton("Click me");

        jButton.addActionListener(this);

        jFrame.getContentPane().add(jButton);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(300,300);
        jFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        jButton.setText("I have been clicked");
    }
}
