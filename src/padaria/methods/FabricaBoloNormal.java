package padaria.methods;

import padaria.enums.CoberturaEnum;
import padaria.enums.MassaEnum;

public class FabricaBoloNormal extends FabricaBolo {

	public FabricaBoloNormal(CoberturaEnum cobertura, MassaEnum massa) {
		super(cobertura, massa);
	}

	@Override
	public void fazerCobertura() {
		super.bolo.getCobertura().fazerCobertura();
	};

	@Override
	public void fazerMassa() {
		super.bolo.getMassa().fazerMassa();
	};

}
