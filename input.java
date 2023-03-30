import java.util.Scanner;
import java.io.*;
public class input
{
    String[] Resname,restype,resitem[],day[];
    int[]time[];//count contains number of dishes of each restaurant
    String uname;
    public input(int num)throws IOException
    {
        uname="";
        Resname=new String[num];
        restype=new String[num];
        resitem=new String[num][];
        day =new String[num][2];
        time =new int[num][2];
        FileInputStream a=new FileInputStream("Order.dat");
        DataInputStream dis=new DataInputStream(a);
        for(int i=0;i<num;i++)
        {
            Resname[i]=dis.readUTF();
            Resname[i]=Resname[i].substring(0,Resname[i].length()-4);
            restype[i]=dis.readUTF();
            resitem[i]=new String[dis.readInt()];
            FileInputStream b=new FileInputStream(Resname[i]+".dat");
            DataInputStream is=new DataInputStream(b);
            for(int j=0;j<resitem[i].length;j++)
            resitem[i][j]=is.readUTF();
            is.close();
            day[i][0]=dis.readUTF();
            day[i][1]=dis.readUTF();
            time[i][0]=dis.readInt();
            time[i][1]=dis.readInt();
        }
        dis.close();
    }
    public void SignIn()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("First of all we will like u to sign in as it would help us find the best dishes for you:");
        System.out.println("Enter your name:");
        uname=sc.nextLine();
        System.out.println("Enter your phone number:");
        sc.nextLine();
        System.out.println("Enter your address:");
        sc.nextLine();
        while(true)
        {
            System.out.println("Enter the master password u created:");
            if(sc.nextLine().equals("cmrtgwwbighmte"))
            {
                break;
            }
            else
            {
                System.out.println("WRONG PASSWORD\nWould u like to reattempt or recreate this id");
                if(sc.nextLine().toUpperCase().indexOf("RECREATE")>=0)
                {
                    System.out.println("ALL YOUR PREVIOUS DETAILS HAVE BEEN DELETED\n Please enter new Password:");
                    String a=sc.nextLine();
                    System.out.println("Please reenter your password:");
                    System.out.println(sc.nextLine().equals(a)?"NEW PASSWORD GENERATED":"INVALID!IT DOESN'T MATCH SECOND PASSWORD BECOMES DEFAULT ONE");
                    break;
                }
            }
        }
        System.out.println("THANK YOU FOR SIGNING IN");
    }
}