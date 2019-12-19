//Description :wrote this code to check my solution for IYMC pre final round
public class IYMCPreFinalC1 {

public static void main(String[] args)
{double sum=0;
for(int j=0;j<=10;j++)
     for(int i=0;i<=10;i++)
    for(int i1=0;i1<=10;i1++)
    {
        for(int i2=0;i2<10;i2++)
        {
            for(int i3=0;i3<=10;i3++)
            {
               sum= ((Math.pow(2,i1+1)-1)/(2-1))*((Math.pow(3,i2+1)-1)/(3-1))*((Math.pow(5,i3+1)-1)/(5-1))*((Math.pow(7,i+1)-1)/(7-1))*((Math.pow(11,j+1)-1)/(11-1));
               //if(Math.pow(2,i1)*Math.pow(3,i2)*Math.pow(5,i3)==240) System.out.println(sum);
               if(sum>=4*Math.pow(2,i1)*Math.pow(3,i2)*Math.pow(5,i3)*Math.pow(7,i)*Math.pow(11,j)&&Math.pow(2,i1)*Math.pow(3,i2)*Math.pow(5,i3)*Math.pow(7,i)*Math.pow(11,j)<2000)
                    System.out.println(Math.pow(2,i1)*Math.pow(3,i2)*Math.pow(5,i3)*Math.pow(7,i)*Math.pow(11,j));

            //if(Math.pow(2,i1)*Math.pow(3,i2)*Math.pow(5,i3)*Math.pow(7,i)*Math.pow(11,j)==11) {System.out.println(sum);break;}
            }

        }

    }
}

}
