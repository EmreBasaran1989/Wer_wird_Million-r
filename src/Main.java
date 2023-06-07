import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int moneystatus = 0;

		boolean again = true;

		System.out.println("Willkommen bei WER WIRD MILLIONÄR!\n");
		// Frage 1
		System.out.println("250k EURO Frage:Zu welcher Tierart gehört die Schildkröte?");
		System.out.println("A(Vögel) B(Säugetiere) C(Reptilien) D(Wirbellose)");
		Scanner scan = new Scanner(System.in);
		System.out.println("Bitte Antwort A,B,C oder D eingeben.........");
		while (again = true) {
			char antwort = scan.next().charAt(0);
			if (antwort == 'C') {
				moneystatus += 250000;
				System.out.println("Deine Antwort ist Richtig! Dein Gewinn: " + moneystatus + " EURO\n");
				break;
			} else if (antwort == 'A' || antwort == 'B' || antwort == 'D') {
				System.out.println("Leider Falsch! Sie haben verloren!");
				System.exit(0);
			} else {
				System.out.println("Ungültige Eingabe! Bitte wiederholen Sie ihre Eingabe!\n");
				again = false;
				continue;
			}
		}

		// Frage 2
		System.out.println("500k EURO Frage: Was findet man in Autos gleichlaufend oder gegenläufig?");
		System.out.println("A(Rückbank) B(Schneeketten) C(Tankanzeige) D(Scheibenwischer)");
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Bitte Antwort A,B,C oder D eingeben.........");
		while (again = true) {
			char antwort1 = scan1.next().charAt(0);
			if (antwort1 == 'D') {
				moneystatus += 250000;
				System.out.println("Deine Antwort ist Richtig! Dein Gewinn: " + moneystatus + " EURO\n");
				break;
			} else if (antwort1 == 'A' || antwort1 == 'B' || antwort1 == 'C') {
				System.out.println("Leider Falsch! Sie haben verloren!");
				System.exit(0);
			} else {
				System.out.println("Ungültige Eingabe! Bitte wiederholen Sie ihre Eingabe!\n");
				again = false;
				continue;
			}
		}

		// Frage 3
		System.out.println("750k EURO Frage: Wobei besteht die oberste Schicht oft aus dem sogenannten Fondant?");
		System.out.println("A(Komposthaufen) B(Festtagstorte) C(Kaltschaummatratze) D(Straßenbelag)");
		Scanner scan2 = new Scanner(System.in);
		System.out.println("Bitte Antwort A,B,C oder D eingeben.........");
		while (again = true) {
			char antwort2 = scan2.next().charAt(0);
			if (antwort2 == 'B') {
				moneystatus += 250000;
				System.out.println("Deine Antwort ist Richtig! Dein Gewinn: " + moneystatus + " EURO\n");
				break;
			} else if (antwort2 == 'A' || antwort2 == 'C' || antwort2 == 'D') {
				System.out.println("Leider Falsch!");
				System.exit(0);
			} else {
				System.out.println("Ungültige Eingabe! Bitte wiederholen Sie ihre Eingabe!\n");
				again = false;
				continue;
			}
		}

		// Frage 4
		System.out.println("1 Mio EURO Frage: Welcher Buchstabe im Alphabet kam erst im Mittelalter hinzu?");
		System.out.println("A(Buchstabe W) B(Buchstabe D) C(Buchstabe C) D(Buchstabe V)");
		Scanner scan3 = new Scanner(System.in);
		System.out.println("Bitte Antwort A,B,C oder D eingeben.........");
		while (again = true) {
			char antwort3 = scan3.next().charAt(0);
			if (antwort3 == 'A') {
				moneystatus += 250000;
				System.out.println("Deine Antwort ist Richtig! Dein Gewinn: " + moneystatus + " EURO\n");
				System.out.println("Herzlichen Glückwunsch Sie sind jetzt Millionär!");
				System.exit(0);
			} else if (antwort3 == 'B' || antwort3 == 'C' || antwort3 == 'D') {
				System.out.println("Leider Falsch! Sie haben verloren!");
				System.exit(0);
			} else {
				System.out.println("Ungültige Eingabe! Bitte wiederholen Sie ihre Eingabe!\n");
				again = false;
				continue;

			}
		}

	}
}
