package polymorphex;

public class PolyMorphmain {

    public static void main(String [] args){

        int res=0;

        PolyMorphadd pmadd = new PolyMorphadd();

        res=pmadd.arithOperator(2,3);
        System.out.println("Sum of 2 nums is " + res);
        System.out.println();

        res=pmadd.arithOperator(5,10, 15);
        System.out.println("Sum of 3 nums is " + res);
        System.out.println();

        PolyMorphsub pmsub = new PolyMorphsub();

        res=pmsub.arithOperator(2,3);
        System.out.println("Diff of 2 nums is " + res);
        System.out.println();

        res=pmsub.arithOperator(5,10, 15);
        System.out.println("Diff of 3 nums is " + res);
        System.out.println();

        res=pmsub.arithOperator4(105,10, 15, 30);
        System.out.println("Diff of 3 nums is " + res);
        System.out.println();

    }
}