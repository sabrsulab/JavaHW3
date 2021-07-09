class recursiveMult
{
public static int mult(int x, int y)
{
  if(x==0)
    return 0;//returns 0 if x is 0
  if(y==0)
    return 0;//returns 0 if y is 0
  else
    return x + mult(x,y-1);//returns the multiplication if both x and y are not 0
}
public static void main(String[] args)
{
  int problem1 = mult(1,2);//provides x=1 and y=2 to mult
  System.out.println("1*2= " + problem1);
  
  int problem2 = mult(20,15);//provides x=20 and y=15 to mult
  System.out.println("20*15= " + problem2);
  
  int problem3 = mult(0, 3);//tests if condition for x in mult
  System.out.println("0*3= " + problem3);
  
  int problem4 = mult(1000, 0);//tests if condition for y in mult
  System.out.println("1000*0= " + problem4);
}//end main
}//end recursiveMult class