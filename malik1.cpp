#include<stdio.h>
int main()
{
	char c='A';
	int i=10;
	float f=3.142;
	
	char*cc;
	int*ii;
	float*ff;
	
	cc=&c;
	ii=&i;
	ff=&f;
	
	printf("\n cc=%u",cc);
	printf("\n ii=%u",ii);
	printf("\n ff=%u",ff);
	printf("\n%u",*cc);
	printf("\n%u",*ii);
	printf("\n%u",*ff);
}
