import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

import casestudy.exceptions.InvalidCategryException;
import casestudy.model.Order;
import casestudy.service.IOrderService;

public class MainClass implements IOrderService, Comparable<Order> {

	Order order = new Order();
	Scanner sc = new Scanner(System.in);
	Scanner scString = new Scanner(System.in);

	public static void main(String[] args) {

		MainClass mc = new MainClass();

		while (true) {

			try {
				System.out.println("\n----------------------\n");
				System.out.println("Choose your options:");
				System.out.println("1. Get All Order By Category");
				System.out.println("2. Get Total Cost By Category");
				System.out.println("3. Get Cancelled Orders");
				System.out.println("4. Get Orders by Username");
				System.out.println("5. Filter orders by actions");
				System.out.println("6. Sort Order by cost");
				System.out.println("7. Generate PDF Report");

				int options = mc.sc.nextInt();

				switch (options) {
				case 1:
					System.out.println("Enter one of the category");
					System.out.println("cloths,shoes,electronics,grocery,pharma");
					String category = mc.scString.nextLine();
					List<Order> lists = mc.getAllOrdersByCategory(category);

					for (Order orders : lists) {
						System.out.println(orders);
					}
					break;

				case 2:

					System.out.println("Enter one of the category");
					System.out.println("cloths,shoes,electronics,grocery,pharma");
					String categoryForCost = mc.scString.nextLine();
					int totalCost = mc.getTotalOrderCost(categoryForCost);

					System.out.println("The total values for " + categoryForCost + " is $" + totalCost);
					break;

				case 3:

					System.out.println("Getting Cancelled Orders");

					for (Order order : mc.getAllCanceledOrder()) {
						System.out.println(order);
					}

					break;

				case 4:

					System.out.println("Getting Orders by Username");
					Map<String, List<Order>> map = mc.createOrderMapByUser();

					for (Entry<String, List<Order>> entry : map.entrySet()) {
						System.out.print(entry + "\t" + entry.getKey() + "- " + entry.getValue() + "\n");
					}

					break;

				case 5:
					System.out.println("1. Order is delivered");
					System.out.println("2. Order is cancelled");

					int option = mc.sc.nextInt();

					switch (option) {
					case 1:
						for (Order order : mc.filterOrders("delivered")) {

							System.out.println(order);
						}
						break;

					case 2:
						for (Order order : mc.filterOrders("cancelled")) {

							System.out.println(order);
						}
						break;
					}

					break;

				case 6:

					System.out.println("Getting Order sort by cost");

					for (Order order : mc.getOrdersBasedOnOrderValue()) {
						System.out.println(order);
					}

					break;

				case 7:

					System.out.println("Generating Reports");

					if (mc.generatePDFReports()) {
						System.out.println("Report Generated");
					}

					break;
				}

			} catch (InvalidCategryException e) {

				e.getMsgForInvalidCategory();
			}

			// TODO Auto-generated method stub

		}
	}

