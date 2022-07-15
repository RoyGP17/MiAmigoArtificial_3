package Interfaz;

import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ClaseGato extends JPanel implements KeyListener {

    //OBTENEMOS LA IMAGEN DEL GATO
    File file = new File("C:\\Users\\FRITZBRENNER\\Desktop\\MiAmigoArtificial_3\\src\\main\\java\\Imagenes\\gato.png");
    BufferedImage bufferedImage = ImageIO.read(file);
    Image image = bufferedImage.getScaledInstance(200, 200, Image.SCALE_DEFAULT);
    ImageIcon imageIcon = new ImageIcon(image);
    JLabel ImagenGato = new JLabel(imageIcon);

    //Eventos de las teclas para mover al michi y cargar la imágen con el método add()
    public ClaseGato() throws IOException {
        addKeyListener(this);
        setFocusable(true);
        add(ImagenGato);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        if (e.getKeyChar() == 'w' || e.getKeyChar() == 'w' || e.getExtendedKeyCode() == KeyEvent.VK_UP)
        {
            ImagenGato.setLocation(ImagenGato.getX(), ImagenGato.getY() - 10);
        }
        if (e.getKeyChar() == 's' || e.getKeyChar() == 's' || e.getExtendedKeyCode() == KeyEvent.VK_DOWN)
        {
            ImagenGato.setLocation(ImagenGato.getX(), ImagenGato.getY() + 10);
        }
        if (e.getKeyChar() == 'd' || e.getKeyChar() == 'd' || e.getExtendedKeyCode() == KeyEvent.VK_RIGHT)
        {
            ImagenGato.setLocation(ImagenGato.getX() + 10, ImagenGato.getY());
        }
        if (e.getKeyChar() == 'a' || e.getKeyChar() == 'a' || e.getExtendedKeyCode() == KeyEvent.VK_LEFT)
        {
            ImagenGato.setLocation(ImagenGato.getX() - 10, ImagenGato.getY());
        }
        if (e.getExtendedKeyCode() == KeyEvent.VK_ENTER) {
            System.exit(0);
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getExtendedKeyCode() == KeyEvent.VK_UP)
        {
            ImagenGato.setLocation(ImagenGato.getX(), ImagenGato.getY() - 10);
        }
        if (e.getExtendedKeyCode() == KeyEvent.VK_DOWN)
        {
            ImagenGato.setLocation(ImagenGato.getX(), ImagenGato.getY() + 10);
        }
        if (e.getExtendedKeyCode() == KeyEvent.VK_RIGHT)
        {
            ImagenGato.setLocation(ImagenGato.getX() + 10, ImagenGato.getY());
        }
        if (e.getExtendedKeyCode() == KeyEvent.VK_LEFT)
        {
            ImagenGato.setLocation(ImagenGato.getX() - 10, ImagenGato.getY());
        }
                if (e.getExtendedKeyCode() == KeyEvent.VK_ENTER) {
            System.exit(0);
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
