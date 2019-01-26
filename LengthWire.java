import com.sun.org.apache.xalan.internal.xsltc.dom.AbsoluteIterator;

public class LengthWire
{
    private int home_bound;
    private int counter;
    private int[][] home;
    private int abs(int number)
    {
        return Math.abs(number);
    }

    LengthWire()
    {
        counter = 0;
        home_bound=100000;
        home = new int[home_bound][2];
    }
    public void setHome(int x, int y)
    {
        if(x>1000000 || x<-1000000)
            return;
        else if(y>1000000 || y<-1000000)
            return;
        home[counter][0] = x;
        home[counter][1] = y;
        counter+=1;
    }
    public int calculate()
    {
        int result=0;
        int max=0;
        for (int i=0; i<=counter; i++)
        {
            for(int j=i; j<=counter; j++)
            {
                result = abs(home[i][0] - home[j][0]) + abs(home[i][1] - home[j][1]);
                if(result>=max)
                {
                    max = result;
                }
            }
        }
        return max;
    }
}
