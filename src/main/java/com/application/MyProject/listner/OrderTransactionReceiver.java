/**
 * 
 */
package com.application.MyProject.listner;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * @author vikas
 *
 */
@Component
public class OrderTransactionReceiver {

	@JmsListener(destination="OrderTransactionQueue", containerFactory="myFactory")
	public void receiveMessage(String message) {
		System.out.println("Received message: "+message);
	}
	
}
