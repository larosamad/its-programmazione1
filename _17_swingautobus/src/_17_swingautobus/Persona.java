package _17_swingautobus;

public class Persona {
		private String nome;
		private String cognome;
		private String CF;
		
		public Persona(String nome, String cognome, String CF) {
			this.nome = nome;
			this.cognome = cognome;
			this.CF = CF;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getCognome() {
			return cognome;
		}

		public void setCognome(String cognome) {
			this.cognome = cognome;
		}

		public String getCF() {
			return CF;
		}

		public void setCF(String CF) {
			this.CF = CF;
		}

		@Override
		public String toString() {
			return "Persona [nome=" + nome + ", cognome=" + cognome + ", CF=" + CF + "]";
		}
		
	}