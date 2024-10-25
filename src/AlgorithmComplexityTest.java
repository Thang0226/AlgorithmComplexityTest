import java.util.Scanner;

public class AlgorithmComplexityTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string:");
		String inputString = scanner.nextLine();

		int[] frequentChar = new int[255];                         //{1}
		for (int i = 0; i < inputString.length(); i++) {           //{2}
			/* Tìm ví trí tương ứng của ký tự trong bảng ASCII (0-255) */
			int ascii = (int) inputString.charAt(i);               //{3}
			/* Tăng giá trị tần suất xuất hiện của ký tự */
			frequentChar[ascii] += 1;                              //{4}
		}

		int max = 0;                                             //{5}
		char character = (char) 255; /* empty character */      //{6}
		for (int j = 0; j < 255; j++) {                         //{7}
			if (frequentChar[j] > max) {                        //{8}
				max = frequentChar[j];                          //{9}
				character = (char) j;                           //{10}
			}
		}
		System.out.println("The most appearing letter is '" + character + "' with a frequency of " + max + " times");
	}
}

/**
 * Đánh giá độ phức tạp thuật toán
 *
 * - Được tính bằng thời gian thực hiện lâu nhất (số phép tính thực hiện nhiều nhất) của
 * các câu lệnh {1}, {2}, {5}, {6}, {7} (câu lệnh {2} và {7} là các câu lệnh lặp)
 *
 * - Khi n (độ dài string nhập vào) <= 255, vòng lặp ở câu lệnh {7} được gọi nhiều nhất và T(n) = O(255)
 *
 * - Khi n > 255, vòng lặp ở câu lệnh {2} được gọi nhiều nhất và T(n) = O(n)
 */
