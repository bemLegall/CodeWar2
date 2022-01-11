import java.math.BigDecimal;

public class BuyCar {

	public static int[] nbMonths(int startPriceOld, int startPriceNew, int savingperMonth, double percentLossByMonth) {

		int meses = 0;
		BigDecimal dinheiroTotal = new BigDecimal(0);
		BigDecimal carroVelho = new BigDecimal(startPriceOld);
		BigDecimal carroNovo = new BigDecimal(startPriceNew);
		BigDecimal guardado = new BigDecimal(savingperMonth);
		BigDecimal perdido = new BigDecimal(percentLossByMonth);
		BigDecimal apenas100 = new BigDecimal(100);
		BigDecimal jurosNovo = new BigDecimal(0);
		BigDecimal jurosVelho = new BigDecimal(0);
		BigDecimal apenas05 = new BigDecimal(0.5);
		BigDecimal resultadoSupremo = new BigDecimal(0);

		int tempoEDinheiro[];
		tempoEDinheiro = new int[2];
		if (carroVelho.doubleValue() >= carroNovo.doubleValue()) {
			resultadoSupremo = carroVelho.subtract(carroNovo);

			tempoEDinheiro[0] = 0;
			tempoEDinheiro[1] = resultadoSupremo.intValue();
			return tempoEDinheiro;
		}
		while (dinheiroTotal.doubleValue() <= carroNovo.doubleValue()) {
			meses++;
			if (meses % 2 == 0) {
				perdido = perdido.add(apenas05);
			}
			dinheiroTotal = dinheiroTotal.add(guardado);

			jurosVelho = (carroVelho.multiply(perdido)).divide(apenas100);
			carroVelho = carroVelho.subtract(jurosVelho);

			jurosNovo = (carroNovo.multiply(perdido)).divide(apenas100);
			carroNovo = carroNovo.subtract(jurosNovo);

			if (dinheiroTotal.doubleValue() + carroVelho.doubleValue() >= carroNovo.doubleValue()) {
				dinheiroTotal = dinheiroTotal.add(carroVelho);
				break;
			}
		}
		resultadoSupremo = resultadoSupremo.add(dinheiroTotal.subtract(carroNovo));
		tempoEDinheiro[1] = resultadoSupremo.intValue();
		tempoEDinheiro[0] = meses;
		double resto = dinheiroTotal.doubleValue() - carroNovo.doubleValue();
		double dif = resto - tempoEDinheiro[1];
		if (dif >= 0.5) {
			tempoEDinheiro[1] = tempoEDinheiro[1] + 1;
		}
		return tempoEDinheiro;
	}
}
