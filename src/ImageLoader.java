import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageLoader {
	
	private String filename;
	
	public ImageLoader(String file){
		this.filename = file;
	}
	
	public ImageDocument loadImage(){
		
		File imgFile = openImageFile(this.filename);
		BufferedImage img = null;
		
		try {
			img = ImageIO.read(imgFile);
			
		} catch(IOException e){
			System.out.println("Error: " +e);
			System.exit(1);
		}
		
		ImageDocument doc = new ImageDocument(img);
		
		return doc;
		
	}
	
	public void writeImage(Image img, String outputFile){
	}
	
	private File openImageFile(String filename){
		
		File f = null;
		
		try {
			f = new File(filename);
		} catch(NullPointerException e){
			System.out.println("Invalid or incorrect image file path. Stopping excecution...");
			System.exit(1);
		}
		return f;
		
	}

}
