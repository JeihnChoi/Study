package ex04;

class Player {
    String name;
    int thirty; // 0~100 (클수록 목말라짐) : 범주를 준 데이터 //도메인설정 - if로 다 처리해야함.

    public Player(String name, int thirty) {
        this.name = name;
        this.thirty = thirty; // heap변수에 있는 name을 가르키기 위해서 this를 붙여준다
    }

    public void drink() {
        thirty = thirty + 30;
    }

}

public class OOP01 {
    public static void main(String[] args) {
        Player p1 = new Player("홍길동", 100);
        Player p2 = new Player("임꺽정", 100);

        System.out.println(p1.name);
        System.out.println(p2.name);

        p2.drink();

    }
}
