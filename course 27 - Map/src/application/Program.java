package application;

import java.util.Map;
import java.util.TreeMap;

public class Program {

	public static void main(String[] args) {
		Map<String,String> cookies = new TreeMap<>();
		
		cookies.put("username", "Ane");
		cookies.put("login", "Ane2003)");
		cookies.put("phone", "47988332433");
		
		cookies.remove("login");
		
		System.out.println("All Cookies: ");
		for(String key : cookies.keySet()) {
			System.out.println(key + ": " + cookies.get(key));
		}
	}

}
