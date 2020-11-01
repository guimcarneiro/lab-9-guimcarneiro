package padaria.massas;

import padaria.enums.MassaEnum;

public class MassaFactory {
	
	public static Massa buildMassa(MassaEnum massa) {
		
		switch(massa) {
			case BAUNILHA:
				return new Baunilha();
				
			case CHOCOLATE:
				return new Chocolate();
		
		}
		
	return null;
	}
}
