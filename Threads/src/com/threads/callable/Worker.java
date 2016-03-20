package com.threads.callable;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Worker extends Thread {

	private static Queue<Order> sharedQueue = new ConcurrentLinkedQueue<Order>();
	public static void main(String[] args) {
		Worker worker = new Worker();
		worker.start();
		Test test = new Test(sharedQueue);
		test.start();
	}
	
	//Overriding run method
	public void run(){
		int i=0;
		while(i<10) {
			if(sharedQueue.size() <6){
				Order order = new Order();
				order.setOrderState(OrderState.NEW);
				order.setOrderNumber(i);
				sharedQueue.add(order);
				i++;
			} else{
				synchronized(sharedQueue) {
					try {
						sharedQueue.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}
	
	
}

class Test extends Thread{
	Queue<Order> sharedQueue = null;
	public Test(Queue<Order> sharedQueue){
		this.sharedQueue =  sharedQueue;
	}
	public void run() {
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		for(int i=0; i < 10; i++) {
			Future<Order> orders = (Future<Order>)executorService.submit(new PlaceOrderCallable<Order>(sharedQueue));
			
			try {
				Order order = orders.get();
				if(null != order){
					order.setOrderState(OrderState.FULFILLED);
					System.out.println("Order FULFILLED ..."+order.getOrderNumber());
					sharedQueue.remove(order);
				}
			} catch (InterruptedException | ExecutionException e) {
				e.printStackTrace();
			}
			if(sharedQueue.size() < 5) {
				synchronized(sharedQueue){
					sharedQueue.notify();
				}
			}
			if(sharedQueue.size() == 0){
				executorService.shutdown();
				System.exit(1);
			}
		}
	}
}
