package cn.com.jetty.demo.server;

import org.eclipse.jetty.server.Server;

import cn.com.jetty.demo.handlers.Hello;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Server server = new Server(8080);
		server.setHandler(new Hello());
		server.start();
		server.join();
	}

}
