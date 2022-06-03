package maven.ex2;

public class X {
	private int codigo;
	
	public X() {
		this.codigo = -1;
	}
	
	public X(int codigo) {
		this.codigo = codigo;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}	
}