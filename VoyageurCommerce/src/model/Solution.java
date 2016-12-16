package model;

import com.google.gson.JsonArray;

public class Solution {

  private List<Ville> Villes = new ArrayList<Ville>();
	private Double score = null;

	public Solution(List<Ville> Villes, Double score) {
		this.Villes = Villes;
		this.score = score;
	}

	public List<Ville> getVilles() {
		return Villes;
	}

	public void setVilles(List<Ville> Villes) {
		this.Villes = Villes;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Solution [Villes=" + Villes + ", score=" + score + "]";
	}

}
