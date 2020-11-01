package padaria.methods;

import padaria.enums.MassaEnum;

public class FabricaBoloSemCobertura extends FabricaBolo {

	public FabricaBoloSemCobertura(MassaEnum massa) {
		super(massa);
	}

	@Override
	public void fazerCobertura() {
		System.out.println("Esse bolo não possui cobertura");
	}

	@Override
	public void fazerMassa() {
		super.bolo.getMassa().fazerMassa();
	}

}
