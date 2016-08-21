import java.awt.image.BufferedImage;
import java.awt.image.RescaleOp;

public class BrightenEffect implements Effect{

	@Override
	public BufferedImage applyEffect(BufferedImage img) {
		RescaleOp resOp = new RescaleOp(1.2f, 15, null);
		resOp.filter(img, img);
		return img;
	}

}
