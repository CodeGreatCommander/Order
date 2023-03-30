import java.io.*;
import java.util.*;
public class Calculate extends Exaggerate
{
    String bill;
    int tcost;
    Calculate(int n)throws IOException
    {
        super(n);
        tcost=0;
        bill="";
    }
    public void billcal()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter name of restraunt you want to order from(Enter one name at a time):");
        String res=sc.nextLine();
        while(!res.equalsIgnoreCase("Nothing"))
        {
            int a=Arrays.binarySearch(Resname,res);
            if(a<=-1)
            {
                System.out.println("Name doesn't match\nPlease enter another name of restraunt you want to order from(Enter one name at a time and if your list over type nothing):");
                res=sc.nextLine();
                continue;
            }
            else if(BasicValid.day(day[a][0],day[a][1]).equals("CLOSE"))
                {
                    System.out.println("SORRY!Restraunt is closed today\nYou can try another one,Please enter name of restraunt");
                    res=sc.nextLine();
                    continue;
                }
            resprinter(a);
            String[] resitem1=new String[resitem[a].length];
            for(int i=0;i<resitem1.length;i++)
            resitem1[i]=resitem[a][i].substring(0,resitem[a][i].indexOf("//"));
            System.out.println("Enter name of first dish u want to order");
            String dish=sc.nextLine();
            Arrays.sort(resitem1);  
            while(!dish.equalsIgnoreCase("NO MORE"))
            {
                int b=Arrays.binarySearch(resitem1,dish);
                if(b<0)
                {
                    System.out.println("Name doesn't match\nPlease enter another name of dish you want to order from(Enter one name at a time and if your list over type no more):");
                    dish=sc.nextLine();
                    continue;
                }
                System.out.println("Please enter quantity:");
                int q=sc.nextInt();
                sc.nextLine();
                tcost+=Integer.parseInt(resitem[a][b].substring(resitem[a][b].indexOf("//RS")+4))*q;
                bill+=resitem[a][b]+"\t"+Resname[a]+"\t"+resitem[a][b].substring(resitem[a][b].indexOf("RS")+4)+"\t"+q+"\n";
                System.out.println("Enter name of another dish u want to order");
                dish=sc.nextLine();
            }
            mainDisplay();
            System.out.println("Please enter another name of restraunt you want to order from(Enter one name at a time and if your list over type nothing):");
            res=sc.nextLine();
        }
    }
    public void printer()
    {
        System.out.println(uname+"\n"+bill+"\n"+"Total Bill:\t\t\u20B9"+tcost);
        System.out.println("Would you like to pay by which way:\n1)CASH\n2)BOIBR Bank");
        Scanner sc=new Scanner(System.in);
        if(sc.nextLine().equalsIgnoreCase("BOIBR Bank"))
        System.out.println("Please press order on bank app");
        System.out.println("Thank You!Pay at the moment of delivery");
    }
}