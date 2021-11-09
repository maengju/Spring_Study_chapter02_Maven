package spring.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import sample01.MessageBeanImpl;

@Configuration		//xml과 같은 환경설정 파일 역할
public class SpringConfiguration {
	
	@Bean
	public MessageBeanImpl messageBeanImpl (){		//메소드명은 반드시 클래스의 객체명 또는 bean명을 잡아준다.
		return new MessageBeanImpl("딸기");
	}
	
	
	
}