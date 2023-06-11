public class Node {
    public static void main(String[] args) {
        List l1 =new Cons(1,new Cons(2,new Cons(3,new Nil())));
        double risultato = l1.eval(5);
        System.out.println(risultato);
        /*I obj = new D();
        obj.m1(new C());*/
        /*I obj = new C();
        obj.m1(new D());*/
        J obj = new D();
        ((D) obj).m1(new C());
    }
}
abstract class List {
    public abstract double eval(double x);
}
class Nil extends List {
    public double eval(double x) {
       return 0.0;
    }
}
class Cons extends List {
    private double elem;
    private List next;
    public Cons(double elem, List next) {
        this.elem = elem;
        this.next = next;
    }
    public double eval(double x) {
        return elem+next.eval(x)*x;
    }
}
//1) Si pk m1 serve in m3 di D
//2)Non funziona pk non è possibile convertire D in
//3) Stampa D.m2 e C.m1
//4) Stampa D.m1

interface I {
    public void m1(J obj);
}
interface J {
    public void m2(I obj);
}
interface K {
    public void m3();
}
class C implements I, J {
    public void m1(J obj) {
        obj.m2(this);
        System.out.println("C.m1");
    }
    public void m2(I obj) {
        obj.m1(this);
        System.out.println("C.m2");
    }
}
class D implements J, K {
    public void m1(J obj)
    { System.out.println("D.m1"); }
    public void m2(I obj)
    { System.out.println("D.m2"); }
    public void m3() {
        m1(this);
        System.out.println("D.m3");
    }
}