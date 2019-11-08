package ondra.domain;

public class StudentNotFoundException extends RuntimeException {

	private Long id;

	public StudentNotFoundException(Long id) {
		super(String.format("Student with id %s cannot be found", id));
		this.id = id;
	}

	public Long getId() {
		return id;
	}

}
