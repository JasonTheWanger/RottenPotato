
public class RottenPotato {
	//movies
	private final int MORBIUS = 0;
	private final int WAKANDA_FOREVER = 1;
	private final int AMSTERDAM = 2;
	private final int LOVE_AND_THUNDER = 3;
	//reviewers
	private final int DWIGHT = 0;
	private final int MICHAEL = 1;
	private final int PAM = 2;
	
	public RottenPotato() {
		
	}
	public double movieAvgRating(int[][] ratings, int movie) {
		double sum=0.0;
		int count=0;
		for(int i=0; i<ratings.length; i++) {
			sum+=ratings[i][movie];
			count++;
		}
		return (sum/count);
	}
	public double reviewerAvgRating(int[][] ratings, int reviewer) {
		double sum=0.0;
		int count=0;
		for(int i=0; i<ratings[reviewer].length; i++) {
			sum+=ratings[reviewer][i];
			count++;
		}
		return (sum/count);
	}
	public double avgRating2022(int[][] ratings) {
		double sum=0.0;
		int count=0;
		for(int i=0; i<ratings.length; i++) {
			for(int c=0; c<ratings[i].length; c++) {
			sum+=ratings[i][c];
			count++;
			}
		}
		return (sum/count);
	}
	public int hardestRater2022(int[][] ratings) {
		double min = Double.MAX_VALUE;
		int index=0;
		for(int i=0; i<ratings.length; i++) {
		if(reviewerAvgRating(ratings, i)<min) {
			min=reviewerAvgRating(ratings, i);
			index=i;
			}
		}
		return index;
	}
	public int worstMovie2022(int[][] ratings) {
		double min = Double.MAX_VALUE;
		int index=0;
		for(int i=0; i<ratings[0].length; i++) {
		if(movieAvgRating(ratings, i)<min) {
			min=movieAvgRating(ratings, i);
			index=i;
			}
		}
		return index;
	}
	public boolean isFresh(int[][] ratings, int movie) {
		if(movieAvgRating(ratings, movie)>avgRating2022(ratings))
			return true;
		else
			return false;
	}

}
