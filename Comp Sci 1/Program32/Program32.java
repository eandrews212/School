//Ethan Andrews
//Period 8
//Program32
//This program finds the number of presents a person would get each day and the total number of presents they would have at the end of each day.

public class Program32{
    public static void main(String args[]){
        int gifts=0, total=0, counter=1;
        System.out.println("DAY\t\tGIFTS\t\tTOTAL");
        for (int x=1;x<=12;x++){
            if(x==1){
                System.out.print(x+"\t\t");
                gifts=1;
                System.out.print(gifts+"\t\t");   
                total=gifts;
                System.out.println(total);
            }else{
                counter++;
                System.out.print(x+"\t\t");  
                gifts=gifts+counter;
                System.out.print(gifts+"\t\t");            
                total=total+gifts;
                System.out.println(total);
            }
        }
    }
}
/*
DAY		GIFTS		TOTAL
1		1		1
2		3		4
3		6		10
4		10		20
5		15		35
6		21		56
7		28		84
8		36		120
9		45		165
10		55		220
11		66		286
12		78		364

 */