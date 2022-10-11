package ca.sheridancollege.saiyedas.database;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import ca.sheridancollege.saiyedas.beans.Review;

@Repository
public class DatabaseAccess {

	@Autowired

	private NamedParameterJdbcTemplate jdbc;

	public void insertReview(Review review) {

		MapSqlParameterSource namedParameters = new MapSqlParameterSource();

		String query = "INSERT INTO movieReview(name,reviews,reviewDate,reviewTime,StreaminService) VALUES(:name,:reviews,:reviewDate,:reviewTime,:StreaminService)";

		namedParameters.addValue("name", review.getName());
		namedParameters.addValue("reviews", review.getReviews());
		namedParameters.addValue("reviewDate", review.getReviewDate());
		namedParameters.addValue("reviewTime", review.getReviewTime());
		namedParameters.addValue("StreaminService", review.getStreaminService());

		int rowsAffected = jdbc.update(query, namedParameters);

		if (rowsAffected > 0)
			System.out.println("Inserted review with name" + review);
	}

	public List<Review> getReviewList() {
		MapSqlParameterSource namedParameters = new MapSqlParameterSource();

		String query = "SELECT * FROM movieReview";
		return jdbc.query(query, namedParameters, new BeanPropertyRowMapper<Review>(Review.class));
	}

}
