import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class GrayScaleEffect implements Effect{

	@Override
	public BufferedImage applyEffect(BufferedImage img) {
		
		BufferedImage bw = new BufferedImage(img.getWidth(), img.getHeight(), BufferedImage.TYPE_BYTE_GRAY);
		
		Graphics g = bw.getGraphics();
		g.drawImage(img, 0, 0, null);
		g.dispose();
		
		return bw;
	}

}
