import java.util.*;
public class BasicValid
{
    public static String day(String b,String c)
    {
        Calendar ob=Calendar.getInstance();
        String day[]={"Sunday","Monday","tuesday","wednesday","thursday","friday","saturday"};
        String a=""+day[ob.get(Calendar.DAY_OF_WEEK)];
        return (searcher(a,day)<=searcher(c,day)&&searcher(a,day)>=searcher(b,day)?"OPEN":"CLOSE");    
    }
    public static int searcher(String a,String[] b)
    {
        int m=-1;
        for(int i=0;i<b.length;i++)
        if(a.equalsIgnoreCase(b[i]))
        m=i;
        return m;
    }
}