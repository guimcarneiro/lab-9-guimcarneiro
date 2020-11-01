package padaria.coberturas;

import padaria.enums.CoberturaEnum;

public class CoberturaFactory {

	public static Cobertura buildCobertura(CoberturaEnum cobertura) {
		
		switch(cobertura) {
			case CARAMELO:
				return new Caramelo();
				
			case MORANGO:
				return new Morango();

		}
		
		return null;
	}
	
}
