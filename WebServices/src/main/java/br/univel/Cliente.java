package br.univel;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class Cliente {

	public static void main(String[] args) {

		try {
			URL url = new URL("http://127.0.0.1:9090/ola?wsdl");
			QName qname = new QName("http://ola/", "OlaMundoServerImpl");
			Service sv = Service.create(url, qname);
			Server ola = sv.getPort(Server.class);

			System.out.println(ola.saudar("Jardel Kuhnen"));

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
