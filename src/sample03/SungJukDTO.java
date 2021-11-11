package sample03;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Component
public class SungJukDTO {
	String name="홍길동";
	int kor=20,eng=50,math=60,tot;
	double avg;
	
	@Override
	public String toString() {
		
		return name+"\t\t"+kor+"\t\t"+eng+"\t\t"+math+"\t\t"+tot+"\t\t"+String.format("%.2f", avg);
	}
	
}
