
//Recall of Day 19-04-2026

import java.awt.*;
import java.awt.event.*;
import java.net.URI;

class App extends Frame {

    App() {
        Button btn = new Button("HAI");
        Button btn1 = new Button("Welcome");
        Button btn2 = new Button("SanStudio");
        Button btn3 = new Button("Instagram");

        // Action for btn
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse(
                        new URI("https://sanstudio-hub.github.io/SanStudio-Hub/in")
                    );
                } catch (Exception ex) {
                    System.out.println("Error: " + ex);
                }
            }
        });

        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse(
                        new URI("https://www.instagram.com/sanstudio.dev/")
                    );
                } catch (Exception ex) {
                    System.out.println("Error: " + ex);
                }
            }
        });



        add(btn);
        add(btn1);
        add(btn2);
        add(btn3);

        setLayout(new FlowLayout());
        setVisible(true);
        setSize(400, 600);
    }

    public static void main(String[] args) {
        new App();
    }
}