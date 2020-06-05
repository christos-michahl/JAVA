import java.util.*;
public class BFS {
	

	public static void main(String args[]){
	
		int[] solution = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		int[] start    = {1,2,6,3,4,5,10,7,8,13,9,11,12,14,0,15};

		int[] moves = {0,0,0,0};
		List<Integer> stack  = new ArrayList<>();
		int position = 0;
		int numberofpaths = 0;
		
		int number=0;
		int flag = 1;
		int size;
		
		List<List<Integer>> list = new  ArrayList<List<Integer>>();

			List<Integer> node2 = new ArrayList<>();
			for(int j=0;j<16;j++)
			{
						
							node2.add(start[j]);
						
			}
			
			list.add(node2);

		   int listinputs=0;	
		    Scanner scanner = new Scanner(System.in);
					
					for(int i=0;i<16;i++)
						if(start[i]==0)
							position = i;

					
					int temp1,temp2;
					if((position + 4) < 16)
						{
						listinputs++;
					
						List<Integer> node11 = new ArrayList<>();
						for(int i=0;i<list.get(0).size();i++)
							node11.add(list.get(0).get(i));
						temp1 = start[position + 4];
						temp2 = start[position ];
						start[position + 4] = 0;
						start[position ] = temp1;

						if(solution[0]==start[0] && solution[1]==start[1] && solution[2]==start[2] && solution[3]==start[3] && solution[4]==start[4] && solution[5]==start[5] && solution[6]==start[6] && solution[7]==start[7] && solution[8]==start[8] && solution[9]==start[9]  &&  solution[10]==start[10] && solution[11]==start[11] && solution[12]==start[12] && solution[13]==start[13] && solution[14]==start[14] && solution[15]==start[15])
						{	
						
							System.out.print(" done ");
							flag=2;

						}
						number += 1 ;

						for(int j=0;j<16;j++){
							node11.add(start[j]);
						
					
							}
							
							list.add(node11);

					
						start[position + 4]=temp1;
						start[position ] = temp2;

						}
					 if((position-4)>=0 && flag!=2)
						{
						listinputs++;
						List<Integer> node12 = new ArrayList<>();
						for(int i=0;i<list.get(0).size();i++)
							node12.add(list.get(0).get(i));
						temp1 = start[position - 4];
						temp2 = start[position ];
						start[position - 4] = 0;
						start[position ] = temp1;

						if(solution[0]==start[0] && solution[1]==start[1] && solution[2]==start[2] && solution[3]==start[3] && solution[4]==start[4] && solution[5]==start[5] && solution[6]==start[6] && solution[7]==start[7] && solution[8]==start[8] && solution[9]==start[9]  &&  solution[10]==start[10] && solution[11]==start[11] && solution[12]==start[12] && solution[13]==start[13] && solution[14]==start[14] && solution[15]==start[15])
						{	
						
							System.out.print(" done ");
							flag=2;

							
						}
						number += 1;
	
						for(int j=0;j<16;j++){
							node12.add(start[j]);
								}				
						for(int j=0;j<node12.size();j++)								
							list.add(node12);
						
					
						
						start[position - 4]=temp1;
						start[position ] = temp2;

					

					}
					
					 if(position%4!= 0  && position!=0  && flag!=2)
						{

						listinputs++;
						List<Integer> node13 = new ArrayList<>();
						for(int i=0;i<list.get(0).size();i++)
							node13.add(list.get(0).get(i));
						

						temp1 = start[position - 1];
						temp2 = start[position ];
						start[position - 1] = 0;
						start[position ] = temp1;
			
						if(solution[0]==start[0] && solution[1]==start[1] && solution[2]==start[2] && solution[3]==start[3] && solution[4]==start[4] && solution[5]==start[5] && solution[6]==start[6] && solution[7]==start[7] && solution[8]==start[8] && solution[9]==start[9]  &&  solution[10]==start[10] && solution[11]==start[11] && solution[12]==start[12] && solution[13]==start[13] && solution[14]==start[14] && solution[15]==start[15])
						{	
						
							System.out.print(" done ");
							flag=2;

							
						}
						number+= 1 ;
					
						for(int j=0;j<16;j++){
							node13.add(start[j]);

							}

							list.add(node13);


						start[position - 1]=temp1;
						start[position ] = temp2;

						}
					
					if((position-3) % 4 != 0 && (position-3)!=0 && flag!=2 )
						{	
						listinputs++;
						List<Integer> node14 = new ArrayList<>();
						for(int i=0;i<list.get(0).size();i++)
							node14.add(list.get(0).get(i));
						temp1 = start[position + 1];
						temp2 = start[position ];
						start[position + 1] = 0;
						start[position ] = temp1;

						if(solution[0]==start[0] && solution[1]==start[1] && solution[2]==start[2] && solution[3]==start[3] && solution[4]==start[4] && solution[5]==start[5] && solution[6]==start[6] && solution[7]==start[7] && solution[8]==start[8] && solution[9]==start[9]  &&  solution[10]==start[10] && solution[11]==start[11] && solution[12]==start[12] && solution[13]==start[13] && solution[14]==start[14] && solution[15]==start[15])
						{	
						
							System.out.print(" done ");
							flag=2;

							
						}
						number += 1;
					
						for(int j=0;j<16;j++){
							node14.add(start[j]);
							}
						for(int j=0;j<node14.size();j++)
							list.add(node14);
							
				
						start[position + 1]=temp1;
						start[position ] = temp2;

						
						}

			stack.add(number);
			moves[0]=number;
				int total;
				total = number;
					number=0;
					int s;

		while(flag<2){
		s=stack.get(0);
		stack.remove(0);

		for(int t=0;t<s;t++)
			{		List<Integer> node1 = new ArrayList<>();
				for(int i=0;i<list.get(listinputs+1-total+t).size();i++)
					node1.add(list.get(listinputs+1-total+t).get(i));
					
				for(int i=0;i<16;i++)
					start[i]=node1.get(node1.size()-16+i);

					
					for(int i=0;i<16;i++)
						if(start[i]==0)
							position = i;
							   

		
		
					
					
					 
					if((position + 4) < 16  && flag!=2)
						{
						temp1 = start[position + 4];
						temp2 = start[position ];
						start[position + 4] = 0;
						start[position ] = temp1;

						if(solution[0]==start[0] && solution[1]==start[1] && solution[2]==start[2] && solution[3]==start[3] && solution[4]==start[4] && solution[5]==start[5] && solution[6]==start[6] && solution[7]==start[7] && solution[8]==start[8] && solution[9]==start[9]  &&  solution[10]==start[10] && solution[11]==start[11] && solution[12]==start[12] && solution[13]==start[13] && solution[14]==start[14] && solution[15]==start[15])
						{	
						
							System.out.print(" done ");
							flag=2;

						}
						number += 1 ;
						List<Integer> node = new ArrayList<>();
						for(int j=0;j<node1.size();j++)
							node.add(node1.get(j));
						for(int j=0;j<16;j++)
							node.add(start[j]);
						list.add(node);
						start[position + 4]=temp1;
						start[position ] = temp2;

						}
					 if((position-4)>=0 && flag!=2)
						{
						temp1 = start[position - 4];
						temp2 = start[position ];
						start[position - 4] = 0;
						start[position ] = temp1;

						if(solution[0]==start[0] && solution[1]==start[1] && solution[2]==start[2] && solution[3]==start[3] && solution[4]==start[4] && solution[5]==start[5] && solution[6]==start[6] && solution[7]==start[7] && solution[8]==start[8] && solution[9]==start[9]  &&  solution[10]==start[10] && solution[11]==start[11] && solution[12]==start[12] && solution[13]==start[13] && solution[14]==start[14] && solution[15]==start[15])
						{	
						
							System.out.print(" done ");
							flag=2;

						}
						number += 1;
						List<Integer> node = new ArrayList<>();
												for(int j=0;j<node1.size();j++)
							node.add(node1.get(j));
						for(int j=0;j<16;j++)
							node.add(start[j]);
						list.add(node);
						
						start[position - 4]=temp1;
						start[position ] = temp2;

						}
					
					 if(position%4!= 0  && position!=0 && flag!=2)
						{
						temp1 = start[position - 1];
						temp2 = start[position ];
						start[position - 1] = 0;
						start[position ] = temp1;
					
						if(solution[0]==start[0] && solution[1]==start[1] && solution[2]==start[2] && solution[3]==start[3] && solution[4]==start[4] && solution[5]==start[5] && solution[6]==start[6] && solution[7]==start[7] && solution[8]==start[8] && solution[9]==start[9]  &&  solution[10]==start[10] && solution[11]==start[11] && solution[12]==start[12] && solution[13]==start[13] && solution[14]==start[14] && solution[15]==start[15])
						{	
						
							System.out.print(" done ");
							flag=2;

						}
						number+= 1 ;
						List<Integer> node = new ArrayList<>();
												for(int j=0;j<node1.size();j++)
							node.add(node1.get(j));
						for(int j=0;j<16;j++)
							node.add(start[j]);
						list.add(node);

						
						start[position - 1]=temp1;
						start[position ] = temp2;

						}
					
					if((position-3) % 4 != 0  && flag!=2)
						{
						temp1 = start[position + 1];
						temp2 = start[position ];
						start[position + 1] = 0;
						start[position ] = temp1;

						if(solution[0]==start[0] && solution[1]==start[1] && solution[2]==start[2] && solution[3]==start[3] && solution[4]==start[4] && solution[5]==start[5] && solution[6]==start[6] && solution[7]==start[7] && solution[8]==start[8] && solution[9]==start[9]  &&  solution[10]==start[10] && solution[11]==start[11] && solution[12]==start[12] && solution[13]==start[13] && solution[14]==start[14] && solution[15]==start[15])
						{	
						
							System.out.print(" done ");
							flag=2;
						

						}
						number += 1;
						List<Integer> node = new ArrayList<>();
												for(int j=0;j<node1.size();j++)
							node.add(node1.get(j));
						for(int j=0;j<16;j++)
							node.add(start[j]);
						list.add(node);
						start[position + 1]=temp1;
						start[position ] = temp2;

						
						}


	
if(flag==2)
	break;
			stack.add(number);
			listinputs+=number;
			total +=number;
			number=0;
			}
			total=total-s;
		}
		List<Integer> node = new ArrayList<>();
		for(int i=0;i<list.get(list.size()-1).size();i++)
		node.add(list.get(list.size()-1).get(i));
	if(flag==2)
	for(int i=0;i<node.size();i++)
	{
		if(i%4==0)
		System.out.print("\n");
		if(i%16==0){
		System.out.print("--------------------------------------------------------\n");
		System.out.print("--------------------------------------------------------\n");
		}
		System.out.printf("%d  " ,node.get(i));
	}
	
	}
	}


