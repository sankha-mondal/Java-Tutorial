package com.repository;

import com.model.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

@Repository
public class UserRepository {
	private final JdbcTemplate jdbc;

	public UserRepository(JdbcTemplate jdbc) {
		this.jdbc = jdbc;
	}

	private final RowMapper<User> userRowMapper = (rs, rowNum) -> mapRow(rs);

	private User mapRow(ResultSet rs) throws SQLException {
		User u = new User();
		u.setId(rs.getLong("id"));
		u.setUsername(rs.getString("username"));
		u.setEmail(rs.getString("email"));

		return u;
	}

	public List<User> findAll() {
		return jdbc.query("SELECT * FROM users", userRowMapper);
	}

	public Optional<User> findById(Long id) {
		List<User> list = jdbc.query("SELECT * FROM users WHERE id = ?", userRowMapper, id);
		return list.stream().findFirst();
	}

	public int save(User user) {
		// returns rows affected
		return jdbc.update("INSERT INTO users(username, email) VALUES (?, ?)", user.getUsername(), user.getEmail());
	}

	public int update(Long id, User user) {
		return jdbc.update("UPDATE users SET username = ?, email = ? WHERE id = ?", user.getUsername(), user.getEmail(),
				id);
	}

	public int delete(Long id) {
		return jdbc.update("DELETE FROM users WHERE id = ?", id);
	}
}