int a=2;
int b=5;
public static int pow(int a,int b){
  if(b==0)
  {
    return 1;
  }
  int ans=pow(a,b/2);
  ans=ans*ans;
  if(b%2!=0){
    ans*=a;
  }
  return ans;
}
