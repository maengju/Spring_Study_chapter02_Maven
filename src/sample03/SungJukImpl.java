package sample03;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;

@Component //class위에 컴포넌트를 지정하게 되면 이클래스를 스프링에 bean으로 생성하라는 뜻
public class SungJukImpl implements SungJuk {
	@Autowired //값이 있는 생성자를 만들고 싶으면 autowired를 걸어주어야한다.
	private SungJukDTO sungJukDTO;
	Scanner scan = new Scanner(System.in);


	@Override
	public void calcTot() {
		sungJukDTO.setTot(sungJukDTO.getKor()+sungJukDTO.getEng()+sungJukDTO.getMath());
	}

	@Override
	public void calcAvg() {
		sungJukDTO.setAvg(sungJukDTO.getTot()/3.0);
		

	}

	@Override
	public void display() {
		System.out.println("이름\t\t국어\t\t영어\t\t수학\t\t총점\t\t평균\t\t");
		System.out.println(sungJukDTO);

	}

	@Override
	public void modify() {
		
		
		System.out.print("이름 입력 : ");
		sungJukDTO.setName(scan.next());
		System.out.print("국어 점수 입력 : ");
		sungJukDTO.setKor(scan.nextInt());
		System.out.print("영어 점수 입력 : ");
		sungJukDTO.setEng(scan.nextInt());
		System.out.print("수학 점수 입력 : ");
		sungJukDTO.setMath(scan.nextInt());
		calcTot();
		calcAvg();
		display();
	}

}
