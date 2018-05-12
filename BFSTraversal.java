import java.util.Queue;
import java.util.Scanner;



class Que{
	int a[];
	int front,rear;
  
	Que(){
		a=new int[7];
		front=rear=-1;
	}
	Que(int size){
		a=new int[size];
		front=rear=-1;
	}
	void insert(int n){
		if(rear==a.length-1){
			System.out.println("Queue OverFlow");
		}
		else{
			rear++;
			a[rear]=n;
			if(front==-1){
				front=0;
			}
		}
	}
	int del(){
		int n=a[front];
		if(front==rear){
			front=rear=-1;
		}
		else{
			front++;
		}
		return n;
	}
	boolean empty(){
		if(front==-1)  return true;
		else return false;
	}
}

class GraphBFS{
	int  v,u;
	Scanner scan=new Scanner(System.in);
	Que q=new Que();
	
	GraphBFS(){
		System.out.println("\n Enter The No. Vertices And Edges->");
		v=scan.nextInt();
		u=scan.nextInt();
	}
	int []g[]=new int[9][9];
	int []visited=new int[9];
	
	void creategraph(){
		int i,j,a,b;
		for(i=1;i<=v;i++){
			for(j=1;j<=v;j++){
				g[i][j]=0;
			}
		}
		for(i=1;i<=u;i++){
			System.out.println("\n Enter the Pair Of Edeg->");
			a=scan.nextInt();
			b=scan.nextInt();
			g[a][b]=g[b][a]=1;
		}
	    for(i=1;i<=v;i++){
			for(j=1;j<=v;j++){
				System.out.print(" "+g[i][j]);
			}
			System.out.println();
		}
	}
	void callbfs(){
		for(int i=1;i<=v;i++){
			visited[i]=0;
		}
		bfs(2);
	}
	void bfs(int k){
		q.insert(k);
		visited[k]=1;
		System.out.println(" Vertex="+k);
		while(!q.empty()){
			k=q.del();
			for(int i=1;i<=v;i++){
				if(g[i][k]!=0 && visited[i]!=1){
					q.insert(i);
					visited[i]=1;
					System.out.print(""+i);
				}
			}
		}
		System.out.println();
		for(int i=1;i<=v;i++){
			System.out.print(" "+visited[i]);
		}
	}
};


public class BFSTraversal 
{
	public static void main(String[] args) 
	{
		 GraphBFS g=new GraphBFS();
	  	 g.creategraph();
	  	 g.callbfs();
	}

}
