package sample05;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import lombok.Setter;

@Component
public class SungJukDelete implements SungJuk {
	@Autowired
	@Qualifier("arrayList")
	private List<SungJukDTO2> list;
	
	@Override
	public void execute() {
		Scanner scan = new Scanner(System.in);
		System.out.print("삭제 할 이름 입력 : ");
		String name = scan.next();
		int sw= 0;
		Iterator<SungJukDTO2> it = list.iterator();
		while(it.hasNext()) { //항목이 있으면 true 
			if(it.next().getName().equals(name)) { //it.next()현재위치에서 항목을 꺼내서 저장후 다음 항목으로 이동
				it.remove();
				System.out.println(name+"님의 데이터는 이제 없어졌습니다/");
				sw++;
			}//if
		}//while
		
		if(sw==0)System.out.println("찾고자하는 이름이 없습니다.");
		
		
	}

}
