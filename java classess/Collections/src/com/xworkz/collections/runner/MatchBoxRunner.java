package com.xworkz.collections.runner;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

import com.xworkz.collections.DTO.MatchBoxDTO;
import com.xworkz.collections.generic.MatchBox;

public class MatchBoxRunner {
	public static void main(String[] args) {

		// MatchBox<Double, String> matchBox = new MatchBox<>(20.50, "vg");

		Collection<MatchBoxDTO> collection = new LinkedList<MatchBoxDTO>();
		MatchBoxDTO match1 = null;
		MatchBoxDTO match2 = null;
		MatchBoxDTO match3 = null;
		MatchBoxDTO match4 = null;
		MatchBoxDTO match5 = null;
		collection.add(match1);
		collection.add(match2);
		collection.add(match3);
		collection.add(match4);
		collection.add(match5);

		
		System.out.println("isempty" + collection.isEmpty());
		collection.clear();
		Iterator<MatchBoxDTO> iterator=collection.iterator();
		while(iterator.hasNext())
		{
			MatchBoxDTO ref=iterator.next();
			System.out.println(ref);
		}
		

	}
}
