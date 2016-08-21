import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageDocument {
	
	public BufferedImage image;
	public Effect[] transforms;
	
	public ImageDocument(BufferedImage img){
		this.image = img;
	}
	
	private void addTransform(Effect t){
		this.image = t.applyEffect(this.image);
	}
	
	public void addTransformations(Effect[] trans){
		for (Effect t : trans){
			addTransform(t);
		}
	}
	
	public void renderImage(String outputFileName){
		try {
			File outputFile = new File(outputFileName);
			ImageIO.write(this.image, "png" , outputFile);
		} catch (IOException e){
			System.out.println("Error: " + e);
		}
	}
}
