package lab5.Lab5Part1;

import java.util.List;

public class DataAnalysis {
	
	List<Double> numbers;
	SortingService sortingService;
	
	public DataAnalysis(List<Double> numbers, SortingService sortingService) {
		this.numbers = numbers;
		this.sortingService = sortingService;
	}
	
	public void setSortingService(SortingService sortingService) {
		this.sortingService = sortingService;
	}
	
	public double sum() {
		double sum = 0;
		for(double number:numbers)
			sum += number;
		return sum;
	}
	
	public double average() {
		if(numbers.size() != 0)
			return sum()/numbers.size();
		else
			throw new RuntimeException("List is empty");
	}
	
	public double median() {
		if(numbers.size() != 0) {
			List<Double> sorted = sortingService.sort(numbers);
			int N = sorted.size();
			if(N%2 == 1)
				return sorted.get(N/2);
			else
				return (sorted.get(N/2) + sorted.get(N/2 - 1))/2;
		}
		else
			throw new RuntimeException("List is empty");
	}

}
