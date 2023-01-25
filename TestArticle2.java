package ht.bac3;


import java.util.*;

public class TestArticle2 {

	public static void main(String[] args) {
		Hashtable <Long, String> tabArticle = new Hashtable<Long, String>();	
		tabArticle.put(1L, "PAIN");
		tabArticle.put(2L, "MAIS");
		tabArticle.put(3L, "SARDINE");
		tabArticle.put(4L, "ANANAS");
		tabArticle.put(5L, "TOMATE");
		tabArticle.put(6L, "BISCUIT");
		tabArticle.put(7L, "SANDWICH");
		tabArticle.put(8L, "NOKIA");
		tabArticle.put(9L, "iPHONE");
		tabArticle.put(10L, "TECHNO");
		tabArticle.put(11L, "TECHNO SPARK");
		tabArticle.put(12L, "SAMSUNG");
		tabArticle.put(13L, "ORANGE");
		tabArticle.put(14L, "ORDINATEUR");
		tabArticle.put(15L, "IMPRIMANTE");
		tabArticle.put(16L, "CABLE ELECTRIQUE");
		tabArticle.put(17L, "SOURIS");
		tabArticle.put(18L, "FLASH");
		tabArticle.put(19L, "CITRON");
		tabArticle.put(20L, "FLEUR");
		for(Map.Entry tabentry: tabArticle.entrySet() ) {
			if(tabentry.getValue().equals("CITRON"))
		
			System.out.println("cle: "+tabentry.getKey()
					+" valeur :" + tabentry.getValue());
	}

}
}
