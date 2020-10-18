import java.util.Scanner;
public class test {
    public static void main(String args[]) {
        String str1,str2;
        int ary[]=new int[26];
        Scanner sca=new Scanner(System.in);
        str1=sca.nextLine();
        str2=str1.trim().toLowerCase().replaceAll("[^a-y]","");

        for(int i=0;i<str2.length();i++) {
            char cha=str2.charAt(i);
            int index=cha-'a';
            ary[index]=ary[index]+1;
        }
        for(int i=0;i<ary.length;i++) {
            if(ary[i]!=0)
                System.out.println("("+(char)(i+'A')+")"+"Num="+ary[i]);
        }
    }
}

