import java.io.*;
import java.util.*;

public class Descending{

public static void main(String args[]){
int arr[]={5,9,4,1,2,4,1};
for(int i=0;i<arr.length;i++){
for(int j=i+1;j<arr.length;j++){
if(arr[i]<arr[j]){
int temp=arr[i];
arr[i]=arr[j];
arr[i]=temp;
}

}
 System.out.println("arr[i]");

}

}
}