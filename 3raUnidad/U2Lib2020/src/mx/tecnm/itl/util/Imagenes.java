package mx.tecnm.itl.util;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author adria
 */
public class Imagenes {
    public static Image getScaledimage ( Image srcing, int M, int H){
        BufferedImage resizeImg = new BufferedImage( M, H, BufferedImage.TYPE_INT_RGB );
        Graphics2D g2 = resizeImg.createGraphics ();
        g2.setRenderingHint( RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR );
        g2.drawImage( srcing, 0, 0, M, H, null );
        g2.dispose();
        return resizeImg;
        
    }
    
    public static Icon escalarImagen ( Icon srcIng, int M, int H ){
        Image img = ( ( ImageIcon ) srcIng ).getImage();
        img = getScaledimage ( img, M, H);
        return new ImageIcon ( img );
        
    }
}
