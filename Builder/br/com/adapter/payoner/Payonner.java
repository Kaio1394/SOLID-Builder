package br.com.adapter.payoner;

import br.com.adapter.utils.Token;

public class Payonner implements IPayonnerPayments{

	@Override
	public Token authToken() {
		// TODO Auto-generated method stub
		return new Token();
	}

	@Override
	public void sendPayment() {
		// TODO Auto-generated method stub
		System.out.println("Enviando pagamento via payonner");
	}

	@Override
	public void recievePayment() {
		// TODO Auto-generated method stub
		System.out.println("Recebendo pagamento via payonner");
	}

}
