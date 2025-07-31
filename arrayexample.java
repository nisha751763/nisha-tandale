import java.io.*;
public class arrayexample{
 public static void main( String args[]){
int sum=0;
int arr[]={ 10,45,67,10,45,7};
for(int i=0;i<arr.length;i++){
   System.out.println(arr[i]);
    sum=sum+arr[i];

}
System.out.println("the sum of array is" + sum);
}
}