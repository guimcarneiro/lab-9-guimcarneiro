package padaria;

import padaria.enums.CoberturaEnum;
import padaria.enums.MassaEnum;
import padaria.methods.FabricaBolo;
import padaria.methods.FabricaBoloNormal;
import padaria.methods.FabricaBoloSemCobertura;

public class Cliente {
	
	/**
	 * Guilherme de Melo Carneiro - 118210938
	 * 
	 * Problema de fabricação de bolo. Solução para algoritmo com trechos intercambiáveis seguindo o padrão Template Method.
	 * 
	 * Uma vez implementada a classe abstrata FabricaBolo, trechos do algoritmo padrão proposto por essa classe podem ser sobrescritos por subclasses, como é o caso de FabricaBoloNormal
	 * e FabricaBoloSemCobertura, que se diferenciam por implementarem partes do algoritmo padrão de maneira personalizada.
	 * 
	 * Além de permitir a personalização de partes do algoritmo original, essa solução também utiliza do padrão de projeto Bridge, que evita a multiplicação de classes personalizadas
	 * absorvendo as "dimensões" do problema(variação de cobertura e massa) através da decomposição dessas informações em outra entidade, chamada de "Bolo".
	 * 
	 * Considerando a utilização do padrão Bridge, tornou-se necessário também utilizar o padrão Expert, no qual cada entidade guarda as informações importantes sobre ela própria.
	 * Na atual implementação, o expert da informação de fazer a massa é a própria Massa(Chocolate, Baunilha), e o expert da informação de fazer a cobertura é a própria Cobertura(Caramelo, Morango).
	 * 
	 */
	
	public static void main(String[] args) {
		
		FabricaBolo fabricaBoloNormal = new FabricaBoloNormal(CoberturaEnum.MORANGO, MassaEnum.BAUNILHA);
		fabricaBoloNormal.prepararBolo();
		
		FabricaBolo fabricaBoloSemCobertura = new FabricaBoloSemCobertura(MassaEnum.CHOCOLATE);
		fabricaBoloSemCobertura.prepararBolo();
	}
}
