#include<stdio.h>
int main()
{
	int a,*b,**c,***d,****e;
	a=10;
	b=&a;
	c=&b;
	d=&c;
	e=&d;
	printf("\na=%d b=%u c=%u d=%u e=%u",a,b,c,d,e);
	printf("\n%d%d%d",a,a+*b,**c+***d+****e);
}