	public List<Order> getCSVFile() {
		//Will get the csv file and turn into orderListClass to be use
		String filePath = "/Users/mh/Desktop/NCSCoreJava/CaseStudy_CoreJava/Order.csv";
		List<Order> totalOrder = new ArrayList<>();

		int count = 0;
		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

			br.readLine(); // header
			String line;

			while ((line = br.readLine()) != null) {

				Order order = new Order();
				String[] values = line.split(",");
				try {

					String username = values[0];
					String category = values[1];
					int costOfOrder = Integer.parseInt(values[2]);
					String localDate = values[3];
					String actions = values[4];

					DateTimeFormatter df = new DateTimeFormatterBuilder()
							// case insensitive to parse JAN and FEB
							.parseCaseInsensitive()
							// add pattern
							.appendPattern("d-MMM-yy")
							// create formatter (use English Locale to parse month names)
							.toFormatter(Locale.ENGLISH);

					// DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
					LocalDate date = LocalDate.parse(localDate, df);

					order.setUsername(username);
					order.setCategory(category);
					order.setOrderCost(costOfOrder);
					order.setDateOfOrder(date);
					order.setAction(actions);

					totalOrder.add(order);

				} catch (NumberFormatException e) {
					System.out.println("Non-int");
				}

				count++;

			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		return totalOrder;

	}

	@Override
	public List<Order> getAllOrdersByCategory(String category) throws InvalidCategryException {
		List<Order> orderByCategory = new ArrayList<>();

		for (Order orders : getCSVFile()) {
			String test = orders.getCategory();
			if (test.equals(category)) {
				orderByCategory.add(orders);
			}

		}

		return orderByCategory;

	}

	@Override
	public int getTotalOrderCost(String category) throws InvalidCategryException {
		int totalCost = 0;

		for (Order orders : getCSVFile()) {
			String test = orders.getCategory();
			if (test.equals(category)) {
				if (orders.isAction().equals("delivered")) {
					totalCost = totalCost + orders.getOrderCost();
				}
			}

		}

		return totalCost;

		// TODO Auto-generated method stub
	}

	@Override
	public List<Order> getAllCanceledOrder() {
		List<Order> orderCancelled = new ArrayList<>();

		for (Order orders : getCSVFile()) {
			if (orders.isAction().equals("cancelled")) {
				orderCancelled.add(orders);
			}

		}

		return orderCancelled;
	}

	@Override
	public Map<String, List<Order>> createOrderMapByUser() {
		Map<String, List<Order>> toReturn = new HashMap<>();
		List<String> getUsernames = new ArrayList<>();

		// Get Usernames
		for (Order order : getCSVFile()) {
			if (!getUsernames.contains(order.getUsername())) {
				getUsernames.add(order.getUsername());
			}
		}

		for (String username : getUsernames) {
			List<Order> listOrder = new ArrayList<>();
			for (Order order : getCSVFile()) {
				if (order.getUsername().equals(username)) {
					listOrder.add(order);
				}

			}
			toReturn.put(username, listOrder);
		}
		// TODO Auto-generated method stub
		return toReturn;
	}

	@Override
	public List<Order> filterOrders(String action) {
		List<Order> toReturn = new ArrayList<>();
		for (Order order : getCSVFile()) {
			if (order.isAction().equals(action)) {

				toReturn.add(order);
			}
		}
		return toReturn;
	}

	@Override
	public List<Order> getOrdersBasedOnOrderValue() {

		List<Order> listOrder = new ArrayList<>();
		listOrder = getCSVFile();

		Order order = new Order();
		Collections.sort(listOrder, order);

		return listOrder;

		// TODO Auto-generated method stub;
	}

	@Override
	public boolean generatePDFReports() {
		boolean test = false;

		try (PDDocument document = new PDDocument()) {

			PDPage my_page = new PDPage();
			document.addPage(my_page);

			PDPageContentStream contentStream = new PDPageContentStream(document, my_page);

			contentStream.beginText();
			contentStream.setFont(PDType1Font.TIMES_ROMAN, 12);
			contentStream.newLineAtOffset(25, 700);
			contentStream.setLeading(14.5f);

			List<Order> listDelivered = filterOrders("delivered");
			List<Order> listCancelled = filterOrders("cancelled");

			String line = "-------------------------------------";

			String heading = "No.of Delivered      " + listDelivered.size();
			String heading2 = "No.of Cancelled      " + listCancelled.size();

			contentStream.showText(line);
			contentStream.newLine();
			contentStream.showText(heading);
			contentStream.newLine();
			contentStream.showText(line);
			contentStream.newLine();
			contentStream.showText(heading2);

			contentStream.endText();

			contentStream.close();
			document.save(new File("/Users/mh/Desktop/NCSCoreJava/CaseStudy_CoreJava/orderReport.pdf"));
			document.close();

			test = true;

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return test;
	}

	@Override
	public int compareTo(Order o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
