package tvshows;
import java.util.*;



public class Main {
	
	static ArrayList<String> tvshows = new ArrayList<>();
	
	public static void main(String[] args) {
		
		System.out.println("Here are my top 8 TV shows");
		
		tvshows.add("The Last Kingdom");
		tvshows.add("The Witcher");
		tvshows.add("The Mandalorian");
		tvshows.add("The Office");
		tvshows.add("Parks And Recreation");
		tvshows.add("Stranger Things");
		tvshows.add("Bob's Burgers");
		tvshows.add("Rick And Morty");
		tvshows.add("The Office");
		ListIterator<String> iterate = tvshows.listIterator();
		
		while(iterate.hasNext()) {
			System.out.println(iterate.next());
		}
		
		System.out.println("--------");
		System.out.println("Is Friends one of my favorite TV shows?");
		if (tvshows.contains("Friends")) {
			System.out.println("Yes");
		}
		else { System.out.println("No");
		}
		
		System.out.println("--------");
		System.out.println("My first favorite show is " + tvshows.get(0));
		System.out.println("I watch " + tvshows.get(tvshows.size() - 1) + " as a last resort ");
		
		System.out.println("--------");
		System.out.println("I no longer like The Office and have replaced it with American Dad. \n"
				+ "My new list looks like this now:");
		tvshows.set(3, "American Dad");
//		for (String list : tvshows) {
//			System.out.println(list);
//		}
		System.out.println(tvshows);
		
		System.out.println("--------");
		System.out.println("Family Guy has become my new favorite show. I will insert it as the first element \n"
		+ "and move everything else to the right. My tvshows list looks like this now:");
		tvshows.add(0, "Family Guy");
		System.out.println(tvshows);
		
		System.out.println("--------");
		System.out.println("I don't like watching TV shows: " + tvshows.isEmpty());
		System.out.println("--------");
		System.out.println("I should concentrate on work and stop watching TV shows. Adulting is hard! \n"
				+ "Clearing the tvshows ArrayList");
		tvshows.clear();
		System.out.println(tvshows + " size is " + tvshows.size());
	}
}
