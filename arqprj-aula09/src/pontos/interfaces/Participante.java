package pontos.interfaces;

public class Participante {

		private int identificador;
		private String senha;
		private int pontos;
		
		public Participante(){}

		public Participante(int identificador, String senha, int pontos) {
			super();
			this.identificador = identificador;
			this.senha = senha;
			this.pontos = pontos;
		}

		public int getIdentificador() {
			return identificador;
		}

		public void setIdentificador(int identificador) {
			this.identificador = identificador;
		}

		public String getSenha() {
			return senha;
		}

		public void setSenha(String senha) {
			this.senha = senha;
		}

		public int getPont() {
			return pontos;
		}

		public void setPont(int pontos) {
			this.pontos = pontos;
		}

		public int getPontos() {
			return pontos;
		}

		public void setPontos(int pontos) {
			this.pontos = pontos;
		}
	
		
		
}
