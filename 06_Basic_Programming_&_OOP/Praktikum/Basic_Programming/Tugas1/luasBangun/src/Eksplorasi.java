class Eksplorasi {
	public static void encrypt(String s) {

		String[] huruf = new String[26];
		int key = 10;

        for (char c = 'A'; c <= 'Z'; c++)
            huruf[c - 65] = String.valueOf(c);

		//TODO: complete this code
		String chiper = "";
        loop1: for (int a = 0; a < s.length(); a++) {
            int index_plain = -1;
            for (int b = 0; b < huruf.length; b++) {
                index_plain = (String.valueOf(s.charAt(a)).equals(huruf[b])) ? b : -1;
                if (index_plain != -1) {
                    chiper += huruf[(index_plain + key) % 26];
                    continue loop1;
                }
            }
            chiper += s.charAt(a);
        }

        System.out.println("Hasilnya adalah : " + chiper);
        
	}

	public static void main(String[] args) {
		encrypt("SEPULSA OKE");
		encrypt("ALTERRA ACADEMY");
		encrypt("INDONESIAE");
		encrypt("GOLANG");
		encrypt("PROGRAMMER");
		// System.out.println(encrypt("SEPULSA OKE")); // COZEVCK YUO
		// System.out.println(encrypt("ALTERRA ACADEMY")); // KVDOBBK KMKNOWI
		// System.out.println(encrypt("INDONESIA")); // SXNYXOCSK
		// System.out.println(encrypt("GOLANG")); // QYVKXQ
		// System.out.println(encrypt("PROGRAMMER")); // ZBYQBKWWOB
	}
}