package com.cg.demo.conc;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExPatDemo implements Runnable {

	public static void main(String[] args) {

		// 0. using Thread object
//		for (int i = 1; i <= 10; i++) {
//			Thread thread = new Thread(new App());
//			thread.start();
//		}

		ExPatDemo exp = new ExPatDemo();

		// 1. using newSingleThreadExecutor() method
		ExecutorService exService = Executors.newSingleThreadExecutor();

		for (int i = 1; i <= 10; i++) {
			exService.execute(exp);
		}

	}

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(Thread.currentThread().getName() + " - " + i);
		}
	}

}
