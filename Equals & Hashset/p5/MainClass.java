package p5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MainClass {

	public static void main(String[] args) {
		Review r1 = new Review();
		r1.setComment("Hello");
		r1.setStarRating(5);

		Review r2 = new Review();
		r2.setComment("Bye");
		r2.setStarRating(3);

		Review r3 = new Review();
		r3.setComment("Hello");
		r3.setStarRating(5);

		Review r4 = new Review();
		r3.setComment("Hello");
		r3.setStarRating(5);

		Review r5 = new Review();
		r4.setComment("Bye");
		r4.setStarRating(3);

		List<Review> list1 = new ArrayList<>();
		list1.add(r1);
		list1.add(r2);
		list1.add(r3);
		list1.add(r4);
		list1.add(r5);

		Product p1 = new Product();
		p1.setLaunchDate(LocalDate.parse("2017-03-22"));
		p1.setPrice(8);
		p1.setReviews(list1);

		Review g1 = new Review();
		g1.setComment("Hello");
		g1.setStarRating(5);

		Review g2 = new Review();
		g2.setComment("Bye");
		g2.setStarRating(3);

		Review g3 = new Review();
		g3.setComment("Hello");
		g3.setStarRating(5);

		List<Review> list2 = new ArrayList<>();
		list2.add(g1);
		list2.add(g2);
		list2.add(g3);

		Product p2 = new Product();
		p2.setLaunchDate(LocalDate.parse("2018-03-23"));
		p2.setPrice(5);
		p2.setReviews(list2);

		Review f1 = new Review();
		f1.setComment("Hello");
		f1.setStarRating(5);

		Review f2 = new Review();
		f2.setComment("Bye");
		f2.setStarRating(3);

		List<Review> list3 = new ArrayList<>();
		list3.add(f1);
		list3.add(f2);

		Product p3 = new Product();
		p3.setLaunchDate(LocalDate.parse("2010-06-23"));
		p3.setPrice(10);
		p3.setReviews(list3);

		Set<Product> set = new TreeSet<>();
		set.add(p1);
		set.add(p2);
		set.add(p3);

		List<Product> lp1 = new ArrayList<>();
		lp1.addAll(set);
		// step 2:- create object of specific sorting class
		SortAccountByPrice sortNumber = new SortAccountByPrice();
		// step 3:- call sort operation
		Collections.sort(lp1, sortNumber);
		print(lp1, "Sort based on Price");

		List<Product> lp2 = new ArrayList<>();
		lp2.addAll(set);
		// step 2:- create object of specific sorting class
		SortByReviewCount count = new SortByReviewCount();
		// step 3:- call sort operation
		Collections.sort(lp2, count);
		print(lp2, "Sort based on Review count");

		List<Product> lp3 = new ArrayList<>();
		lp3.addAll(set);
		// step 2:- create object of specific sorting class
		SortByLaunchDate sortLd = new SortByLaunchDate();
		// step 3:- call sort operation
		Collections.sort(lp3, sortLd);
		print(lp3, "Sort based on LaunchDate");

		List<Product> lp4 = new ArrayList<>();
		lp4.addAll(set);
		for (Product pro : lp4) {
			SortByReviewRatings sortRw = new SortByReviewRatings();
			// step 3:- call sort operation
			Collections.sort(pro.getReviews(), sortRw);
			printReview(pro.getReviews(), "Sort based on ReviewRating");
		}
		// step 2:- create object of specific sorting class

	}

	public static void print(Collection<Product> collection, String tagLine) {
		System.out.println("\n-----" + tagLine + " -----\n");
		for (Product product : collection) {
			System.out.println(product);
		}
	}

	public static void printReview(Collection<Review> collection, String tagLine) {
		System.out.println("\n-----" + tagLine + " -----\n");
		for (Review review : collection) {
			System.out.println(review);
		}
	}

}

class SortAccountByPrice implements Comparator<Product> {
	@Override
	public int compare(Product p1, Product p2) {
		return p1.getPrice() - p2.getPrice();
	}
}

class SortByReviewRatings implements Comparator<Review> {
	@Override
	public int compare(Review r1, Review r2) {
		return r1.getStarRating() - r2.getStarRating();
	}
}

class SortByReviewCount implements Comparator<Product> {
	@Override
	public int compare(Product p1, Product p2) {
		return p1.getReviews().size() - p2.getReviews().size();
	}
}

class SortByLaunchDate implements Comparator<Product> {
	@Override
	public int compare(Product p1, Product p2) {
		return p1.getLaunchDate().compareTo(p2.getLaunchDate());
	}
}
