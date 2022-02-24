package Sorts;

public class Sort implements IComparator <Integer>{
   
    @Override
    public int Compare(Integer x, Integer y ){

        int res;

        if (x>y) {
            res = 0;
        }else if (x<y){
            res = 1;
        }else {
            res = -1;
        }
        return res;
    }
}