import java.awt.image.BufferedImage;
import java.awt.image.RescaleOp;

public class InvertEffect implements Effect{

	@Override
	public BufferedImage applyEffect(BufferedImage img) {

		RescaleOp resOp = new RescaleOp(-1.0f, 255f, null);
		resOp.filter(img, img);
		
		return img;
	}

}
