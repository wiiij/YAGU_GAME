# YAGU_GAME
이번엔 자바로 야구게임을 만들었습니다.<br>
야구게임의 룰은 <br>
1.1~9 사이의 중복되지 않는 3개의 정수를 생성한다. <br>
2.사용자는 3개의 숫자를 입력한다. <br>
3.생성된 3개의 숫자를 맞추는데 위치까지 정확히 맞춰야 한다. <br>
4.숫자와 숫자의 위치까지 일치하면 strike 로 판정한다. <br>
5.숫자는 맞지만 위치가 틀렸다면 ball 로 판정한다. <br>
6.숫자3개가 모두 일치하지 않으면 out 으로 판정한다. <br>
7.3 strike 가 되면 게임은 종료된다. <br>
![image](https://user-images.githubusercontent.com/102115231/173287998-51c0d42e-07db-40a7-b86a-ac2d06af14f0.png)<br>
먼저 1 에서 9 중 중복되지 않는 3개의 수를 뽑아본다. (맨 아래 출력문은 숫자 확인하기위해 쓰는거이기에 게임 실행 시 주석처리나 지우시길 바랍니다.)<br>
![image](https://user-images.githubusercontent.com/102115231/173283479-622bcc17-e5c2-4ca5-8732-f8a03c9ac59c.png)<br>
이렇게 저장을 하고 게임이 시작됩니다.<br>
![image](https://user-images.githubusercontent.com/102115231/173285081-145fb981-ebaf-49bf-b98d-24c8416a2292.png)<br>
여기서 플레이어는 3개의 숫자를 입력한다.<br>
![image](https://user-images.githubusercontent.com/102115231/173283921-a40832ad-9af8-4341-b77f-8f1d5530d97e.png)<br>
만약 0이나 1 에서 9 사이 중에 숫자가 아닌 수를 입력한다면<br>
![image](https://user-images.githubusercontent.com/102115231/173284744-c20afeeb-1298-4d26-9bdb-4e1ba78a246c.png)<br>
이렇게 틀렸다는 오류 메시지가 나오게 되고 아래처럼 같은 숫자가 없다면 반복문을 빠져나오게됩니다.<br>
그리고 반복문을 통해 스트라이크가 다 나오거나 기회가 다 되었다면 종료 하게 한다.<br>
![image](https://user-images.githubusercontent.com/102115231/173285599-77b5ea68-919f-46f1-a428-c1e14dc92cff.png)<br>
![image](https://user-images.githubusercontent.com/102115231/173286301-87f397ec-e213-47e8-a3e9-ea767d9b583d.png)<br>
이렇게 글이 나오면서 끝나게된다.<br>
![image](https://user-images.githubusercontent.com/102115231/173286391-79cae9e8-6f58-43e8-ab95-c5457adca97e.png)<br>
결과값을 출력하기 위해 값을 변환하여 저장한다.<br>
여기까지 야구게임이었습니다.
