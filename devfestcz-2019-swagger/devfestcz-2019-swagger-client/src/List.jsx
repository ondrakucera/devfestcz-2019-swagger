import React, { useState, useEffect } from 'react';
import studentsApiClient from "./studentsApiClient";

const List = () => {
	const [students, setStudents] = useState([]);

	useEffect(() => {
		studentsApiClient.getStudents().then((students) => setStudents(students));
	}, []);

	return (
		<table border="1">
			<thead><tr><th>Name</th><th>Year</th><th/></tr></thead>
			<tbody>
			{students.map((student) => (
				<tr key={student.id}>
					<td>{student.firstName} {student.lastName}</td>
					<td>{student.year}</td>
					<td>
						<button onClick={(e) => {
							studentsApiClient.deleteStudent(student.id)
								.then(() => studentsApiClient.getStudents()
									.then((students) => setStudents(students)));
							e.preventDefault();
						}}>
							Delete
						</button>
					</td>
				</tr>
			))}
			</tbody>
		</table>
	);
};

export default List;
