import React from 'react';
import {BrowserRouter as Router, Redirect, Route, Switch} from 'react-router-dom';
import List from './List';
import Student from './Student';

export default function MyApp() {
	return (
		<Router>
			<Redirect to="/students" />
				<Switch>
					<Route exact path="/students">
						<List/>
					</Route>
					<Route exact path="/students/:id">
						<Student />
					</Route>
				</Switch>
		</Router>
	);
}
