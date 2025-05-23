
class main{
public static void main(String[] args){
int n=2
int[] a=new int[n];
a={5,8,2,6,3,7};
for(int i=0;i<n;i++){
System.out.print(a[i]+" ");
}
int max1=0;
int max2=0;
for(int i=0;i<n;i++){
if(a[i]>max1){
max1=a[i];
}
if(a[i]<max1 && a[i]>max2){
max2=a[i];
}
}
System.out.println(max2);
}
}
