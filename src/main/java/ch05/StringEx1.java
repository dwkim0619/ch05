package ch05;

public class StringEx1 {
    public void stringEx1() {
        String str1 = new String("안녕하세요");
        String str2 = new String("안녕하세요");

        System.out.println("str1 == str2 ? " + (str1 == str2));
        System.out.println("str1.equals(str2) ? " + str1.equals(str2));
    }

    public void stringEx2() {
        String name1 = "김자바";
        String name2 = "김자바";

        System.out.println("변수 name1과 name2는 " + ((name1 == name2) ? "같다." : "다르다."));
    }
}
