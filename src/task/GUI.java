package task;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

import javax.swing.JFrame;




    public class GUI extends Frame
    {
    
    	public GUI() {
    	
    	 Button btn1 = new Button("�޷�");
    	 Button btn2 = new Button("������");
    	 Button btn3 = new Button("��¥���");
    	 Button btn4 = new Button("������");
    	 Button btn5 = new Button("������");
    	
    	
    	 setLayout(new FlowLayout());
    	
    		
    		//�����ӿ� ������Ʈ �߰�
    		add(btn1);
    		add(btn2);
    		add(btn3);
    		add(btn4);
    		add(btn5);
    		
    		setBounds(300,300,300,300);
    	
    		
    		//������ ũ�� ����
    		setSize(600, 400);
    		
    		//������ ���̱�
    		setVisible(true);
    	}
    	
    		
    	}

	
    
    