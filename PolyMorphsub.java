package polymorphex;

public class PolyMorphsub extends PolyMorphadd {

    public int res1;

   @Override
    int arithOperator(int a, int b) {
        res1 = a - b;
        return res1;

    }

    @Override
    int arithOperator(int a, int b, int c) {
        res1 = a - b - c;
        return res1;
    }

    int arithOperator4(int a, int b, int c, int d) {
       res1 = a-b-c-d;
       return res1;

   }

}
