import acm.program.ConsoleProgram;

public class SimpleJava extends ConsoleProgram {

	private static final int SENTINEL = 0;

	public void run() {
		println("Thisprogramfindsthetwolargestintegersina");
		println("list.  Enter values, one per line, using a "+ SENTINEL + " to");
		println("signaltheendofthelist.");
		int largest = -1;
		int secondLargest = -1;
		while (true) {
			int input = readInt(" ? ");
			if (input == SENTINEL) break;
			if (input > largest) {secondLargest = largest;largest = input;
			} else if (input > secondLargest) {
				secondLargest = input;
				}
			}
		println("The largest value" + largest);
		println("second largest" + secondLargest);}}