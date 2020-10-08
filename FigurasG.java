
package Figurasalv;
    
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

   
    public class FigurasG extends JPanel {
    // ventana
     private JFrame ventana;
        // contenedor
        private Container contenedor;

     FigurasG() {

        // inicializar la ventana
                ventana = new JFrame("Dibujando icono");
                // definir tamaño a ventana
                ventana.setSize(800, 600);
                ventana.setVisible(true);
                ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                ventana.setResizable(false);

                contenedor = ventana.getContentPane();
                contenedor.setSize(800, 600);
                // agregar la ventana en el contenedor
                contenedor.add(this, BorderLayout.CENTER);
    }
    protected void paintComponent (Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.pink);
        g.drawLine(100, 50, 200, 50);
        g.drawLine(200, 50, 200, 100);
        g.drawLine(100, 50, 100, 100);
        g.drawLine(100, 100, 200, 100);

        g.setColor(Color.DARK_GRAY);
        g.drawLine(100, 50, 150, 20);
        g.drawLine(200, 50, 150, 20);


        g.setColor(Color.blue);
        g.drawRect(280, 50, 100, 50);
        g.setColor(Color.cyan);
        g.fillRect(280,150, 100, 50);


        //trazo de rectangulos redondeados
        g.setColor(Color.black);
        g.drawRoundRect(450, 50, 100, 50, 50, 50);
        g.setColor(Color.PINK);
        g.fillRoundRect(450, 150, 100, 50, 20, 20);

        //trazo de circulos
        g.setColor(Color.yellow);
        g.drawOval(100, 200, 80, 80);
        g.fillOval(100, 200, 80, 80);


        //dibujar triangulo
        g.setColor(Color.green);
        g.drawLine(450, 300, 550, 300);
        g.drawLine(450, 300, 500, 250);
        g.drawLine(550, 300, 500, 250);

        //dibujo de cadenas de texto
        g.setColor(Color.magenta);
        g.drawString("Ejemplo de trazo de figuras básicas", 200, 400);
        g.drawArc(500, 400, 200, 50, 360, 360);
        g.fillArc(500, 400, 200, 50, 350, 360);
        
         g.drawArc(300, 200, 200, 50, 360, 90);
        g.fillArc(300, 200, 200, 50, 360, 180);

    }


} 

