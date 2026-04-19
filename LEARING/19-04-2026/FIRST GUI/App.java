import java.awt.*;

class App extends Frame{
    App(){
        Button btn = new Button("Hello");
        Button btn1 = new Button("SanStudio");
        Button btn2 = new Button("Open to See the Work");
        add(btn);
        add(btn1);
        add(btn2);



        setLayout (new FlowLayout());
        setVisible(true);
        setSize(400, 400);
        
      
    }

    public static void main(String[] args) {
       new App();
    }
}