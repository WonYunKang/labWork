package task;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

import javax.swing.JFrame;




    public class GUI extends Frame
    {
    
    	public GUI() {
    	
    	 Button btn1 = new Button("달력");
    	 Button btn2 = new Button("양음력");
    	 Button btn3 = new Button("날짜계산");
    	 Button btn4 = new Button("전역일");
    	 Button btn5 = new Button("만나이");
    	
    	
    	 setLayout(new FlowLayout());
    	
    		
    		//프레임에 컴포넌트 추가
    		add(btn1);
    		add(btn2);
    		add(btn3);
    		add(btn4);
    		add(btn5);
    		
    		setBounds(300,300,300,300);
    	
    		
    		//프레임 크기 지정
    		setSize(600, 400);
    		
    		//프레임 보이기
    		setVisible(true);
    	}
    	
    		
    	}

	
    
    