package br.com.adapter.paypal;

import br.com.adapter.utils.Token;

public class PayPal implements  IPayPalPayments{

	private Token token;
	
	@Override
	public Token authToken() {
		// TODO Auto-generated method stub
		return new Token();
	}

	@Override
	public void paypalPayment() {
		// TODO Auto-generated method stub
		this.token = authToken();
		System.out.println("Enviando pagamentos via paypal");
	}

	@Override
	public void paypalRecieve() {
		// TODO Auto-generated method stub
		System.out.println("Recebendo pagamentos via paypal");
	}

}
