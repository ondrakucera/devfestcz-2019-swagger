import * as React from 'react';
import {useEffect, useState} from 'react';
import studentsApi from './studentsApi';
import {Link} from 'react-router-dom';
import {StudentDto} from './StudentDto';

const List = () => {
	const [students, setStudents] = useState([] as StudentDto[]);

	useEffect(() => {
		studentsApi.getStudents().then((students) => setStudents(students));
	}, []);

	return (
		<>
			<h1>Students</h1>
			<table className="table table-striped table-bordered">
				<thead>
				<tr>
					<th>Name</th>
					<th>Year</th>
					<th/>
				</tr>
				</thead>
				<tbody>
				{students.map((student) => (
					<tr key={student.id}>
						<td><Link to={'/students/' + student.id}>{student.firstName} {student.lastName}</Link></td>
						<td>{student.year}</td>
						<td>
							<button
								onClick={(e) => {
									e.preventDefault();
									if (student.id) {
										studentsApi.deleteStudent(student.id)
											.then(() => studentsApi.getStudents()
												.then((students) => setStudents(students)));
									}
								}}
								className="btn btn-danger"
							>
								Delete
							</button>
						</td>
					</tr>
				))}
				</tbody>
			</table>
		</>
	);
};

export default List;
