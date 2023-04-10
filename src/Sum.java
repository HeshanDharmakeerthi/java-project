public class Sum {
    void sum(int a , long b){
        System.out.println(a + b);
    }
    void sum(int c , int d){
        System.out.println(c + d);
    }

    public static void main(String[] args) {
        Sum s = new Sum();

        s.sum(78, 78789789787L);
        s.sum(67, 78);
    }
}
