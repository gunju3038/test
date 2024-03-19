package com.ezen.geonju0;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TwoConfig {
	@Bean
	public Two aa() {
		Two tt = new Two();
		tt.setA(50);
		tt.setB(11);
		return tt;
	}

}
