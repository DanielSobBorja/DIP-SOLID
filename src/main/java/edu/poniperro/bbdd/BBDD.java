package edu.poniperro.bbdd;

import java.util.HashMap;
import java.util.Map;

public class BBDD {

	// ----- esta es nuestra "base de datos" -----
	static final Map<String, Map<String, Integer>> stocs = new HashMap<>();
	
	static {
		final Map<String, Integer> stocTiendaNorte = new HashMap<>();
		stocTiendaNorte.put("lampara",600);
		stocTiendaNorte.put("mesa",500);
		
		stocs.put("tienda norte", stocTiendaNorte);
	}
	


}
