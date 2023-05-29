/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;


/**
 *
 * @author Jesus Alberto
 */
public class Zacapa {
    
public  int distance[] = new int[12];
public  int cost[][] = new int[12][12];

public static String[] Municipio = {"Zacapa","Estanzuela","Rio Hondo",
                                     "Gualán","Teculutan","Usumatlan",
                                     "Cabañas","San Diego","La Union","Huité"};
 int [][] Dist = {{0,8, 999, 999, 999, 999, 999, 999, 44, 25},
                            {8, 0, 6, 999, 999, 999, 999, 999, 999, 20 },
                            {999, 6, 0, 32, 17, 999, 999, 999, 999, 999},
                            {999, 999, 32, 0, 999, 999, 999, 999, 28, 999},
                            {999, 999, 17, 999, 0, 13, 999, 999, 999, 999},
                            {999, 999, 999, 999, 13, 0, 999, 999, 999, 999},
                            {999, 999, 999, 999,	999, 999, 0, 25, 88, 11},
                            {999, 999, 999, 999, 999, 999, 25, 0, 999, 999},
                            {44, 999, 999, 28, 999, 999, 88, 999, 0, 999},
                            {25, 20, 999, 999, 999, 999, 11, 999, 999, 0}};

    public void calc(int n,int s)
 {
  int flag[] = new int[n+1];
  int i,minpos=1,k,c,minimum;
  
  for(i=1;i<=n;i++)
  {  
      flag[i]=0; 
      this.distance[i]=this.cost[s][i]; 
  }
  c=2;
  while(c<=n)
  {
   minimum=99;
   for(k=1;k<=n;k++)
   { 
          if(this.distance[k]<minimum && flag[k]!=1)
       {
        minimum=this.distance[i];
        minpos=k;
       }
      } 
            flag[minpos]=1;
      c++;
      for(k=1;k<=n;k++){
       if(this.distance[minpos]+this.cost[minpos][k] <  this.distance[k] && flag[k]!=1 )
       this.distance[k]=this.distance[minpos]+this.cost[minpos][k];
   }   
  } 
  
 }
    public void impresion(int opcion){
        int nodes = 10;
  int source,i,j;

  Dijkstra d = new Dijkstra();

         
        for(i=1;i<=nodes;i++)
          for(j=1;j<=nodes;j++)
          {
            d.cost[i][j]= Dist[i-1][j-1];
            if(d.cost[i][j]==0)
              d.cost[i][j]=999;
          }
  source=opcion;
  
  d.calc(nodes,source);
  System.out.println("The Shortest Path from Source \t"+source+"\t to all other vertices are : \n");
        for(i=1;i<=nodes;i++)
          if(i!=source)
  System.out.println("Origen :"+source+ " " +Municipio[source-1]+"\t Destino :"+i+" "+Municipio[i-1]+"\t Mejor distancia :"
                       +d.distance[i]+" KM"+"\t");
        
    }
}
