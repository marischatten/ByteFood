package control;
import classe.Client;
import classe.Pedido;
import classe.Server;
import classe.User;
import  database.Conexao;
import database.Database;

public class ByteFood {

	public static void main(String[] args) {
		
		Conexao con = new Conexao();
		Database dt= new Database();
		User user= new User();
		Pedido pedidos=new Pedido();
		User cliente = new Client();
		User servico = new Server();

		con.getConnection();
		
		user.cadastrarUsuario();
		user.fazerLogin(dt);
		
		
		//opções
		user.vizualizarServicos();
		//pedidos.fazerPedido() ;//passar parametro
		cliente.vizualizarPedidos();
		servico.vizualizarPedidos();
		servico.inserirCardapio();
		
		
		//conectar no banco
		//cadastrar usuario
		//fazer login
		//ver serviços 
		//fazer pedido
		//vizualizar meus pedidos cliente
		//vizualizar meus pedidos serviço
		//vizualizar meu perfil cliente/servico
		///inserir itens cardapio
		
	}

}


