import java.util.HashMap;

public class EffectLibrary {
	
	private static final HashMap<String, Effect> EFFECTS = new HashMap<String, Effect>();
	
	public static void initialize(){
		
		//Add the effects to the effect library...
		Effect grayScale = new GrayScaleEffect();
		Effect brighten = new BrightenEffect();
		Effect invert = new InvertEffect();
		Effect darken = new DarkenEffect();
		
		registerEffect("greyscale", grayScale);
		registerEffect("brighten", brighten);
		registerEffect("invert", invert);
		registerEffect("darken", darken);
	}
	
	private static void registerEffect(String name, Effect effect){
		EFFECTS.put(name, effect);
	}
	
	public static boolean deregisterEffect(String name){
		return false;
	}
	
	public static Effect getEffect(String name){
		return EFFECTS.get(name);
	}
	
	public static String[] availableEffects(){		
	    return EFFECTS.keySet().toArray(new String[EFFECTS.size()]);
	}
}
