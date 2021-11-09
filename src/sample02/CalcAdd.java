package sample02;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Component
public class CalcAdd implements Calc {
	private int x,y;
	
	
	public CalcAdd() {
		
	}
	
	public CalcAdd(@Value(50) int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	
	
	
	@Override
	public void calculate() {
		
		System.out.println(x+"+"+y+"="+(x+y));
	}

}
