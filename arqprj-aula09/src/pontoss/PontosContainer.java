package pontoss;

import pontos.bussines.ParticipanteArq;
import pontos.desktop.PontosDektop;
import pontos.interfaces.IPontoBussines;
import pontos.interfaces.IPontoProcess;
import pontos.process.PontosProcessFacade;

public class PontosContainer {
	public static void main(String[] args) {
		IPontoBussines negocios  = new ParticipanteArq("pontos.txt");
		IPontoProcess processo = new PontosProcessFacade(negocios);
		PontosDektop desktop  = new PontosDektop(processo);
		desktop.consultaPontos();
	}
}
