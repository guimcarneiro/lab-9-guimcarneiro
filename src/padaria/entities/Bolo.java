package padaria.entities;

import padaria.coberturas.Cobertura;
import padaria.coberturas.CoberturaFactory;
import padaria.enums.CoberturaEnum;
import padaria.enums.MassaEnum;
import padaria.massas.Massa;
import padaria.massas.MassaFactory;

public class Bolo {
	
	private Cobertura cobertura;
	
	private Massa massa;
	
	public Bolo(MassaEnum massa) {
		this.cobertura = null;
		this.massa = MassaFactory.buildMassa(massa);
	}
	
	public Bolo(CoberturaEnum cobertura, MassaEnum massa) {
		this.cobertura = CoberturaFactory.buildCobertura(cobertura);
		this.massa = MassaFactory.buildMassa(massa);
	}

	public Cobertura getCobertura() {
		return cobertura;
	}

	public void setCobertura(Cobertura cobertura) {
		this.cobertura = cobertura;
	}

	public Massa getMassa() {
		return massa;
	}

	public void setMassa(Massa massa) {
		this.massa = massa;
	}
	
}
