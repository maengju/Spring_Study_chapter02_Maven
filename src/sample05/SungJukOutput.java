package sample05;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import lombok.Setter;
//@Component
public class SungJukOutput implements SungJuk {
	@Autowired
	@Qualifier("arrayList")
	private List<SungJukDTO2> list;
	
	
	@Override
	public void execute() {
		
		System.out.println("이름\t\t국어\t\t영어\t\t수학\t\t총점\t\t평균\t\t");
		
		for(SungJukDTO2 sungJukDTO2: list) {
			System.out.println(sungJukDTO2);
			
		}
	
	}
	

}
