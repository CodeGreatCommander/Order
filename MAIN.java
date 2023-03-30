public class MAIN
{
    public static void main(String[] args)
    {
        int num=0;
        try
        {    
            num=DataFiles.counter();
        }
        catch(Exception e)
        {
            try
            {
            DataFiles.multipleData(false);
            num=DataFiles.counter();
            }
            catch(Exception q)
            {
            }
        }
        try
        {
            Calculate ob=new Calculate(num);
            ob=Basic.sorter(ob);
            System.out.println(ob.day[0][0]);
            ob.exag1();
            ob.SignIn();
            ob.exag1();
            ob.mainDisplay();
            ob.billcal();
            ob.printer();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}