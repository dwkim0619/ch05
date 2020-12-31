package ch05;

public class MainForCannon {
    public static void main(String[] args) {
        Weapon weapon = new Weapon();
        System.out.println("기본 무기의 살상 능력은 " + weapon.fire());

        Cannon cannon = new Cannon();
        System.out.println("대포의 살상 능력은 " + cannon.fire());
    }
}
