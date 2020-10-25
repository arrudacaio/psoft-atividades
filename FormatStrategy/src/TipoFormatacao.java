
public enum TipoFormatacao {
	
	MAIUSCULO {
		public Formatacao getFormatacao() {
			return new Maiusculo();
		}
	},
	
	MINUSCULO {
		public Formatacao getFormatacao() {
			return new Minusculo();
		}
	},
	
	NEGRITO {
		public Formatacao getFormatacao() {
			return new Negrito();
		}
	},
	
	ITALICO {
		public Formatacao getFormatacao() {
			return new Italico();
		}
	};
	
	public abstract Formatacao getFormatacao();

}
