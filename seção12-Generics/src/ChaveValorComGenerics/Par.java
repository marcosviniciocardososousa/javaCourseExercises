package ChaveValorComGenerics;

	public class Par<C,V> {
	
		private C chave;
		private V valor;
		
		public Par(C chave, V valor) {
			super();
			this.chave = chave;
			this.valor = valor;
		}
		
		public C getChave() {
			return chave;
		}
		public void setChave(C chave) {
			this.chave = chave;
		}
		public V getValor() {
			return valor;
		}
		public void setValor(V valor) {
			this.valor = valor;
		}
	
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((chave == null) ? 0 : chave.hashCode());
			result = prime * result + ((valor == null) ? 0 : valor.hashCode());
			return result;
		}
	
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Par<?,?> other = (Par<?,?>) obj;
			if (chave == null) {
				if (other.chave != null)
					return false;
			} else if (!chave.equals(other.chave))
				return false;
			if (valor == null) {
				if (other.valor != null)
					return false;
			} else if (!valor.equals(other.valor))
				return false;
			return true;
		}
		
		
		
		
	}
