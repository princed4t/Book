package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class Controlller {

	@Value("${server.port}")
	String serverport;
	@Value("${jlc.search.message}")
	String jlcsearchmsg;
	Logger log = LoggerFactory.getLogger(Controlller.class);

	@GetMapping("/book")
	public Booke rbook() {
		log.info("itstarrt");

		Booke b = new Booke(1, "shefali", "sanjana");
		b.setServerport(serverport);
		b.setJlcmessage(jlcsearchmsg);
		log.info("itend");
		
		System.out.println(serverport);
		return b;

	}

}
