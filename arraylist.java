//xrhstos mixahl AM 526
import java.util.Scanner;
import java.util.ArrayList;




class Array
{
Scanner input = new Scanner(System.in);
private int num;
private int l;
ArrayList<Integer> intList = new ArrayList<Integer>();



public Array()
	{
		ArrayList< Integer > intList = new ArrayList<Integer>(4); 
		this.num=4;
	}


public  Array(int num)
	{	
		
		ArrayList<Integer> intList = new ArrayList<Integer>(num); 
		this.num=num;
	}

public void addarray()
	{	
		System.out.println(" dwse akeraio gia ton pinaka ");
		this.l = input.nextInt();
		if( intList.size() < num )
			intList.add(l);
		else
		{
			this.num=2*num;
			intList.ensureCapacity(num); 
			intList.add(l);
		}
	}


public void delete()
	{	
		
		intList.remove(intList.size()-1);
		if( intList.size() <= (num/2) )
		{
			this.num=num/2;
			intList.ensureCapacity(num);   
		}
	}

public void get(int s)
	{	
		
		if ((s <= intList.size()) && ( 1 <= s) )
			System.out.println("to stoixeio sth 8esh : " + s + " einai "+ intList.get(s-1));
	}



public void set(int i,int x)
	{	
		
		if ((i <= intList.size()) && ( 1 <= i) )
			intList.set(i,x);
	}


public void getsize()
	{	
		System.out.println("o pinakas exei " + intList.size() + " stoixeia");
	}

public void getcapacity()
	{	
		System.out.println("to mege8os tou pinaka einai : " + num);
	}


public void printarray()
	{
		for(int i=0;i < intList.size() ;i++)
		{
			System.out.println("einai : " + intList.get(i));
			


		}
	}


}






class erg21
{
public static void main(String args[])
	{
	
	Scanner input = new Scanner(System.in);
	System.out.println("dwse 8eseis tou pinaka :");
	int e = input.nextInt();


	Array arrr = new Array(e);


	
	

	for(int i=0;i<2;i++)
	{
		arrr.addarray();
			
	}

	
	arrr.set(1,3);
	arrr.get(2);
	arrr.printarray();
	arrr.getsize();
	arrr.getcapacity();



	/*arrr.delete();
	

	arrr.printarray();
	arrr.getsize();
	arrr.getcapacity();

	for(int i=0;i<9;i++)
	{
		arrr.addarray();
			
	}


	arrr.printarray();
	arrr.getsize();
	arrr.getcapacity();

	
	for(int i=0;i<8;i++)
	{
		arrr.delete();
			
	}


	arrr.printarray();
	arrr.getsize();
	arrr.getcapacity();*/

	}	
}	