package test;

public class StringCalc {

	int add(String numbers) {
		int nSum = 0;
		if(numbers != null && !"".equals(numbers)){
			numbers = formatString(numbers);
			String[] numArray = numbers.split(",");
			for(String num : numArray) {
				nSum = nSum + Integer.parseInt(num);
			}
		}
		return nSum;
	}

	private String formatString(String numbers) {
		numbers = numbers.replace("\n",",");
		return numbers;
	}
}
