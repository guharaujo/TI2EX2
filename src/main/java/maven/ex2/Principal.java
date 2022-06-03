package maven.ex2;

public class Principal {
	
	public static void main(String[] args) {
		
		DAO dao = new DAO();
		
		dao.conectar();

		X[] xs;
		
		//Inserir um elemento na tabela
		X u = new X(11);
		if(dao.inserirUsuario(u) == true) {
			System.out.println("Inserção com sucesso -> " + u.toString());
		}
		
		//Excluir usuário
		dao.excluirUsuario(u.getCodigo());
		
		//Mostrar usuários
		xs = dao.getUsuarios();
		System.out.println("==== Mostrar usuários === ");		
		for(int i = 0; i < xs.length; i++) {
			System.out.println(xs[i].toString());
		}
		
		dao.close();
	}
}