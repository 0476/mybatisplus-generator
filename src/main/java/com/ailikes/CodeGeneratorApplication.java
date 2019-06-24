package com.ailikes;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.net.InetAddress;
import java.net.UnknownHostException;

@Controller
@EnableWebMvc
@ServletComponentScan
@SpringBootApplication
@Slf4j
public class CodeGeneratorApplication {


	private static Integer serverPort;

	public static void main(String[] args) throws UnknownHostException {
		SpringApplication.run(CodeGeneratorApplication.class, args);
		log.info("\n======================================================\n\t"+
					"Application is running !!! \n"+
					"Auth: ailikes\n"+
					"Access URLs:\t http://{}:{}\n"+
					"======================================================",
				InetAddress.getLocalHost().getHostAddress(),serverPort
		);
	}


	@RequestMapping("/")
	public String home(){
		return "redirect:/index";
	}

	public static Integer getServerPort() {
		return serverPort;
	}

	@Value("${server.port}")
	public void setServerPort(Integer serverPort) {
		CodeGeneratorApplication.serverPort = serverPort;
	}
}
