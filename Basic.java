import java.util.Arrays;
public class Basic
{
    public static int largest(String a,String[] b)
    {
        int l=a.length();
        for(int i=0;i<b.length;i++)
        if(b[i].length()>l)
        l=b[i].length();
        return l;
    }
    public static String perfectpr(int l,String a)
    {
        int q=l-a.length();
        for(int i=0;i<q;i++)
        a+=" ";
        return a;
    }
    public static Calculate sorter(Calculate ob)
    {
        for(int i=0;i<ob.Resname.length-1;i++)
        {
            int pos=i;
            String small=ob.Resname[i];
            for(int j=i+1;j<ob.Resname.length;j++)
            if(ob.Resname[j].compareTo(small)>=0)
            {
                small=ob.Resname[j];
                pos=j;
            }
            shifter(ob.Resname,pos,i);
            shifter(ob.restype,pos,i);
            shifter(ob.Resname,pos,i);
            String a[]=ob.day[i];
            ob.day[i]=ob.day[pos];
            ob.day[pos]=a;
            int u=ob.time[pos][0];
            ob.time[pos][0]=ob.time[i][0];
            ob.time[i][0]=u;
            u=ob.time[pos][1];
            ob.time[pos][1]=ob.time[i][1];
            ob.time[i][1]=u;
            String t[]=ob.resitem[i];
            ob.resitem[i]=ob.resitem[pos];
            ob.resitem[pos]=t;
        }
        return ob;
    }
    public static void shifter(String a[],int b,int c)//created for calculate sorter
    {
        String u=a[b];
        a[b]=a[c];
        a[c]=u;
    }
}