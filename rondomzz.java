import java.util.Arrays;
import java.util.Scanner;
import java.util.LinkedList;
import java.lang.*;
import java.io.*;

public class rondomzz <T>{
    public void rand1() {
        int len, minPos, maxPos, temp;
        System.out.println("enter the length of array : ");
        try (Scanner scan = new Scanner(System.in)) {
            len = scan.nextInt();
            int[] arr = new int[len];
            minPos = 0;
            maxPos = 0;
            for(int i = 0; i < len; i++){
                System.out.println("enter the value : ");
                int ele = scan.nextInt();
                arr[i] = ele;
                if(ele > arr[maxPos]){
                    maxPos = i;
                }
                if(ele < arr[minPos]){
                    minPos = i;
                }
            }
            temp = arr[minPos];
            arr[minPos] = arr[maxPos];
            arr[maxPos] = temp;
            System.out.print(Arrays.toString(arr));
        }
    }
    T data;
    public rondomzz(T data){
        this.data = data;
    }
    public void print(){
        System.out.println(this.data);
    }
    public static void main(String[] args) {
        rondomzz<String> obj = new rondomzz<>("my data");
        obj.print();
    }
    
}
