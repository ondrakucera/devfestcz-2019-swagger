import * as React from 'react';
import {useEffect, useState} from 'react';
import {StudentDto} from './restapi2';
import studentsApi from './studentsApi';

const List = () => {
	const [students, setStudents] = useState([] as StudentDto[]);

	useEffect(() => {
		studentsApi.getStudents().then((students) => setStudents(students));
	}, []);

	return (
		<table>
			<thead><tr><th>Name</th><th>Year</th><th/></tr></thead>
			<tbody>
			{students.map((student) => (
				<tr key={student.id}>
					<td>{student.firstName} {student.lastName}</td>
					<td>{student.year}</td>
					<td>
						<button onClick={(e) => {
							if (student.id) {
								studentsApi.deleteStudent(student.id)
									.then(() => studentsApi.getStudents()
										.then((students) => setStudents(students)));
								e.preventDefault();
							}
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
