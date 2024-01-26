package Week03;

class Word {
	private String eng_word, kor_word; //영어 단어, 해석
	
	public Word() { this("NONE", "NONE");}
	public Word(String eng, String kor) {
		eng_word = eng;
		kor_word = kor;
	}
	public String getEng_word() {
		return eng_word;
	}
	public String getKor_word() {
		return kor_word;
	}
	
	public String toStrig() {
		return eng_word +" : "+ kor_word;
	}
}
