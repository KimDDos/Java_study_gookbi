package day19;

import java.util.Objects;

public class Word implements Comparable{
	/* 단어, 의미
	 * 정렬 => Comparator
	 * 기존클래서 + Comparable
	 * 정렬(equals 비고하여 정렬)
	 * 어떤 값을 기준으로 정렬?
	 * */
	private String word;
	private String mean;
	
	public Word(String word, String mean) {
		this.word=word;
		this.mean=mean;
	}
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public String getMean() {
		return mean;
	}
	public void setMean(String mean) {
		this.mean = mean;
	}
	@Override
	public String toString() {
		return word + ":" + mean;
	}
	@Override
	public int hashCode() {
		return Objects.hash(mean, word);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Word other = (Word) obj;
		return Objects.equals(mean, other.mean) && Objects.equals(word, other.word);
	}
	@Override
	public int compareTo(Object o) {
		Word word = (Word)o;
		return this.word.compareTo(word.word);
	}
	
}
