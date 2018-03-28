package br.com.caelum.livraria.webservice;

import java.rmi.RemoteException;

public class TestRequestSoapComJava {

	public static void main(String[] args) throws RemoteException {
		// TODO Auto-generated method stub
		
		LivrariaWS cliente = new LivrariaWSProxy();
		
		Livro livro = cliente.getLivrosPeloNome("arquitetura");
		System.out.println(livro.getTitulo());
	    System.out.println(livro.getAutor().getNome());

	}

}
