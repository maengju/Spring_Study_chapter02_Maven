package sample02;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;


//@Component("calcAdd")
public class CalcAdd implements Calc {
	
	private int x,y;
		
	
	
	
	public CalcAdd(int x, int y) {
		
		this.x = x;
		this.y = y;
	}




	@Override
	public void calculate() {
		
		System.out.println(x+"+"+y+"="+(x+y));
	}

}
