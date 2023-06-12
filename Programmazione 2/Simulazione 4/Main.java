public class Main {
    public static void main(String[] args) {
        Tree<Integer> t1 = new Branch<Integer>(2,new Branch<>(-3,new Branch<Integer>(1,new Leaf<Integer>(),new Leaf<Integer>()),
                new Leaf<>())
                ,new Leaf<Integer>());
        Tree<Integer> controlla = t1.detach(2);
        System.out.println(controlla);//esercizio 1
        //esercizio 2
        /*I obj = new D();
        ((D) obj).m2();*/
        J obj = new D();
        C x = (C) obj;
        x.m1(new D());
        /*C obj = new D();
        obj.m1(obj);*/
        /*
        * 1) si perchè m1 viene implementata nella classe D che estende C e implementa I
        * 2)Si perchè va in D in m2 e stampa D.m2 e poi va in m1 e stampa D.m1
        * 3)Si perchè stampa D.m2 D.m1 D.m1
        * 4)No perchè il parametro è di tipo e quello che sto passando è di tipo J
        * */

    }
}
abstract class Tree<T> {
    public abstract Tree<T> detach(T x);
    protected abstract String toStringAux
            (String prefix, String root, String left, String right);
    //Metodo che gestisce la parte NON pubblica della stampa.2

    public String toString()
    {return toStringAux("","___"," "," ");}
}
class Leaf<T> extends Tree<T> {
    public Tree<T> detach(T x) {
        return  this;
    }
    protected String toStringAux
            (String prefix, String root, String left, String right)
    {return prefix + root + "leaf";}

}
class Branch<T> extends Tree<T> {
    private T elem;
    private Tree<T> left;
    private Tree<T> right;
    public Branch(T elem, Tree<T> left, Tree<T> right) {
        this.elem = elem;
        this.left = left;
        this.right = right;
    }
    @Override
    public Tree<T> detach(T x) {
        if(x == elem)
            return new Leaf<>();
        return new Branch<T>(elem,left.detach(x),right.detach(x));
    }
    protected String toStringAux
            (String prefix, String root, String left, String right){
        return this.left.toStringAux(prefix+left, " /", " ", " ¦")
                + "\n" + prefix + root + "[" + elem + "]" + "\n" +
        this.right.toStringAux(prefix+right, " \\", " ¦", " ");
    }
}
interface I {
    public void m1(J obj);
}
interface J {
    public void m2();
}
abstract class C implements I {
    public abstract void m1(J obj);//commenta questo per l'esercizio 1
}
class D extends C implements J {
    public void m1(J obj) {
        if (this != obj) obj.m2();
        System.out.println("D.m1");
    }
    public void m2() {
        System.out.println("D.m2");
        m1(this);
    }
}
class Node<T> {
    public T elem;
    public Node<T> next;
    public Node(T elem, Node<T> next) {
        this.elem = elem;
        this.next = next;
    }
    //Esercizio 3
    /*
    *Aggiungendo un'asserzione sul metodo okay di tipo boolean per controllare i seguenti casi:
    * 1) se la lista è vuota ritorno false
    * 2) se il parametro x passato non sia nullo
    * 3) se un'elemento della lista non sia nullo
    * */
    public static<T extends Comparable<T>> boolean ok(Node<T> p, T x){
        if(p == null)
            return false;
        if(x == null)
            return false;
        Node<T> aux = p;
        while (aux !=null){
            if(p.elem == null)
                return false;
            p = p.next;
        }
        return true;
    }
    public static <T extends Comparable<T>> void metodo(Node<T> p, T x) {
        assert ok(p,x):"Errore controlla la lista o x";
        while (x.compareTo(p.elem) < 0)
            p = p.next;
        p.next = null;
        /*
        * p = [] , x = [1] =false
        * p = [1,1], x= [] = false
        * p = [1,2,3,4,5], x=[5] = p=[1,2,3,4]
        * p = [1, null,3 ,4, 5] , x = [5] =  p=[1,3,4,5]
        */
    }
}