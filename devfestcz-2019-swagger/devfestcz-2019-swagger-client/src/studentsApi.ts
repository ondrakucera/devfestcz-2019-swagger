import {Configuration, DefaultApi} from './restapi';

const studentsApi = new DefaultApi(new Configuration(), 'http://localhost:8080');

export default studentsApi;
