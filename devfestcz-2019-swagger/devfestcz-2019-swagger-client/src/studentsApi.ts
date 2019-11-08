import {StudentDto} from './StudentDto';

let students: StudentDto[] = [
	{id: 0, firstName: 'Harry', lastName: 'Potter', year: 1},
	{id: 1, firstName: 'Hermione', lastName: 'Granger', year: 1},
	{id: 2, firstName: 'Ronald', lastName: 'Weasley', year: 1}
];

const studentsApi = {
	getStudents: (): Promise<Array<StudentDto>> => (Promise.resolve(students)),
	getStudent: (id: number): Promise<StudentDto> => (Promise.resolve(students[id])),
	putStudent: (id: number, student: StudentDto): Promise<any> => {
		students[id] = student;
		return Promise.resolve(null);
	},
	deleteStudent: (id: number): Promise<any> => (Promise.resolve(null))
};

export default studentsApi;
