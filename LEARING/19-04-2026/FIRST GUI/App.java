import java.awt.*;

class App extends Frame{
    App(){
        Button btn = new Button("Hello");
        Button btn1 = new Button("SanStudio");
        add(btn);
        setLayout (new FlowLayout());
        setVisible(true);
        setSize(400, 400);
        add(btn1);
        setLayout (new FlowLayout());
        setVisible(true);
        setSize(400, 400);
    }

    public static void main(String[] args) {
       new App();
    }
}