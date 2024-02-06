package chap_01;

public class _03_Variables {  // 변수
    public static void main(String[] args) {
        //String name; // 1번 방법
        //name = "임동수";

        String name = "임동수";  // 2번 방법  // 문자열

        int hour = 15;  // 숫자형

        System.out.println(name + "님, 배송이 시작됩니다. " + hour + "시에 방문 예정입니다.");
        System.out.println(name + "님, 배송이 완료되었습니다.");

        double score = 90.5;  // 실수값
        char grade = 'A';
        // 스트링은 " 캐리터는 ' 로 표현
        name = "강백호";  // Update가 되어 위는 임동수 -> 아래부터는 강백호가 들어간다.
        System.out.println(name + "님의 평균 점수는 " + score + "점입니다.");
        System.out.println("학점은 " + grade + "입니다.");

        boolean pass = true;
        System.out.println("이번 시험에 합격했을까요?? " + pass);

        double d = 3.14123456789; // 실수값 그대로 넣어도됨
        float f = 3.14123456789F; // 실수값 뒤에 F가 들어감
        System.out.println(d);
        System.out.println(f);

        long l = 1000000000000L;  // 롱형자료이며 뒤에 L이 들어간다 int보단 더 많은 숫자가 들어간다.
        System.out.println(l);

        // int, long, float, duoble, char, String, boolean
    }
}
