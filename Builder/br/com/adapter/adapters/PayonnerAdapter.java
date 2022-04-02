package br.com.adapter.adapters;

import br.com.adapter.payoner.Payonner;
import br.com.adapter.paypal.IPayPalPayments;
import br.com.adapter.utils.Token;

public class PayonnerAdapter implements IPayPalPayments{
	private Token token;
	private Payonner payonner;
	
	public PayonnerAdapter(Payonner payonner) {
		// TODO Auto-generated constructor stub
		this.payonner = payonner;
		System.out.println("Adaptando o pyonner");
	}
	
	@Override
	public Token authToken() {
		// TODO Auto-generated method stub
		return new Token();
	}

	@Override
	public void paypalPayment() {
		// TODO Auto-generated method stub
		this.payonner.sendPayment();
	}

	@Override
	public void paypalRecieve() {
		// TODO Auto-generated method stub
		this.payonner.recievePayment();
	}

}
