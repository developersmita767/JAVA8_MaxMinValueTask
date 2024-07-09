package Java8_Task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

public class MaxMinValueTask5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numbers=new ArrayList<>(Arrays.asList(2,3,6,8,1,7,9,3,2));
		Optional<Integer> max=numbers.stream().max(Integer::compareTo);
		Optional<Integer> min=numbers.stream().min(Integer::compareTo);
		
		System.out.println("list of numbers"+numbers);
		System.out.println("maximum numbers"+ max);
		System.out.println("minimum numbers"+ min);
		
		
		


	}

}
