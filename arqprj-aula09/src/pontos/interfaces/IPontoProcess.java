package pontos.interfaces;

public interface IPontoProcess {
	Mapeamento getMapeamento();
	int getPontos(int identificador, String letras, Mapeamento mapeamento);
}
