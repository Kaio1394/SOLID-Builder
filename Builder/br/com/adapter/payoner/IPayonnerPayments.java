package br.com.adapter.payoner;

import br.com.adapter.utils.Token;

public interface IPayonnerPayments {
	Token authToken();
	void sendPayment();
	void recievePayment();
}
