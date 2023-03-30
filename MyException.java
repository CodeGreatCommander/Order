public class MyException extends Exception
{
    MyException(String st)
    {
        super(st);
    }
    public static void daychecker(String st)throws MyException
    {
        st=st.toUpperCase();
        if("MONDAYTUESDAYWEDNESDAYFRIDAYSATURDAYSUNDAY".indexOf(st)==-1)
        throw new MyException("INVALID INPUT!Not a day");  
    }
}