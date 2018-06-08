package classe;

import java.util.Scanner;

import database.Database;

public class User {
	
	private String login;
	private String password;
	private int tipo;
	private String nome;
	private String email;
	private String cpf_cnpj;
	private int estado;
	private int cidade;
	private String rua;
	private int numero;
	private String complemento;
	private String bairro;
	public int qtdC=0;
	public int qtdS=0;
	
	User[] cliente =new Client[100]; 
	User[] servico =new Server[100]; 
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCpf_cnpj() {
		return cpf_cnpj;
	}
	public void setCpf_cnpj(String cpf_cnpj) {
		this.cpf_cnpj = cpf_cnpj;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	public int getCidade() {
		return cidade;
	}
	public void setCidade(int cidade) {
		this.cidade = cidade;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}



	
	
	public void fazerLogin(Database dt) {
		
		this.verificarLogin(dt);
		this.verificarLogin(dt);
		System.out.println("Login Feito com sucesso");
		
	}
	
	public void verificarLogin(Database dt) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Login:");
		this.setLogin(input.nextLine());
		do {
			System.out.println("Login inválido");
			this.setLogin(input.nextLine());
			
		}while(dt.getLoginDB() == this.getLogin());
		
	}
	public void verificarPassword(Database dt) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Password:");
		this.setPassword(input.nextLine());
		
		do {
			System.out.println("Password inválida");
			this.setPassword(input.nextLine());
		}while(dt.getPasswordDB() == this.getPassword());
			
		
		
	}
	
	public void cadastrarUsuario() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Tipo:");  //serviço ou cliente
		this.setTipo(input.nextInt());
		
		if(this.getTipo()==1) {
			User cliente = new Client();
			this.cliente[qtdC]=cliente;  
			this.qtdC++;
		}else if(this.getTipo()==2) {
			User servico = new Server();
			this.servico[qtdS]=servico;  
			this.qtdS++;
		}
		
		//verificar uma entrada para cada tipo
		
		System.out.println("Senha:");
		//cliente.setPassword(input.nextLine());
		
		System.out.println("Email:");
		this.setEmail(input.nextLine());
		
		if(this.getTipo()==1) {
			System.out.println("Nome:");
			this.setTipo(input.nextInt());
		}else if(this.getTipo()==2) {
			System.out.println("Nome da Sua marca:");
			this.setTipo(input.nextInt());
		}
		
		if(this.getTipo()==1) {
			System.out.println("Cpf");
			this.setCpf_cnpj(input.nextLine());
		}else if(this.getTipo()==2) {
			System.out.println("Cnpj");
			this.setCpf_cnpj(input.nextLine());
		}
		
		System.out.println("Endereço"+"\n");
		System.out.println("Estado");
		this.setEstado(input.nextInt());
		System.out.println("Cidade");
		this.setCidade(input.nextInt());
		System.out.println("Rua");
		this.setRua(input.nextLine());
		System.out.println("Numero");
		this.setNumero(input.nextInt());
		System.out.println("Complemento");
		this.setComplemento(input.nextLine());
		System.out.println("Bairro");
		this.setBairro(input.nextLine());
		

		
		//criar as query's de insert in to com SQL para inserir no DB
	}
	
	public void vizualizarServicos() {
		
	}
	
	public void vizualizarPedidos() {
		
	}
	
	public void vizualizarPerfil() {
	
	}
	

	public void inserirCardapio() {
		
	}


	
}
