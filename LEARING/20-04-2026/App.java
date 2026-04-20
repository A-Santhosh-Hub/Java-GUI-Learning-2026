
//Recall of Day 19-04-2026


import java.awt.*;
import java.awt.event.*;
import java.net.URI.*;

class App extends Frame{

    App(){
        Button btn=new Button("HAI");
        Button btn1 = new Button("Well Come");
        Button btn2 = new Button("SanStudio");

    add(btn);
    add(btn1);
    add(btn2);

    setLayout(new FlowLayout());
    setVisible(true);
    setSize(400,600);

    }



    public static void main(String[] args) {
        new App();
    }
}