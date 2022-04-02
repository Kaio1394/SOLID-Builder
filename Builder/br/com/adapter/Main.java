package br.com.adapter;

import br.com.adapter.adapters.PayonnerAdapter;
import br.com.adapter.payoner.Payonner;
import br.com.adapter.paypal.IPayPalPayments;
import br.com.adapter.paypal.PayPal;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IPayPalPayments payment = new PayonnerAdapter(new Payonner());
		payment.paypalPayment();
		payment.paypalRecieve();
	}

}
