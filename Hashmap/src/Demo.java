import java.util.HashMap;
import java.util.Map.Entry;
public class Demo {
	
	static HashMap<String, Float> weather = new HashMap<String, Float>();
	

	public static void main(String[] args) {
		
		weather.put("wind", 55f);
		weather.put("minTemperature", 20.5f);
		weather.put("maxTemperature", 50.8f);
		weather.put("humidity", 50.0f);
		weather.put("airPressure", 12f);
		
		for (Entry<String, Float> entry : weather.entrySet()){
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		
		System.out.println("--------");
		
		for (String key : weather.keySet()) {
			System.out.println(key + ":" + weather.get(key));
		}
		
		System.out.println("--------");
		
		weather.forEach((k, v) -> System.out.println((k + ":" + v)));
		
		weather.replace("wind", 75f);
		weather.remove("air pressure");
		
		System.out.println(weather);
		
		weather.clear();
		System.out.println(weather);

	}

}
