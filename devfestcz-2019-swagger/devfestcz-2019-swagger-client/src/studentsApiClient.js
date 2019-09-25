import {ApiClient, DefaultApi} from "./restapi";

const apiClient = new ApiClient();
apiClient.basePath = 'http://localhost:8080';
const studentsApiClient = new DefaultApi(apiClient);

export default studentsApiClient;
