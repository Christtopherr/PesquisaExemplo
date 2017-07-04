package br.univel;

import javax.jws.WebService;

@WebService(endpointInterface = "ola.OlaMundoServer")
public class Implementacao implements Server{

	@Override
	public String saudar(String pessoa) {
		
		return "Olá caro amigo " + pessoa;
	}

}
