package study00;
import java.util.*;

public class project {
	public static void main(String[] args)
	{
		int year, month, day;
		Scanner sc = new Scanner(System.in);
		System.out.println("연도를 입력 : ");
		year = sc.nextInt();
		System.out.println("월를 입력 : ");
		month = sc.nextInt();
		System.out.println("일를 입력 : ");
		day = sc.nextInt();
		
		date(year,month,day);
	}


public static void date(int year, int month, int day){
	char today = calc(year,month,day);
	System.out.println(year + "년 " + month + "월 " + day + "일은 " + today + "요일입니다."); 	
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
		today ='토';
		break;
	case 1:
		today ='일';
		break;
	case 2:
		today ='월';
		break;
	case 3:
		today ='화';
		break;
	case 4:
		today ='수';
		break;
	case 5:
		today ='목';
		break;
	case 6:
		today ='금';
		break;
	}
	return today;
}

}