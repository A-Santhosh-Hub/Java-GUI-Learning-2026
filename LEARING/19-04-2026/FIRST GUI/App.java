import java.awt.*;
import java.awt.event.*;
import java.net.URI;


class App extends Frame{
    App(){
        Button btn = new Button("Hello");
        Button btn1 = new Button("SanStudio");
        Button btn2 = new Button("Open to See the Work");

        add(btn);
        add(btn1);
        add(btn2);


        btn2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try{
                    Desktop.getDesktop().browse(new URI("https://sanstudio-hub.github.io/SanStudio-Hub/in"));
                } catch(Exception ex){
                System.out.println("Error"+ex);
                }
            }
        });


        setLayout (new FlowLayout());
        setVisible(true);
        setSize(400, 400);
        
      
    }

    public static void main(String[] args) {
       new App();
    }
}



