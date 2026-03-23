import java.lang.*;
import java.util.*;

class Subject{
    private String SubID;
    private int MaxMarks;
    private int MarksObtained;
    private String Name;

    public Subject (String SubID,String Name,int Maxmk){
        this.SubID=SubID; 
        this.Name=Name;
        this.MaxMarks=Maxmk;
    }

    public void setMarksObt(int Mks){
        MarksObtained=Mks;
    }

    public void setName(String Nm){
        Name=Nm;
    }

    public void setMaxMarks(int Maxmk){
        MaxMarks=Maxmk;
    }

    public int getMaxMarks(){ return MarksObtained; }

    public int getMarks(){ return MarksObtained; }

    public int getID(){ return MarksObtained; }

    public int getName(){ return MarksObtained; }

    boolean isQualified(){
        return MarksObtained >=MaxMarks/10*4;
    }

    public String toString(){
        return "\n Subject ID :"+SubID+"\n Name :"+Name+"\n MaxMarks :"+MaxMarks+"\n Marks Obtained :"+MarksObtained;
    }
}
    
public class ArrayOfObjects {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Subject subs[]=new Subject[3];
        subs[0]=new Subject("s101","DSA",100);
        subs[1]=new Subject("s102","Algorithms",100);
        subs[2]=new Subject("s103","OS",100);

        for(Subject s:subs){
            System.out.println(s);
        }
    }
}
