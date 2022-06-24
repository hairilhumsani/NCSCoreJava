package task;

public class StringTask {
	private String employees[] = { "101001011", "102001022", "103002011", "104003080", "105002020", "106002080" };

	public String[] getEmployeeCodes() {

		String codes[] = new String[employees.length];
		int count = -1;
		for (String empid : employees) {
			codes[++count] = empid.substring(0, 3);
		}

		return codes;
	}

	public String[] getEmployeeCityCode() {
		String codes[] = new String[employees.length];
		int count = -1;
		for (String cityCode : employees) {

			codes[++count] = cities(cityCode.substring(6, 9));
		}

		return codes;
	}

	public String cities(String cityCode) {
		switch (cityCode) {
		case "011":
			return "Delhi";
		case "022":
			return "Mumbai";
		case "080":
			return "Bangalore";
		case "020":
			return "Pune";
		default:
			return "";

		}

	}

	public static void main(String[] args) {

		StringTask service = new StringTask();
		String codes[] = service.getEmployeeCodes();
		String city[] = service.getEmployeeCityCode();

		for (int i = 0; i < codes.length; i++) {
			System.out.println(codes[i] + " : " + city[i]);

		}

	}
}
