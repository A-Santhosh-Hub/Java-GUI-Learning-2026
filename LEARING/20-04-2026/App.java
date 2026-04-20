
//Recall of Day 19-04-2026

import java.awt.*;
import java.awt.event.*;
import java.net.URI;

class App  {

    App() {
        
        Frame frame = new Frame();
        Label la =new Label("Input");
        Button btn = new Button("HAI");
        Button btn1 = new Button("Welcome");
        Button btn2 = new Button("SanStudio");
        Button btn3 = new Button("Instagram");
        TextArea text = new TextArea("Enter");
 

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


        frame.add(la);
        frame.add(btn);
         frame.add(btn1);
         frame.add(btn2);
         frame.add(btn3);
         frame.add(text);
         

         frame.setLayout(new FlowLayout());
         frame.setVisible(true);
         frame.setSize(400, 600);
         frame.setTitle("JAVA GUI");
    }

    public static void main(String[] args) {
        new App();
    }
}