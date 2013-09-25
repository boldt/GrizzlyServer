package de.dennis_boldt;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.core.UriBuilder;

import com.sun.jersey.api.container.grizzly2.GrizzlyServerFactory;
import com.sun.jersey.api.core.PackagesResourceConfig;
import com.sun.jersey.api.core.ResourceConfig;

public class Server {

	private String hostname = "localhost";
	private Integer port = 0;

	public Server(int port) {
		this.port = port;
		try {
			GrizzlyServerFactory.createHttpServer(getBaseURI(),
					getResourceConfig(getBaseURI().toString()));
			System.in.read();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		int port;
		if (args.length > 0) {
			port = Integer.parseInt(args[0]);
		} else {
			port = 11111;
		}
		new Server(port);
	}

	public URI getBaseURI() {
		return UriBuilder.fromUri("http://" + hostname).port(this.port).build();
	}

	public static ResourceConfig getResourceConfig(String baseurl) {
		final Map<String, Object> init_params = new HashMap<String, Object>();
		init_params.put(PackagesResourceConfig.PROPERTY_PACKAGES, "de.dennis_boldt.resources");
		return new PackagesResourceConfig(init_params);
	}

}
