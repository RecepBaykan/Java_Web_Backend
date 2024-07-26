
public class LongestPalindrome {

	public static void main(String[] args) {

		String a = "busislnescsicxpvvysuqgcudefrfjbwwjcchtgqyajdfwvkypfwshnihjdztgmyuuljxgvhdiwphrweyfkbnjgerkmifbirubhseuhrugwrabnjafnbdfjnufdstjbkuwtnpflffaqmjbhssjlnqftgjiglvvequhapasarlkcvbmkwnkuvwktbgfoaxteprobdwswcdyddyvrehvmxrrjiiidatidlpihkbmmruysmhhsncmfdanafdrfpdtfgkglcqpwrrtvacuicohspkounojuziittugpqjyhhkwfnflozbispehrtrnizowrlzcuollagxwtznjwzcumvedjwokueuqktvvouwnsmpxqvvpuwprezrbobrpnwaccwljchdguubjulyilzvmandjjleitweybqkjttschrjjlebnmponvlktzzcdtuybugggcqffkcffpamauvxfbonjrobgpvlyzveiwemmtdvbjciaytvesnocnjrwodtcokgcuoiicxapmrzpkfphjniuvzjrhbnqndfshoduejyktebgdabidxlkstepuwvtrtgbxaeheylicvhrxddijshcvdadxzsccmainyfpfdhqdanfccqkzlmhsfilvoybqojlvbcixjzqpbngdvesuokbxhkomsiqfyukvspqthlzxdnlwthrgaxhtpjzhrugqbfokrdcyurivmzgtynoqfjbafboselxnfupnpqlryvlcxeksirvufepfwczosrrjpudbwqxwldgjyfjhzlzcojxyqjyxxiqvfhjdwtgoqbyeocffnyxhyyiqspnvrpxmrtcnviukrjvpavervvztoxajriuvxqveqsrttjqepvvahywuzwtmgyrzduxfqspeipimyoxmkadrvrdyefekjxcmsmzmtbugyckcbjsrymszftjyllfmoeoylzeahnrxlxpnlvlvzltwnmldi";
		String c = "aaabbbcccdddabadadaaha";
		long startTime = System.nanoTime();
		String b = longestPalindrome(a);
		long endTime = System.nanoTime();
		long duration = endTime - startTime;
		double milliseconds = (double) duration / 1_000_000;
		System.out.println("İşlem süresi: " + milliseconds + " milisaniye");
		System.out.println(longestPalindrome(c));

		if (a.substring(0, a.length()).equals(new StringBuilder(a.substring(0, a.length())).reverse().toString()

		)) {

			// System.out.println("Evet bu bir palindrome");
			// System.out.println(a.substring(0, a.length()));
		}

		// İndis değiştirici

		// i = 5
		// j =

	}

	

	public static String longestPalindrome(String s) {

		String palindrome = "";
		boolean isFind = false;

		for (int i = s.length(); i > 0; i--) {

			for (int j = 0; j <= s.length() - i; j++) {

				if (s.substring(j, i + j).equals(new StringBuilder(s.substring(j, i + j)).reverse().toString())

				) {

					palindrome = s.substring(j, i + j);
					isFind = true;
					break;

				}

			}

			if (isFind) {
				break;
			}

		}

		return palindrome;

	}

	public static String longestPalindrome3(String s) {

		if (s.isEmpty())
			return "";

		int n = s.length();
		char[] chars = s.toCharArray();
		System.out.println();
		int start = 0;
		int maxLength = 1;

		// Palindrome için başlangıç indeksini ve uzunluğunu bul
		for (int i = 1; i < n; ++i) {
			// İki taraftan simetriği kontrol et
			int low = i - 1;
			int high = i;
			while (low >= 0 && high < n && chars[low] == chars[high]) {
				if (high - low + 1 > maxLength) {
					start = low;
					maxLength = high - low + 1;
				}
				--low;
				++high;
			}

			low = i - 1;
			high = i + 1;
			while (low >= 0 && high < n && chars[low] == chars[high]) {
				if (high - low + 1 > maxLength) {
					start = low;
					maxLength = high - low + 1;
				}
				--low;
				++high;
			}
		}

		return s.substring(start, start + maxLength);

	}

	public static String longestPalindrome2(String s) {

		String palindrome = "";
		String a = "";
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {

			for (int j = i + palindrome.length(); j <= s.length(); j++) {

				a = s.substring(i, j);
				stringBuilder.setLength(0);

				if (a.equals(stringBuilder.append(a).reverse().toString()

				)) {

					palindrome = a;

				}

			}

		}

		return palindrome;
	}

}
