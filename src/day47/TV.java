package day47;

class Main {
public static int[] do_switch(int[] i) 
 {
   int temp=0;
for (int j=0; j<i.length; j++){
  i[0]=temp;
  i[0]=i[i.length-1];
  i[i.length-1]=temp;
  
}
return i;
	}
}