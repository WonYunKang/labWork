package task;

import java.util.Scanner;

import javax.swing.JFrame;

public class DateList {

	public static void main(String[] args) {
		GUI sc = new GUI();

		java.util.Calendar cal = java.util.Calendar.getInstance();
		long nowday = cal.getTimeInMillis();
		int year;
		int T;
		int month;
		int Chose;
		int number;
		// ������ ����

		Scanner sc1 = new Scanner(System.in);

		System.out.println("------------------------------------------------------------------------");
		System.out.println("          1.�޷�    2.�����º�ȯ    3.��¥���    4.�����ϰ��    5.�����̰��");
		System.out.println("------------------------------------------------------------------------");
		number = sc1.nextInt();
		System.out.println("�⵵�� �Է��غ����� :");
		year = sc1.nextInt();
		System.out.println("���� �Է��غ�����");
		month = sc1.nextInt();

		switch (number) {
		case 1: {
			System.out.println("====================[" + year + "��" + month + "��]=====================");
			try {
				CalendarPrint Wal = new CalendarPrint(year, month);
				Wal.printCal();
				System.out.println();
				System.out.println("===================================================");
			} catch (Exception e) {
				e.printStackTrace();
			}

			break;
		}
		case 2: {
			System.out.println("====================[" + year + "��" + month + "��]=====================");
			try {
				CalendarPrint Wal = new CalendarPrint(year, month);
				Wal.printCal();
				System.out.println();
				System.out.println("===================================================");
			} catch (Exception e) {
				e.printStackTrace();
			}

			System.out.println("������ ��¥ ����");
			System.out.println("��� ��¥ ");
			System.out.println("���� ��¥ ");
			System.out.println("���� ����");

			break;
		}
		case 3: {
			System.out.println("====================[" + year + "��" + month + "��]=====================");
			try {
				CalendarPrint Wal = new CalendarPrint(year, month);
				Wal.printCal();
				System.out.println();
				System.out.println("===================================================");
			} catch (Exception e) {
				e.printStackTrace();
			}

			System.out.println("���ϰ����ϴ� ���� �Է����ּ���");
			int user_year = sc1.nextInt();
			System.out.println("���ϰ����ϴ� ���� �Է����ּ���");
			int user_month = sc1.nextInt();
			System.out.println("���ϰ����ϴ� ���� �Է����ּ���");
			int user_day = sc1.nextInt();

			try {
				D_Day d = new D_Day();
				int q = d.getDDay(user_year, user_month, user_day);
				System.out.println("�ϼ��� : " + q + " �� ���̳��ϴ�");

			} catch (Exception e) {
				System.out.println("ERROR");
			}

			break;
		}
		case 4: {
			System.out.println("====================[" + year + "��" + month + "��]=====================");
			try {
				CalendarPrint Wal = new CalendarPrint(year, month);
				Wal.printCal();
				System.out.println();
				System.out.println("===================================================");
			} catch (Exception e) {
				e.printStackTrace();
			}

			System.out.println("�����ϴ� �⵵�� �Է����ּ���");
			int user_year = sc1.nextInt();
			System.out.println("�����ϴ� ���� �Է����ּ���");
			int user_month = sc1.nextInt();
			System.out.println("�����ϴ´� ���� �Է����ּ���");
			int user_day = sc1.nextInt();

			try {
				Mar d = new Mar();
				int q = d.getDDay(user_year, user_month, user_day);
				System.out.println("�������� : " + q + " �� ���ҽ��ϴ�");

			} catch (Exception e) {
				System.out.println("ERROR");
			}

			break;
		}
		case 5: {
			System.out.println("====================[" + year + "��" + month + "��]=====================");
			try {
				CalendarPrint Wal = new CalendarPrint(year, month);
				Wal.printCal();
				System.out.println();
				System.out.println("===================================================");
			} catch (Exception e) {
				e.printStackTrace();
			}

			System.out.println("�¾ �⵵�� �Է����ּ���");
			int user_year = sc1.nextInt();
			System.out.println("�¾ ���� �Է����ּ���");
			int user_month = sc1.nextInt();
			System.out.println("�¾ ���� �Է����ּ���");
			int user_day = sc1.nextInt();

			try {
				Age d = new Age();
				int q = d.getAge(user_year, user_month, user_day);
				if (q > 12) {
					T = q - 12;
					switch (T) {
					case 1: {
						System.out.println("");
						break;
					}
					}
					System.out.println("���̴� : " + q + " �� �Դϴ�");
				}

			} catch (Exception e) {
				System.out.println("ERROR");
			}

			break;
		}

		}

		
	}

}