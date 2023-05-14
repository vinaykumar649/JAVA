
import java.awt.*;

public class JFC extends Frame {
    // extending Frame class to our class AWTExample1
    // initializing using constructor
    JFC() {
        // creating a button
        Button b = new Button("Click Me!!");
        // setting button position on screen
        b.setBounds(30, 100, 80, 30);
        // adding button into frame
        add(b);
        // frame size 300 width and 300 height
        setSize(300, 300);
        // setting the title of Frame
        setTitle("JFC example");
        // no layout manager
        setLayout(null);
        // now frame will be visible, by default it is not visible
        setVisible(true);
    }

    // main method
    public static void main(String args[]) {
        // creating instance of Frame class
        JFC f = new JFC();
    }
}
