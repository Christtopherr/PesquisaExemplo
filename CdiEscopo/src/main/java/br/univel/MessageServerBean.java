package br.univel;

import javax.enterprise.context.Dependent;
import javax.inject.Named;

@Dependent
@Named
public class MessageServerBean {

	public String getMessage() {
		return "Ola!";
	}
}