package stack;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class StackArrayImplementation {
	
	static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2){
        int[] a = new int[3];
        int[] b = new int[3];
        int[] result = new int[2];
        int i;
        int alice = 0, bob = 0;
        
        a[0] = a0;
        a[1] = a1;
        a[2] = a2;
        
        b[0] = b0;
        b[1] = b1;
        b[2] = b2;
        
        for(i = 0; i < a.length; i++) {
        	if(a[i] > b[i]) {
                alice++;
            } else if(b[i] > a[i]) {
                bob++;
            }
        }
        
        result[0] = alice;
        result[1] = bob;
        
        return result;
    }

	public static void main(String[] args) throws Exception {
		
		/*StackArray<Integer> tab = new StackArray<Integer>(5);
		
		tab.push(1);
		tab.push(2);
		tab.push(3);
		tab.push(4);
		tab.push(5);
		
		while (!tab.isEmpty()) {
			System.out.println(tab.pop());
		}*/
		
		/*StackDArray<Integer> st = new StackDArray<Integer>(2);
		
		st.push(5);
		st.push(5);
		st.push(5);
		st.push(5);
		st.push(5);
		st.push(5);
		st.pop();
		st.pop();
		st.pop();
		System.out.println(st.getSize());*/
		
		StackLinkedList<String> stll = new StackLinkedList<String>();
		
		stll.push("a");
		stll.push("b");
		stll.push("c");
		
		stll.display();
		
		stll.pop();
		
		stll.display();
		
		stll.pop();
		stll.pop();
		stll.pop();
		
	}

}
