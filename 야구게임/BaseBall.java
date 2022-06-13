package 수업자바;

import java.util.*;
import java.io.*;
public class BaseBall {
	public static int playGame() throws IOException { //컴퓨터가 3개의 난수를 발생시키는 메소드
		int x, y, z; // 컴퓨터가 선택하는 3개 숫자
		Random r= new Random(); //난수발생 Random()메소드로 객체변수 r 생성
		
		x= Math.abs(r.nextInt() % 9) + 1; //1 ~ 9 사이의 난수 발생
		
		do{
			y= Math.abs(r.nextInt() % 9) + 1; 
		}while(y==x); //  만일 난수 y가 x와 같은 수일 때 다시한 번 난수 발생 반복
		
		do{
			z= Math.abs(r.nextInt() % 9) + 1; 
		}while((z==x)||(z==y)); // 만일 난수 y가 x 혹은 y와 같은 수일 때 다시 한 번 난수 발생 반복
		

		System.out.println(x +", "+ y +", "+ z); //컴퓨터가 발생시킨 난수 확인(게임 시 비공개)
		
		return playGame(x, y, z);
	}
	
	public static int playGame(int x, int y, int z) throws IOException
														// 인수 3개가 주어지는 메소드
	{
		int count; //게임을 시도하는 횟수
		int strike, ball; // 숫자 매칭에 따른 결과 
		
		int[] usr = new int[3];
		int[] com = { x, y, z }; // 컴퓨터가 선택한 숫자 3개를 지정하는 배열
		System.out.println("숫자 야구 게임");
		count= 0;
		do{
			count++;
			do{
				System.out.println("\n카운트: "+count);
				BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
				String user;
				System.out.print("1번째 숫자: ");
					user= in.readLine();
					usr[0]= new Integer(user).intValue();


					System.out.print("2번째 숫자: ");
					user= in.readLine();
					usr[1]= new Integer(user).intValue();
					System.out.print("3번째 숫자: ");
					user= in.readLine();
					usr[2]= new Integer(user).intValue();
					if((usr[0]==0)||(usr[1]==0)||(usr[2]==0)){
						System.out.println("0은 입력하지 마세요. 다시 입력해주세요.");
					}else if((usr[0]>9)||(usr[1]>9)||(usr[2]>9)){
						System.out.println("1부터 9까지의 숫자 중 하나를 입력해주세요. 다시 입력해주세요.");
					}else if((usr[0]==usr[1])||(usr[1]==usr[2])||(usr[0]==usr[2])){
						System.out.println("모두 다른 숫자를 입력해주세요. 다시 입력해주세요.");
					}
			}while((usr[0]==0)||(usr[1]==0)||(usr[2]==0)|| 
					(usr[0]>9)||(usr[1]>9)||(usr[2]>9)||
					(usr[0]==usr[1])||(usr[1]==usr[2])||(usr[0]==usr[2])); //범위에 맞는 수 입력받기
			
			strike = ball = 0;
			
			if(usr[0]==com[0]) strike++; //스트라이크 카운트
			if(usr[1]==com[1]) strike++;
			if(usr[2]==com[2]) strike++; //usr, com 두 개의 배열의 데이터 위치가 다른 경우에만 strike 처리
			
			if(usr[0]==com[1]) ball++;//볼카운트
			if(usr[0]==com[2]) ball++;
			if(usr[1]==com[0]) ball++;
			if(usr[1]==com[2]) ball++;
			if(usr[2]==com[0]) ball++;
			if(usr[2]==com[1]) ball++;//usr, com 두 개의 배열의 데이터 위치가 다른 경우에만 ball 처리
			
			System.out.println("Strike: "+ strike +" Ball: "+ ball);
			
		}while((strike<3)&&(count<11)); //strike<3 (게임미완성), count<11(시도횟수 10번까지)일 때 반복실행
										//strike=<3, count=11(시도횟수 11번째)가 되면 종료
		
		return count;
	}
	public static void main(String[] args) throws IOException
	{
		int result; //결과값을 위한 변수 생성
		
		if(args.length==3){ // 게임실행 시 입 인수가  3개인 경우, 각각 정수형으로 변환을 통해 x,y,z 이 저장
			int x= Integer.valueOf(args[0]).intValue();
			int y= Integer.valueOf(args[1]).intValue();
			int z= Integer.valueOf(args[2]).intValue();
			// 난수발생시키는 경우 즉 . playGame()는 해당없음.
	result= playGame(x, y, z);
		}else{		//난수발생시키는 경우 즉, playGame()에 해당
			result= playGame(); // return 값 즉, 시도횟수(count)을 결과값으로 변환하여 result이 저장
		}
			System.out.println();
			if(result<=2){
				System.out.println("참 잘했어요!"); // 시도횟수가 2번 이하
			}else if(result<=5){
				System.out.println("잘했어요!"); // 시도횟수가 3번부터 5번 이하
			}else if(result<=9){
				System.out.println("보통이네요!");// 시도횟수가 6번~9번 
			}else{
				System.out.println("분발하세요!"); // 시도횟수가 10번 
			}
}

}