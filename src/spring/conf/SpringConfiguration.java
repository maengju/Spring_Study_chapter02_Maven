package spring.conf;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import sample01.MessageBeanImpl;
import sample02.CalcAdd;
import sample02.CalcMul;
import sample05.HelloSpring;
import sample05.SungJukDTO2;
import sample05.SungJukDelete;
import sample05.SungJukInput;
import sample05.SungJukModify;
import sample05.SungJukOutput;

@Configuration		//xml과 같은 환경설정 파일 역할
public class SpringConfiguration {
	//sample 01
	@Bean
	public MessageBeanImpl messageBeanImpl (){		//메소드명은 반드시 클래스의 객체명 또는 bean명을 잡아준다.
		return new MessageBeanImpl("딸기");
	}
	
	//sample02
	@Bean
	public CalcAdd calcAdd() {
		
		return new CalcAdd(29,36);
	}
	
	@Bean(name="calcMul")
	public CalcMul getCalcMul() {
		return new CalcMul();
	}
	
	//sample05
	@Bean
	public HelloSpring helloSpring() {
		return new HelloSpring();
	}
	@Bean
	@Scope("prototype")
	public SungJukInput sungJukInput() {
		return new SungJukInput();
	}
	@Bean
	public SungJukOutput sungJukOutput() {
		return new SungJukOutput();
	}
	@Bean
	public SungJukModify sungJukModify() {
		return new SungJukModify();
	}
	@Bean
	public SungJukDelete sungJukDelete() {
		return new SungJukDelete();
	}
	@Bean
	@Scope("prototype")
	public SungJukDTO2 sungJukDTO2() {
		return new SungJukDTO2();
	}
	
	@Bean
	public List<SungJukDTO2> arrayList(){
		return new ArrayList<SungJukDTO2>();
	}
	
	
	
}
