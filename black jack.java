//xrhstos mixahl AM 526
import java.util.Scanner;
import java.util.Random;





class river
{
Scanner input = new Scanner(System.in);
protected int deck[] = new int[10];
protected int k;
protected int i;
Random randomGenerator = new Random();
protected int left; 

public river()
	{	
		
		this.k = 1;
		for(int i=0;i<10;i++)
		{
			if( i == 9 )
				this.deck[i] = deck[i-1] + 16*k;
			else if( i == 0 )
				this.deck[i] = 4*k;
			else
				this.deck[i] = deck[i-1] + 4*k;
		}
		left = deck[9];
	}



public river(int f)
	{	
		this.k = f;
		for(int i=0;i<10;i++)
		{
			
			if( i == 9 )
				this.deck[i] = deck[i-1] + 16*k;
			else if( i == 0 )
				this.deck[i] = 4*k;
			else
				this.deck[i] = deck[i-1] + 4*k;
		}
		left = deck[9];
	}


public int nextcard()
	{	
		int x = 0;
		int choose = randomGenerator.nextInt(deck[9]) - 1;
		for( i=9 ; i>=1;i--){
			if(choose > deck[i])
			{	
				x = i + 2;
				i = 0;	
			}
			if( i == 1 && x == 0)
				x = 1;} 
		for(i=x-1;i<10;i++)
			this.deck[i]--;
		left--;
		return x;
		
	}

public void start()
	{
		
		for(int i=0;i<10;i++)
		{
			
			if( i == 9 )
				this.deck[i] = deck[i-1] + 16*k;
			else if( i == 0 )
				this.deck[i] = 4*k;
			else
				this.deck[i] = deck[i-1] + 4*k;
		}
		left = deck[9];

		
	}


}





class hand
{
protected int sum;
protected int ace;
protected int once;
int t;

Scanner input = new Scanner(System.in);



public int getpoints(int c)
	{	
		if(c==1)
			ace++;
		this.sum += c;
		if( ace == 1)
			if(sum+10<=21)
			{
				sum=sum+10;
				t++;
			}	
		if( ace >= 1)
			if(sum>21 && once == 0 && t == 1)
			{
				once++;
				sum=sum-10;
			}		
		return sum;
	}


}



class player
{
protected float bet;
 hand h;
protected int m;
river riv;
protected String choice;
protected float a = 3;
protected float b = 2;
Scanner input = new Scanner(System.in);

public player(river riv)
	{
		this.riv = riv;
	}

public void placebet()
	{	
		System.out.println("dwse poso gia pontarisma " );
		bet = input.nextFloat();
	}



public float outcame()
	{	
		return bet;
	}

	

public int play()
	{
		int g;
		
		h = new hand();	
		g = riv.nextcard();
		System.out.println("trabh3es 1 :" + g);
		if((g == 1) || (g == 10))
			m = g;
		h.getpoints(g);
		g = riv.nextcard();
		m += g;
		System.out.println("trabh3es 2 :" + g);
		System.out.println("o paixths exei : " + h.getpoints(g));
		System.out.println("mporeis na diplasiaseis to stoixhma(d),na trabh3eis(t)h na stamathseis(s)");
		
		choice = input.next();
		
		if(choice.equals("d"))
			bet = bet*2;
		else if(choice.equals("t"))
			while(choice.equals("t"))
			{ 
				g = riv.nextcard();
				System.out.println("trabh3es :" + g);
				System.out.println("exeis : " + h.getpoints(g));
				if(h.getpoints(0)>21)
				{
					return 0;
				}
				if(choice.equals("t"))
				{
					System.out.println("mporeis na trabh3eis(t)h na stamathseis(s)");
					choice = input.next();
				}
			
			}
		
		if( m == 11)
			bet = bet*(a/b);
		return h.getpoints(0);
			
	}	
}





class blackjack
{


private float alllost;
float allprofit;
hand h;
player pl;
river riv;
private float all;

Scanner input = new Scanner(System.in);



public blackjack(river riv)
	{
		this.riv = riv;
		pl = new player(riv);
	}

public int playdealer()
	{
		int g;
		
		h = new hand();	
		g = riv.nextcard();
		System.out.println("trabh3es 1 :" + g);
		h.getpoints(g);
		g = riv.nextcard();
		System.out.println("trabh3es 2 :" + g);
		System.out.println("o dealer exei : " + h.getpoints(g));

			while(h.getpoints(0)<17)
			{ 
				g = riv.nextcard();
				System.out.println("o deler trabh3e :" + g);
				System.out.println("o dealer exei : " + h.getpoints(g));
				if(h.getpoints(0)>21)
				{
					
					System.out.println("o dealer perase to orio (21) " );
					return 0;
				}
				
			
			}
		
		
		return h.getpoints(0);
			
	}	


public  int main()
	{
	
	
	

	pl.placebet();
	int x = pl.play();

	if( x!=0)
		System.out.println("sunolo exeis :" + x);
	else
	{
		System.out.println("perases to orio (21) " );	
		
	}

	return x;
	}

public  void moneys(String c)
	{
		if(c.equals("win"))
		{
			allprofit += pl.outcame();	
		}		
		else
		{
			alllost += pl.outcame();
			
		}
		if(allprofit>alllost)
		{
			all = allprofit - alllost;	
			System.out.println("kerdises " + all + " lefta" );	
		}	
		else
		{
			all = alllost - allprofit;	
			System.out.println("exases " + all + " lefta" );	
		}		
	


	
	}





}






class erg22
{
public static void main(String args[])
	{
	
	Scanner input = new Scanner(System.in);
	System.out.println("dwse poses trapoules 8a xrhsimopoih8oun :");
	int num = input.nextInt();
	river riv = new river(num);
	
	blackjack bj = new blackjack(riv);

	String c = "y";

	while( c.equals("y") )
	{
		int x = bj.main();

		if( x<21 && x!=0)
		{
		
			int y = bj.playdealer();			
			if(y!=0)
		
				if(x > y)
					bj.moneys("win");	
				else if (x < y)
					bj.moneys("loss");
				else
					System.out.println("isopalia");
			else
				bj.moneys("win");
		}
		else if (x == 21)
			bj.moneys("win");
		else if ( x==0)
			bj.moneys("loss");

		if(riv.left<15)
			riv.start();
	System.out.println("8es na 3anapai3eis?(y/n)");
	c = input.next();
	}
	
	
	}	
}	