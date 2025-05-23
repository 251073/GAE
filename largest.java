class main{
public static void main(String[] args){
int n=5;
int[] a=new int[n];
a[0]=5; a[1]=8; a[2]=2; a[3]=7; a[4]=3;
for(int i=0;i<n;i++){
System.out.print(a[i]+" ");
}
int max1=0;
int max2=0;
for(int i=0;i<n;i++){
if(a[i]>max1){
max1=a[i];
}
else(a[i]<max1 && a[i]>max2){
max2=a[i];
}
}
System.out.println(max2);
}
}
