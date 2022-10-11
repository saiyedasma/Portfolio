package ca.sheridancollege.saiyedas.beans;

import java.util.Objects;

public class Course {
	private Long id;

	@Override
	public int hashCode() {
		return Objects.hash(code, id, name, prefix);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		return code == other.code && Objects.equals(id, other.id) && Objects.equals(name, other.name)
				&& Objects.equals(prefix, other.prefix);
	}

	private String prefix;
	private int code;
	private String name;

	public Course(Long id, String prefix, int code, String name) {
		super();
		this.id = id;
		this.prefix = prefix;
		this.code = code;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", prefix=" + prefix + ", code=" + code + ", name=" + name + "]";
	}

	public Course() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
