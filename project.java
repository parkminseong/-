package study00;
import java.util.*;

public class project {
	public static void main(String[] args)
	{
		int year, month, day;
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է� : ");
		year = sc.nextInt();
		System.out.println("���� �Է� : ");
		month = sc.nextInt();
		System.out.println("�ϸ� �Է� : ");
		day = sc.nextInt();
		
		date(year,month,day);
	}


public static void date(int year, int month, int day){
	char today = calc(year,month,day);
	System.out.println(year + "�� " + month + "�� " + day + "���� " + today + "�����Դϴ�."); 	
	}


public static char calc(int year, int month, int day){
	int ya = year/100;
	int yb = year%100;
	char today = 0;
	if(month == 1||month == 2)
	{
		month += 12;
		yb -= 1;
	}
	int a=(13*(month+1))/5;
	int b=yb/4;
	int c=ya/4;
	int H = (day + a + yb + b + c - (2 * ya)) % 7;
	switch(H)
	{
	case 0:
		today ='��';
		break;
	case 1:
		today ='��';
		break;
	case 2:
		today ='��';
		break;
	case 3:
		today ='ȭ';
		break;
	case 4:
		today ='��';
		break;
	case 5:
		today ='��';
		break;
	case 6:
		today ='��';
		break;
	}
	return today;
}

}