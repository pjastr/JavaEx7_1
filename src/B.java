public class B extends A {
    public void metoda1() { System.out.println("B metoda1()"); }
    public void metoda2() { System.out.println("B metoda2()"); metoda3(); }
    @Override
    public void metoda3() { System.out.println("B metoda3()"); }
}
