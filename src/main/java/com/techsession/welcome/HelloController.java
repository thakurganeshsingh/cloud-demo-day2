package com.techsession.welcome;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/")
	public String welcome() {
		return "Hello there!!, Welcome to AWS Fundamentals Day 2 Session";
	}

	@GetMapping("/details")
	public ServerDetails details()
	{
		ServerDetails serverDetails = new ServerDetails();
		try {
			serverDetails.setLoopbackHostAddress(InetAddress.getLoopbackAddress().getHostAddress());
			serverDetails.setLoopbackHostName(InetAddress.getLoopbackAddress().getHostName());
			serverDetails.setCanonicalHostName(InetAddress.getLocalHost().getCanonicalHostName());
			serverDetails.setHostName(InetAddress.getLocalHost().getHostName());
			InetAddress.getLoopbackAddress().getHostName();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		return serverDetails ;
	}
}
