import java.io.*;
import java.util.Scanner;
public class Exaggerate extends input
{
    Exaggerate(int n)throws IOException
    {
        super(n);
    }
    public void exag1()
    {
        for(int i=0;i<48;i++)
        System.out.print(" ");
        System.out.println("___________________________");
        for(int i=0;i<48;i++)
        System.out.print(" ");
        System.out.println("     FRENZY ORDERS");
        for(int i=0;i<48;i++)
        System.out.print(" ");
        System.out.println("---------------------------");
        System.out.println("WELCOME TO WORLD'S MOST AMAZING AND POPULAR MOBILE RESTRAUNT!!!\n\nYOU CAN COME TO KNOW AND TASTE MOST ABSURD BUT TASTY DISHES THAT EXISTS ON EARTH");
    }
    public void mainDisplay()//need to sort in main before running it
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[2];
        a[0]=Basic.largest("Restaurant",Resname);
        a[1]=Basic.largest("type",restype);
        System.out.println("\n\n\nRestaurant\ttype\tRatings\tOPEN/CLOSE\tDay Ranges\t\tTime");
        for(int i=0;i<48;i++)
        System.out.print("__");
        for(int i=0;i<Resname.length;i++)
        {
            System.out.println();
            System.out.println(Basic.perfectpr(a[0],Resname[i])+"\t"+Basic.perfectpr(a[1],restype[i])+"\t"+(int)(Math.random()*5+5)+"\t"+BasicValid.day(day[i][0],day[i][1])+"\t\t"+day[i][0]+"-"+day[i][1]+"\t"+time[i][0]+"-"+time[i][1]);
        }
        System.out.println("Would u like to filter by type,if yes then also enter type:");
        if(sc.nextLine().equalsIgnoreCase("yes"))
        filterType(sc.nextLine());
    }
    public void filterType(String st)//called by main display only
    {
        int a[]=new int[2];
        a[0]=Basic.largest("Restaurant",Resname);
        a[1]=Basic.largest("type",restype);
        System.out.println("\n\n\nRestaurant\ttype\tRatings\tOPEN/CLOSE\tDay Ranges\t\tTime");
        for(int i=0;i<48;i++)
        System.out.print("__");
        for(int i=0;i<Resname.length;i++)
        {
            System.out.println();
            if(restype[i].equalsIgnoreCase(st))
            System.out.println(Basic.perfectpr(a[0],Resname[i])+"\t"+Basic.perfectpr(a[1],restype[i])+"\t"+(int)(Math.random()*5+5)+"\t"+BasicValid.day(day[i][0],day[i][1])+"\t\t"+day[i][0]+"-"+day[i][1]+"\t"+time[i][0]+"-"+time[i][1]);
        }
    }
    public void resprinter(int n)
    {
        System.out.println(Resname[n]+"\n\tName\tCost");
        for(int i=0;i<resitem[n].length;i++)
        System.out.println(i+1+"\t"+resitem[n][i].substring(0,resitem[n][i].indexOf("//"))+"\t"+resitem[n][i].substring(resitem[n][i].indexOf("//")+4));
    }
}