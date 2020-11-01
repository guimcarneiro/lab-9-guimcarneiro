package padaria.methods;

import padaria.entities.Bolo;
import padaria.enums.CoberturaEnum;
import padaria.enums.MassaEnum;

public abstract class FabricaBolo {
	
	protected Bolo bolo;
	
	public FabricaBolo(MassaEnum massa) {
		this.bolo = new Bolo(massa);
	}
	
	public FabricaBolo(CoberturaEnum cobertura, MassaEnum massa) {
		this.bolo = new Bolo(cobertura, massa);
	}
	
	public void prepararBolo() {
		fazerMassa();
		levarAoForno();
		fazerCobertura();
		decorarBolo();
	}
	
	public void levarAoForno() {
		System.out.println("Leva ao forno");
	}
	
	public abstract void fazerCobertura();
	
	public abstract void fazerMassa();
	
	public void decorarBolo() {
		System.out.println("Decora bolo");
	}
	
}
