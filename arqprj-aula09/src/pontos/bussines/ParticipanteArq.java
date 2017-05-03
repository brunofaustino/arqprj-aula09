package pontos.bussines;

import java.io.BufferedReader;
import java.io.FileReader;

import pontos.interfaces.IPontoBussines;
import pontos.interfaces.Participante;

public class ParticipanteArq implements IPontoBussines{

	private String nomeArquivo ;
	private static final String SEPARADOR = ":";
	
	public ParticipanteArq(String nomeArquivo){
		this.nomeArquivo = nomeArquivo;
	}


	public Participante find(int identificador) {
		Participante p = null;
		try(FileReader fr = new FileReader(nomeArquivo)) {
			BufferedReader br = new BufferedReader(fr);
			String linha;
			while((linha = br.readLine()) != null){
				String[] info  = linha.split(SEPARADOR);
				int id = Integer.parseInt(info[0]);
				String senha = info[1];
				int pontos = Integer.parseInt(info[2]);
				if (id == identificador) {
					p = new Participante(id, senha, pontos); 
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return p;
	}
	
}
