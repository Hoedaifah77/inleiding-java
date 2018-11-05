package h010;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Opdracht103 extends Applet {

    TextField tekstvak;
    Button knop;

    int input;


    int dag;
    String s, tekst;



    public void init() {

        /////tekstvak////
        tekstvak = new TextField("", 20);
        tekstvak.addActionListener(new tekstvaklistener());
        add(tekstvak);

        ////knop///
        knop = new Button("klik");
        knop.addActionListener(new knoplistener());
        add(knop);


    }

    public void paint(Graphics g) {

        g.setColor(Color.magenta);
        g.drawString("maandnaam en dagen =  " + tekst ,20,40);





    }

    class tekstvaklistener implements ActionListener {
        public void actionPerformed(ActionEvent e) {


            s = tekstvak.getText();

            dag = Integer.parseInt(s);

            switch (dag) {
                case 1:
                    tekst = "Januari heeft 31 dagen";
            }


                    switch (dag) {
                        case 2:
                            tekst = "Februari heeft 28 dagen";
                    }

                    switch (dag){
                case 3:
                    tekst = "Maart heeft 31 dagen ";

            }
                  switch (dag){
                case 4:
                    tekst = "April heeft 30 dagen";

            }
                  switch (dag){
                case 5:
                    tekst = "Mei heeft 31 dagen";

            }
                  switch (dag){
                case 6:
                    tekst = "juni heeft 30 dagen";

            }
                  switch (dag){
                case 7:
                    tekst = "juli heeft 31 dagen";

            }
                  switch (dag){
                case 8:
                    tekst = "Augustus heeft 31 dagen ";

            }
                  switch (dag){
                case 9:
                    tekst = "September heeft 30 dagen";

            }
                  switch (dag){
                case 10:
                    tekst = "Oktober heeft 31 dagen ";

            }
                  switch (dag){
                case 11:
                    tekst = "November heeft 30 dagen";

            }
                  switch (dag){
                case 12:
                    tekst = "December heeft 31 dagen";

            }

            repaint();

            tekstvak.setText("");
            repaint();


        }

    }

    class knoplistener implements ActionListener {
        public void actionPerformed(ActionEvent e) {


            input = Integer.parseInt(tekstvak.getText());





        }

    }
}

