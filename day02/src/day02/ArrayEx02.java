package day02;

import java.util.Iterator;

public class ArrayEx02 {

	public static void main(String[] args) {
		// 1. 2차원 배열을 만들어 두고 학번 이름 넣기
		String[][] box = new String[5][2];
		box[0][0] = "0397134";
		box[0][1] = "김효진";
		box[1][0] = "0465345";
		box[1][1] = "이종협";
		box[2][0] = "0427214";
		box[2][1] = "서상춘";
		box[3][0] = "0487342";
		box[3][1] = "배영미";
		box[4][0] = "0512478";
		box[4][1] = "김예진";
		
		// 2. 학번을 숫자로 변경하기
		int[] s1 = new int[5]; //학번을 숫자로 변경해서 담아 둘 1차원 배열
		for (int i = 0; i < s1.length; i++) {
			s1[i] = Integer.parseInt(box[i][0]);
		}
		
		// 3.학번이 누가 제일 적은 사람인지 찾기.
		// 랭킹 구하는 알고리즘
		int[] s2 = new int[5];
		for (int i = 0; i < s1.length; i++) {
			int cnt = 0;
			for (int j = 0; j < s1.length; j++) {
				if (s1[i]>s1[j]) {
					cnt++;
				}
			}
			s2[i] = cnt;
		}
		
		for(int ss2: s2) {
			System.out.println(ss2 + " "); // s2로출력시 주소값이 나온다.
		}
		
		// 4. 랭킹 배열에 있는 값을 이용해서 so[][] 배열안에 넣기
		String[][] so = new String[5][2];
		for (int i = 0; i < s1.length; i++) {
			so[s2[i]][0] = String.valueOf(s1[i]);
			so[s2[i]][1] = box[i][1];
		}
		System.out.println();
		for (int i = 0; i < so.length; i++) {
			System.out.println(so[i][0] + " " + so[i][0]);
		}
	}

}
