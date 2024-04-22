public class APLine
{
  int a;
    int b;
    int c;
  public APLine(int ai, int bi, int ci){
  a=ai;
    b=bi;
    c=ci;
  }

  public double getSlope(){
  return (-1*a)/b;
  }
   public boolean isOnLine(int x, int y){
  if((a*x)+(b*y)+c==0){
  return true;

  }
return false;
   }



  
  }
  
}
