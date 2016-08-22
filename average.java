import java.util.*;
class avg
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b[]=new int[a];
for(int i=0;i<a;i++)
{
b[i]=sc.nextInt();
}
if(a%2==0)
{
int c=a/2;
int d=a-c;
int sum=0;
int sum1=0;
for(int j=0;j<c;j++)
{
sum=sum+b[j];
}
sum=sum/c;

for(int k=c;k<a;k++)
{
sum1=sum1+b[k];
}
sum1=sum1/d;
if(sum==sum1)
System.out.println("avg balanced");
else
System.out.println("not possible");
}
else
{
int c=a/2;

int d=a-c;
int sum=0;
int sum1=0;
int sum2=0;int sum3=0;
for(int j=0;j<c;j++)
{
sum=sum+b[j];
}

int a1=sum/c;

for(int k=c;k<a;k++)
{
sum1=sum1+b[k];
}

int b1=sum1/d;
for(int l=0;l<=c;l++)
{
sum2=sum2+b[l];
}

int a2=sum2/c+1;


for(int il=c+1;il<a;il++)
{
sum3=sum3+b[il];
}
int b2=sum3/d-1;

if(a1==b1||a2==b2)
System.out.println("avg balanced");
else
System.out.println("not possible");
}
}
}
