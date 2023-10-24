package gitdemo;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Coutn_String {

	public static void main(String[] args) {


		List<String> list=Arrays.asList("Ram","Ram","Ram","Sita","Sita","Sita Maa");
		
		System.out.println("Before the String"+list);
		
		Map<String, Long> map= list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(map);
		
		map.forEach((k,v)->{
			if(v>1) {
				System.out.println(k+" "+v);
			}
		});
	}

}
