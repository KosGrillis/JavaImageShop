import java.util.Arrays;

public class ImageShop {
	
	private static ImageDocument image;

	public static final void main(String[] args) {
		
		String filename;
		String outputFilename;
		
		EffectLibrary.initialize();
		
		if (args.length == 0){
			System.out.print("Java simple image editor\nUsage:\n");
			System.out.println("\"ImageShop effects\" to view list of all effects.");
			System.out.println("\"ImageShop [INPUT FILE PATH] [OUTPUT FILE PATH] [[EFFECT NAME], ...] \" to edit an image.");
		} 
		if (args.length == 1 && args[0].equalsIgnoreCase("effects")){
			String[] effects = EffectLibrary.availableEffects();
			System.out.println("Java simple image editor availble effects:");
			for (String effect : effects){
				System.out.println(effect);
			}
		}
		if (args.length > 1){
			filename = args[0];
			outputFilename = args[1];
			
			//read effects from command line...
			String desiredEffects[] = Arrays.copyOfRange(args, 2, args.length);
			
			//Get the effects from the library
			Effect[] transforms = processTransforms(desiredEffects);
			
			ImageLoader loader = new ImageLoader(filename);
			image = loader.loadImage();
			
			image.addTransformations(transforms);
			image.renderImage(outputFilename);
		}
	}
	
	//Save the required effects from command line to an array and get them from the EffectLibrary, 
	//return them in an array of effects which will be applied to the image...
	private static Effect[] processTransforms(String args[]){
		
		Effect[] transforms = new Effect[args.length];
		
		int i = 0;
		for (String effect : args){
			transforms[i] = EffectLibrary.getEffect(effect);
			i++;
		}
		
		return transforms;
		
	}
}
