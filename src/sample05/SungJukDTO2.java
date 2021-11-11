package sample05;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
//@Component
//@Scope("prototype")
public class SungJukDTO2 {
	private String name;
	private int kor,eng,math,tot;
	private double avg;
	
	@Override
	public String toString() {
		
		return name+"\t\t"+kor+"\t\t"+eng+"\t\t"+math+"\t\t"+tot+"\t\t"+String.format("%.2f", avg);
	}
}
