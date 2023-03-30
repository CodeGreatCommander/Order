import java.io.*;
import java.util.Scanner;
public class DataFiles
{
    public static void onedata()throws IOException
    {
        DataInputStream ob=new DataInputStream(System.in);
        FileOutputStream a=new FileOutputStream("Order.dat",true);
        DataOutputStream dos=new DataOutputStream(a);
        System.out.println("Enter name of Restaurant:");
        String name=ob.readLine()+".dat";
        dos.writeUTF(name);
        System.out.println("Enter type of restraunt(like sweet,snacks,lunch)");
        dos.writeUTF(ob.readLine());
        System.out.println("Enter number of dishes in the Restaurant:");
        int count=Integer.parseInt(ob.readLine());
        dos.writeInt(count);
        FileOutputStream q=new FileOutputStream(name);
        DataOutputStream os=new DataOutputStream(q);
        for(int i=0;i<count;i++)
        {
            System.out.println("Enter name of dishes and its price in the format:(NAME)//RS(amount):");
            os.writeUTF(ob.readLine());
        }
        os.close();
        System.out.println("Enter first day of working:");
        dos.writeUTF(ob.readLine());
        System.out.println("Enter last day of working:");
        dos.writeUTF(ob.readLine());
        System.out.println("Enter time of opening(enter in 24 hour clock system and please only eneter time in hours):");
        dos.writeInt(Integer.parseInt(ob.readLine()));
        System.out.println("Enter time of closing(enter in 24 hour clock system and please only enter time in hours):");
        dos.writeInt(Integer.parseInt(ob.readLine()));
        dos.close();
    }
    public static void multipleData(boolean input)throws IOException
    {
        DataInputStream ob=new DataInputStream(System.in);
        FileOutputStream a=new FileOutputStream("Order.dat",input);
        DataOutputStream dos=new DataOutputStream(a);
        System.out.println("Enter number of restraunts u want to add:");
        int qwerty=Integer.parseInt(ob.readLine());
        if(qwerty>=5)
        {
            System.out.println("INVALID INPUT");
            System.exit(0);
        }
        for(int j=0;j<qwerty;j++)
        {
        System.out.println("Enter name of Restaurant:");
        String name=ob.readLine()+".dat";
        dos.writeUTF(name);
        System.out.println("Enter type of restraunt(like sweet,snacks,lunch)");
        dos.writeUTF(ob.readLine());
        System.out.println("Enter number of dishes in the Restaurant:");
        int count=Integer.parseInt(ob.readLine());
        dos.writeInt(count);
        FileOutputStream q=new FileOutputStream(name);
        DataOutputStream os=new DataOutputStream(q);
        for(int i=0;i<count;i++)
        {
            System.out.println("Enter name of dishes and its price in the format:(NAME)//RS(amount):");
            os.writeUTF(ob.readLine());
        }
        os.close();
        System.out.println("Enter first day of working:");
        dos.writeUTF(ob.readLine());
        System.out.println("Enter last day of working:");
        dos.writeUTF(ob.readLine());
        System.out.println("Enter time of opening(enter in 24 hour clock system and please only eneter time in hours):");
        dos.writeInt(Integer.parseInt(ob.readLine()));
        System.out.println("Enter time of closing(enter in 24 hour clock system and please only enter time in hours):");
        dos.writeInt(Integer.parseInt(ob.readLine()));
        }
        dos.close();
    }
    public static int counter()throws IOException
    {
        FileInputStream a=new FileInputStream("Order.dat");
        DataInputStream dis=new DataInputStream(a);
        int c=0;
        while(true)
        {
            try
            {
            dis.readUTF();
            
            dis.readUTF();
            dis.readInt();
            dis.readUTF();
            dis.readUTF();
            dis.readInt();
            dis.readInt();
            c++;
            }
            catch(Exception e)
            {
                break;
            }
        }
        dis.close();
        return c;
    }
    public static void editData(String resname)
    {
        try(DataInputStream dis=new DataInputStream(new FileInputStream(resname));
        DataOutputStream dos=new DataOutputStream(new FileOutputStream("Order1.dat"));
        Scanner sc=new Scanner(System.in);)
        {
            System.out.println("Name of dish u want to edit:");
            String e=sc.nextLine();
        }
        catch (Exception e) 
        {
        }
    }
}