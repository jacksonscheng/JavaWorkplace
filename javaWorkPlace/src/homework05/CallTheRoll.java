package homework05;
import org.apache.commons.lang3.ArrayUtils;
import java.util.Scanner;


//public class CallTheRoll {
//
//	public static void main(String[] args) {
////		Scanner input = new Scanner(System.in);
////		System.out.println("������ѧ���ĸ����� ");
//		int studentNum = 5;
//		String [] studentName= {"ëԶ��","����","��ѫ��","������","����","Ԭ����","����Ȼ","���꽭",
//				"������","�˱�","������","�̽���","������","¬Ҧ","�ź��","����","ϰ��˶","Ҷ����","������",
//				"�ź���","��ȫ��","��÷","ʩ��","��˼��","�޽�","�ܺ�","�����","��˼˼","������","������",
//				"����ѩ","�쾩��","̷С÷","����","�ľ���","����ͤ","����ɼ","�μ���","��ʫ��","Ϳ��"};
//		int[] studentIndex = new int[studentNum];
//	
//		for(int i=0; i<studentNum;i++) {
//			
//			int student = (int) (Math.random()*studentName.length); //ע����������ȼ�intΪ�����ȼ�
//			
//			if( ArrayUtils.contains(studentIndex, student)){
//				i-=1;
//			} else {
//				studentIndex[i] = student;
//				System.out.println(studentName[student]);
//			}
//		}	
//	}	
//}

import java.util.Arrays;
public class CallTheRoll {
	public static void main(String[] args) {
		System.out.println("=========��ʼ�����ȡ=========-");
		Scanner input = new Scanner(System.in);
		System.out.print("�������ȡѧ�������������� ");
		int studentNum = input.nextInt();
		System.out.println("��ȡ�Ľ�����£�");
		String [] studentName= {"ëԶ��","����","��ѫ��","������","����","Ԭ����","����Ȼ","���꽭",
				"������","�˱�","������","�̽���","������","¬Ҧ","�ź��","����","ϰ��˶","Ҷ����","������",
				"�ź���","��ȫ��","��÷","ʩ��","��˼��","�޽�","�ܺ�","�����","��˼˼","������","������",
				"����ѩ","�쾩��","̷С÷","����","�ľ���","����ͤ","����ɼ","�μ���","��ʫ��","Ϳ��"};
		
		int[] indexArray = new int[studentNum];
		Arrays.fill(indexArray, studentName.length+1);
		
		for(int i=0; i<studentNum;i++) {
			int student = (int) (Math.random()*studentName.length);
			for(int j=0; j<indexArray.length; j++) {
				if(indexArray[j]==student) {
					i -=1;
					break;
				}
				if(j==indexArray.length-1) {
					indexArray[i] = student;
					System.out.print(studentName[student]+" ");
				}	
			}
		}	
		input.close();
	}
}

