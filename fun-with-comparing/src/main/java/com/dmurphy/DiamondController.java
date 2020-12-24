package com.dmurphy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dmurphy.comparators.CaratComparator;
import com.dmurphy.comparators.ClarityComparator;
import com.dmurphy.comparators.ColorComparator;

@RestController
public class DiamondController {

	private ArrayList<Diamond> generateDiamonds(Comparator<Diamond> comparator) {
		ArrayList<Diamond> list = new ArrayList<Diamond>();
		Random rand = new Random();
		
		for(int i = 0; i < 10; i++) {
			Clarity clarity = Clarity.getClarityByRank(rand.nextInt(3) + 1);
			char color = (char)(rand.nextInt(26) + 'a');
			double carat = rand.nextDouble();
			
			Diamond diamond = new Diamond(clarity, color, carat);
			list.add(diamond);
		}
		
		Collections.sort(list, comparator);
		return list;
	}
	
	@GetMapping("/sortClarity")
	public ArrayList<Diamond> sortClarity() {
		ClarityComparator comparator = new ClarityComparator();
		return generateDiamonds(comparator);
	}
	
	@GetMapping("/sortColor")
	public List<Diamond> sortColor() {
		ColorComparator comparator = new ColorComparator();
		return generateDiamonds(comparator);
	}
	
	@GetMapping("/sortCarat")
	public List<Diamond> sortCarat() {
		CaratComparator comparator = new CaratComparator();
		return generateDiamonds(comparator);
	}
}
