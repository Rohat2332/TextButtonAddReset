import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class TextButton extends Applet {
    TextField tekstvak;
    Label label;
    String s;
    Button knop1;
    Button knop2;

    public void init() {
        tekstvak = new TextField("Klik op mij", 20);
        label = new Label("Type iets in het tekstvak " +
                "en druk op add text");
        knop1.addActionListener( new Knop1Listener() );
        knop2.addActionListener( new Knop2Listener() );
        add(label);
        add(tekstvak);
        s = "";
    }
    {
        knop1 = new Button();
        knop1.setLabel( "Add Text" );
        add(knop1);
    }
    {
        knop2 = new Button();
        knop2.setLabel( "Reset" );
        add(knop2);
    }


    public void paint(Graphics g) {
        setBackground(Color.cyan);
        g.drawString(s, 50, 80 );
    }

    class Knop1Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            repaint();
        }
    }
    class Knop2Listener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            s= "" ;
            repaint();
        }
    }
}