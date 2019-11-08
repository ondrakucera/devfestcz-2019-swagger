import * as React from 'react';
import {useEffect, useState} from 'react';
import {useHistory, useParams} from 'react-router-dom';
import studentsApi from './studentsApi';
import {StudentDto} from './StudentDto';

const Student = () => {
	const {id} = useParams();
	const studentId = Number(id);

	const history = useHistory();

	const [student, setStudent] = useState(undefined as unknown as StudentDto);

	useEffect(() => {
		studentsApi.getStudent(studentId).then((student) => setStudent(student));
	}, [studentId]);

	const handleChange = (event: React.ChangeEvent<HTMLInputElement>) => {
		const newStudent = { ...student } as StudentDto;
		const target = event.target;
		const value = target.value;
		switch (target.name) {
			case 'firstName':
				newStudent.firstName = value;
				break;
			case 'lastName':
				newStudent.lastName = value;
				break;
			case 'year':
				newStudent.year = Number(value);
				break;
		}
		setStudent(newStudent);
	};

	return student ? (
		<>
			<h1>{student.firstName} {student.lastName}</h1>
			<form>
				<table className="table table-bordered">
					<tbody>
					<tr>
						<th>First name</th>
						<td>
							<input
								name="firstName"
								type="text"
								value={student.firstName}
								onChange={handleChange}
							/>
						</td>
					</tr>
					<tr>
						<th>Last name</th>
						<td>
							<input
								name="lastName"
								type="text"
								value={student.lastName}
								onChange={handleChange}
							/>
						</td>
					</tr>
					<tr>
						<th>Year</th>
						<td>
							<input
								name="year"
								value={student.year}
								onChange={handleChange}
								type="number"
								min="1"
								max="7"
							/>
						</td>
					</tr>
					</tbody>
					<tfoot>
					<tr>
						<td>
							<button
								onClick={(e) => {
									e.preventDefault();
									studentsApi.putStudent(studentId, student).then(() => history.push('/students'));
								}}
								className="btn btn-primary"
							>
								Save
							</button>
						</td>
						<td>
							<button
								onClick={(e) => {
									e.preventDefault();
									history.push('/students');
								}}
								className="btn btn-link"
							>
								Cancel
							</button>
						</td>
					</tr>
					</tfoot>
				</table>
			</form>
		</>
	) : null;
};

export default Student;
