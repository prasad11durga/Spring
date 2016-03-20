package com.threads.callable;

import java.util.Queue;
import java.util.concurrent.Callable;

public class PlaceOrderCallable<T> implements Callable<Order> {
	Queue<Order> queue = null;
	
	PlaceOrderCallable(Queue<Order> queue ){
		this.queue = queue;
	}
	
	@Override
	public Order call() throws Exception {
		if (queue.size() > 0){
			//Process Order here
			Order order = queue.element();
			return order;
		} 
		return null;
	}

	
}
