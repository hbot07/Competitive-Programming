public class FindMissingNumberInArray {
    public static void main(String[] args)
    {
        int[] a1={1,2,3,4,5};
        int[] a2={1,2,4,5};//has one element missing
        int sum1=0,sum2=0;
        for(int i=0;i<a1.length;i++)
        {
            sum1+=a1[i];
        }
        for(int i=0;i<a2.length;i++)
        {
            sum2+=a2[i];
        }
        System.out.println("Missing number is "+(sum1-sum2));
    }
}
