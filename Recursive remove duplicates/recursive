import java.util.*;
public class remove{
    public static void main(String args[])
    {
        String s = "c";
        String ans = unique(s);
        System.out.print(ans);
        
    }
    public static String unique(String s)
    {
       //System.out.println(s);
       String temp ="";
        String l = "";
        List<Integer> list = new ArrayList<>();
        if(s.length()==2 && s.charAt(0) == s.charAt(1))
        {
            temp="Empty";
            //return temp;
        }
        else if(s.length()==1)
        {
            temp=s;
        }
        else if(s.length()>2){
        for(int i=1;i<s.length()-1;i++)
        {
            char a=s.charAt(i-1);
            char b=s.charAt(i);
            char c=s.charAt(i+1);
            if(a!=b && c!=b)
            {
                list.add(i);
            }
        }
        String ss="";
        if(s.charAt(0)!=s.charAt(1))
        {
            ss+=s.charAt(0);
        }
        for(int j=0;j<list.size();j++)
        {
            ss+=s.charAt(list.get(j));
        }
        if(s.charAt(s.length()-1) != s.charAt(s.length()-2))
        {
            l=l+s.charAt(s.length()-1);
        }
        temp = ss+l;
        //System.out.println(temp);
        String hhh ="";
        //Map<Character,Integer> map = new HashMap<>();
        List<Character> list0 = new ArrayList<>();
        if(temp.length()>2 && list.size()!=0)
        {
            for(int u=1;u<temp.length()-1;u++)
            {
                char x=temp.charAt(u-1);
                char y=temp.charAt(u);
                char z=temp.charAt(u+1);
                if(x!=y && z!=y)
                {
                    list0.add(temp.charAt(u));
                
                }
                else{
                    temp=unique(temp);
                 }
            
            }
        }
        else if(temp.length()==1)
        {
            temp=temp;
        }
        else if(temp.length()==2 && temp.charAt(0) == temp.charAt(1))
        {
            temp="Empty";
            //return temp;
        }
        else if(temp.length()==2 && temp.charAt(0) != temp.charAt(1))
        {
            temp=temp;
            //return temp;
        }
        else{
            temp="Empty";
        }
        }
        //System.out.println(temp);
        return temp;
        //System.out.println(ss+l);
    }
}
