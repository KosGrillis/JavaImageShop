import java.awt.image.BufferedImage;
import java.awt.image.RescaleOp;

public class DarkenEffect implements Effect{

	@Override
	public BufferedImage applyEffect(BufferedImage img) {
		RescaleOp resOp = new RescaleOp(0.6f, 15, null);
		resOp.filter(img, img);
		return img;
	}

}
