package chap_01;

public class _Ouiz_01 {
    public static void main(String[] args) {
        /*
        (실행결과)
        상암08번 버스
        약 3분 후 도착
        남은거리 1.2km
        */

        // 아래 두개중 첫번째는 강의, 두번째는 내가한거

        // 버스 번호 (1234, 상암08)
        String busNo = "상암08";
        String a = "상암08";

        // 남은 시간 (3분, 5분)
        int minute = 3;
        int b = 3;

        // 남은 거리 (1.5km, 0.8km)
        double distance = 1.2;
        String c = "1.2";

        System.out.println(busNo + "번 버스");
        System.out.println("약 " + minute + "분 후 도착");
        System.out.println("남은 거리 " + distance + "km");

        System.out.println( a + "번 버스" );
        System.out.println("약 " + b + "분 후 도착");
        System.out.println("남은거리 " + c + "km");



    }
}
