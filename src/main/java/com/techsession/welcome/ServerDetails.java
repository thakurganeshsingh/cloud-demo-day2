package com.techsession.welcome;

import lombok.Data;

@Data
public class ServerDetails {

	private String loopbackHostAddress;
	private String loopbackHostName;
	private String canonicalHostName;
	private String hostName;
}
