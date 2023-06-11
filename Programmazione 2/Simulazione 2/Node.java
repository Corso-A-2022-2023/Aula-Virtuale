class Node {
    public int elem;
    public Node next;
    public Node(int elem, Node next) {
        this.elem = elem;
        this.next = next;
    }
    public static Node diff(Node p, Node q) {
        if(p==null)
            return null;//Caso base:[] -[1,2,3] = []
        if(q == null)
            return p;//Caso base : [1,2,3,4,5,6]-[2,4,6]=[1,3,5]
        if(q.elem<p.elem)
            return diff(p,q.next);
        /*if(p.elem == q.elem && q.next == null)
            return null;//[1,1,1]-[1] =[]*/
        if(p.elem == q.elem)
            return  diff(p.next,q);
        return new Node(p.elem,diff(p.next,q));
    }
    public static void printList(Node p){
        System.out.print("[");
        for(Node i = p; i!=null ; i = i.next){
            System.out.print(" "+i.elem+" ");
        }
        System.out.print("]");
        System.out.println();
    }
    /*
    * 1) il metodo fa la somma di 1/l'elemento dell'array e ritorna tutta la somma diviso la sua lunghezza massima
    * 2)
    * */
    public static float metodo(int[] a) {
        assert ok(a):"vettore con problemi";
        float ris = 0;
        for (int i = 0; i < a.length; i++)
            ris += 1 / (float) a[i];
        return ris / a.length;
    }
    public static boolean ok(int[]a ){
        int i = 0;
        int j = a.length-1;
        while(i<j){
            if(a == null || a.length==0|| a[i]==0)//int[] a = {1,,3};
                return false;
            i++;
        }
        return true;
    }
    public static void main(String[] args) {
        Node p1 = new Node(1,new Node(2,new Node(3,new Node(4,new Node(5,new Node(6,null))))));
        Node q1 = new Node(2,new Node(4,new Node(6,null)));
        Node listDiff1 = diff(p1,q1);
        printList(listDiff1);
        Node p2 = new Node(1,new Node(2,new Node(3,new Node(4,new Node(5,new Node(6,null))))));
        Node q2 = null;
        Node listDiff2 = diff(p2,q2);
        printList(listDiff2);
        Node p3 = new Node(1,new Node(1,new Node(1,new Node(2,null))));
        Node q3 = new Node(1,null);
        Node listDiff3 = diff(p3,q3);
        printList(listDiff3);
        Node q4 = new Node(1,new Node(2,new Node(3,new Node(4,new Node(5,new Node(6,null))))));
        Node p4 = new Node(2,new Node(4,new Node(6,null)));
        Node listDiff4 = diff(p4,q4);
        printList(listDiff4);
        //1)Funziona pk non devi più implementare il metodo m1
        /*B obj1 = new C();
        obj1.m2(obj1);//Non funziona pk è del tipo sbagliato
        B obj1 = new C();
        obj1.m2(new C());
        /*B obj = new C();
        obj.m2();*/// Non funziona dato che il metodo B richiede un parametro
    }
}
interface A {
    public void m1();
}
interface B {
    public void m1();
    public void m2(A obj);
}
class C implements A, B {
    public void m1()
    { System.out.println("C.m1"); }
    public void m2()
    {
        System.out.println("B.m2");
        this.m1();
    }
    public void m2(A obj)
    {
        System.out.println("B.m3");
        this.m2();
    }
}
