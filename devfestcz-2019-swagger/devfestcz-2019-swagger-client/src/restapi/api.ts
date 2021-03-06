/// <reference path="./custom.d.ts" />
// tslint:disable
/**
 * Students
 * Example REST API for working with students created for DevFest.cz 2019
 *
 * OpenAPI spec version: 1.0.0
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


import * as url from "url";
import * as portableFetch from "portable-fetch";
import { Configuration } from "./configuration";

const BASE_PATH = "https://localhost".replace(/\/+$/, "");

/**
 *
 * @export
 */
export const COLLECTION_FORMATS = {
    csv: ",",
    ssv: " ",
    tsv: "\t",
    pipes: "|",
};

/**
 *
 * @export
 * @interface FetchAPI
 */
export interface FetchAPI {
    (url: string, init?: any): Promise<Response>;
}

/**
 *
 * @export
 * @interface FetchArgs
 */
export interface FetchArgs {
    url: string;
    options: any;
}

/**
 *
 * @export
 * @class BaseAPI
 */
export class BaseAPI {
    protected configuration: Configuration | undefined;

    constructor(configuration?: Configuration, protected basePath: string = BASE_PATH, protected fetch: FetchAPI = portableFetch) {
        if (configuration) {
            this.configuration = configuration;
            this.basePath = configuration.basePath || this.basePath;
        }
    }
};

/**
 *
 * @export
 * @class RequiredError
 * @extends {Error}
 */
export class RequiredError extends Error {
    name = "RequiredError"
    constructor(public field: string, msg?: string) {
        super(msg);
    }
}

/**
 * Student
 * @export
 * @interface StudentDto
 */
export interface StudentDto {
    /**
     * Id
     * @type {number}
     * @memberof StudentDto
     */
    id?: number;
    /**
     * First name of the student
     * @type {string}
     * @memberof StudentDto
     */
    firstName: string;
    /**
     * Last name of the student
     * @type {string}
     * @memberof StudentDto
     */
    lastName: string;
    /**
     * Year the student currently is in
     * @type {number}
     * @memberof StudentDto
     */
    year: number;
}


/**
 * DefaultApi - fetch parameter creator
 * @export
 */
export const DefaultApiFetchParamCreator = function (configuration?: Configuration) {
    return {
        /**
         * Deletes a `Student`.
         * @summary Deletes a student
         * @param {number} studentId Student id
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        deleteStudent(studentId: number, options: any = {}): FetchArgs {
            // verify required parameter 'studentId' is not null or undefined
            if (studentId === null || studentId === undefined) {
                throw new RequiredError('studentId','Required parameter studentId was null or undefined when calling deleteStudent.');
            }
            const localVarPath = `/students/{studentId}`
                .replace(`{${"studentId"}}`, encodeURIComponent(String(studentId)));
            const localVarUrlObj = url.parse(localVarPath, true);
            const localVarRequestOptions = Object.assign({ method: 'DELETE' }, options);
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            localVarUrlObj.query = Object.assign({}, localVarUrlObj.query, localVarQueryParameter, options.query);
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = Object.assign({}, localVarHeaderParameter, options.headers);

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Obtains a `Student` by its id.
         * @summary Obtains a student
         * @param {number} studentId Student id
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getStudent(studentId: number, options: any = {}): FetchArgs {
            // verify required parameter 'studentId' is not null or undefined
            if (studentId === null || studentId === undefined) {
                throw new RequiredError('studentId','Required parameter studentId was null or undefined when calling getStudent.');
            }
            const localVarPath = `/students/{studentId}`
                .replace(`{${"studentId"}}`, encodeURIComponent(String(studentId)));
            const localVarUrlObj = url.parse(localVarPath, true);
            const localVarRequestOptions = Object.assign({ method: 'GET' }, options);
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            localVarUrlObj.query = Object.assign({}, localVarUrlObj.query, localVarQueryParameter, options.query);
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = Object.assign({}, localVarHeaderParameter, options.headers);

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Obtains a list of `Students`. The list is sorted by `lastName`, then by `firstName`, and then by `year`.
         * @summary Obtains a list of students
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getStudents(options: any = {}): FetchArgs {
            const localVarPath = `/students`;
            const localVarUrlObj = url.parse(localVarPath, true);
            const localVarRequestOptions = Object.assign({ method: 'GET' }, options);
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            localVarUrlObj.query = Object.assign({}, localVarUrlObj.query, localVarQueryParameter, options.query);
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = Object.assign({}, localVarHeaderParameter, options.headers);

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Creates a `Student`.
         * @summary Creates a student
         * @param {StudentDto} student Student
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        postStudent(student: StudentDto, options: any = {}): FetchArgs {
            // verify required parameter 'student' is not null or undefined
            if (student === null || student === undefined) {
                throw new RequiredError('student','Required parameter student was null or undefined when calling postStudent.');
            }
            const localVarPath = `/students`;
            const localVarUrlObj = url.parse(localVarPath, true);
            const localVarRequestOptions = Object.assign({ method: 'POST' }, options);
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            localVarHeaderParameter['Content-Type'] = 'application/json';

            localVarUrlObj.query = Object.assign({}, localVarUrlObj.query, localVarQueryParameter, options.query);
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = Object.assign({}, localVarHeaderParameter, options.headers);
            const needsSerialization = (<any>"StudentDto" !== "string") || localVarRequestOptions.headers['Content-Type'] === 'application/json';
            localVarRequestOptions.body =  needsSerialization ? JSON.stringify(student || {}) : (student || "");

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * Saves a `Student`.
         * @summary Saves a student
         * @param {number} studentId Student id
         * @param {StudentDto} student Student
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        putStudent(studentId: number, student: StudentDto, options: any = {}): FetchArgs {
            // verify required parameter 'studentId' is not null or undefined
            if (studentId === null || studentId === undefined) {
                throw new RequiredError('studentId','Required parameter studentId was null or undefined when calling putStudent.');
            }
            // verify required parameter 'student' is not null or undefined
            if (student === null || student === undefined) {
                throw new RequiredError('student','Required parameter student was null or undefined when calling putStudent.');
            }
            const localVarPath = `/students/{studentId}`
                .replace(`{${"studentId"}}`, encodeURIComponent(String(studentId)));
            const localVarUrlObj = url.parse(localVarPath, true);
            const localVarRequestOptions = Object.assign({ method: 'PUT' }, options);
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            localVarHeaderParameter['Content-Type'] = 'application/json';

            localVarUrlObj.query = Object.assign({}, localVarUrlObj.query, localVarQueryParameter, options.query);
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = Object.assign({}, localVarHeaderParameter, options.headers);
            const needsSerialization = (<any>"StudentDto" !== "string") || localVarRequestOptions.headers['Content-Type'] === 'application/json';
            localVarRequestOptions.body =  needsSerialization ? JSON.stringify(student || {}) : (student || "");

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
    }
};

/**
 * DefaultApi - functional programming interface
 * @export
 */
export const DefaultApiFp = function(configuration?: Configuration) {
    return {
        /**
         * Deletes a `Student`.
         * @summary Deletes a student
         * @param {number} studentId Student id
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        deleteStudent(studentId: number, options?: any): (fetch?: FetchAPI, basePath?: string) => Promise<Response> {
            const localVarFetchArgs = DefaultApiFetchParamCreator(configuration).deleteStudent(studentId, options);
            return (fetch: FetchAPI = portableFetch, basePath: string = BASE_PATH) => {
                return fetch(basePath + localVarFetchArgs.url, localVarFetchArgs.options).then((response) => {
                    if (response.status >= 200 && response.status < 300) {
                        return response;
                    } else {
                        throw response;
                    }
                });
            };
        },
        /**
         * Obtains a `Student` by its id.
         * @summary Obtains a student
         * @param {number} studentId Student id
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getStudent(studentId: number, options?: any): (fetch?: FetchAPI, basePath?: string) => Promise<StudentDto> {
            const localVarFetchArgs = DefaultApiFetchParamCreator(configuration).getStudent(studentId, options);
            return (fetch: FetchAPI = portableFetch, basePath: string = BASE_PATH) => {
                return fetch(basePath + localVarFetchArgs.url, localVarFetchArgs.options).then((response) => {
                    if (response.status >= 200 && response.status < 300) {
                        return response.json();
                    } else {
                        throw response;
                    }
                });
            };
        },
        /**
         * Obtains a list of `Students`. The list is sorted by `lastName`, then by `firstName`, and then by `year`.
         * @summary Obtains a list of students
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getStudents(options?: any): (fetch?: FetchAPI, basePath?: string) => Promise<Array<StudentDto>> {
            const localVarFetchArgs = DefaultApiFetchParamCreator(configuration).getStudents(options);
            return (fetch: FetchAPI = portableFetch, basePath: string = BASE_PATH) => {
                return fetch(basePath + localVarFetchArgs.url, localVarFetchArgs.options).then((response) => {
                    if (response.status >= 200 && response.status < 300) {
                        return response.json();
                    } else {
                        throw response;
                    }
                });
            };
        },
        /**
         * Creates a `Student`.
         * @summary Creates a student
         * @param {StudentDto} student Student
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        postStudent(student: StudentDto, options?: any): (fetch?: FetchAPI, basePath?: string) => Promise<number> {
            const localVarFetchArgs = DefaultApiFetchParamCreator(configuration).postStudent(student, options);
            return (fetch: FetchAPI = portableFetch, basePath: string = BASE_PATH) => {
                return fetch(basePath + localVarFetchArgs.url, localVarFetchArgs.options).then((response) => {
                    if (response.status >= 200 && response.status < 300) {
                        return response.json();
                    } else {
                        throw response;
                    }
                });
            };
        },
        /**
         * Saves a `Student`.
         * @summary Saves a student
         * @param {number} studentId Student id
         * @param {StudentDto} student Student
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        putStudent(studentId: number, student: StudentDto, options?: any): (fetch?: FetchAPI, basePath?: string) => Promise<Response> {
            const localVarFetchArgs = DefaultApiFetchParamCreator(configuration).putStudent(studentId, student, options);
            return (fetch: FetchAPI = portableFetch, basePath: string = BASE_PATH) => {
                return fetch(basePath + localVarFetchArgs.url, localVarFetchArgs.options).then((response) => {
                    if (response.status >= 200 && response.status < 300) {
                        return response;
                    } else {
                        throw response;
                    }
                });
            };
        },
    }
};

/**
 * DefaultApi - factory interface
 * @export
 */
export const DefaultApiFactory = function (configuration?: Configuration, fetch?: FetchAPI, basePath?: string) {
    return {
        /**
         * Deletes a `Student`.
         * @summary Deletes a student
         * @param {number} studentId Student id
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        deleteStudent(studentId: number, options?: any) {
            return DefaultApiFp(configuration).deleteStudent(studentId, options)(fetch, basePath);
        },
        /**
         * Obtains a `Student` by its id.
         * @summary Obtains a student
         * @param {number} studentId Student id
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getStudent(studentId: number, options?: any) {
            return DefaultApiFp(configuration).getStudent(studentId, options)(fetch, basePath);
        },
        /**
         * Obtains a list of `Students`. The list is sorted by `lastName`, then by `firstName`, and then by `year`.
         * @summary Obtains a list of students
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getStudents(options?: any) {
            return DefaultApiFp(configuration).getStudents(options)(fetch, basePath);
        },
        /**
         * Creates a `Student`.
         * @summary Creates a student
         * @param {StudentDto} student Student
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        postStudent(student: StudentDto, options?: any) {
            return DefaultApiFp(configuration).postStudent(student, options)(fetch, basePath);
        },
        /**
         * Saves a `Student`.
         * @summary Saves a student
         * @param {number} studentId Student id
         * @param {StudentDto} student Student
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        putStudent(studentId: number, student: StudentDto, options?: any) {
            return DefaultApiFp(configuration).putStudent(studentId, student, options)(fetch, basePath);
        },
    };
};

/**
 * DefaultApi - object-oriented interface
 * @export
 * @class DefaultApi
 * @extends {BaseAPI}
 */
export class DefaultApi extends BaseAPI {
    /**
     * Deletes a `Student`.
     * @summary Deletes a student
     * @param {} studentId Student id
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof DefaultApi
     */
    public deleteStudent(studentId: number, options?: any) {
        return DefaultApiFp(this.configuration).deleteStudent(studentId, options)(this.fetch, this.basePath);
    }

    /**
     * Obtains a `Student` by its id.
     * @summary Obtains a student
     * @param {} studentId Student id
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof DefaultApi
     */
    public getStudent(studentId: number, options?: any) {
        return DefaultApiFp(this.configuration).getStudent(studentId, options)(this.fetch, this.basePath);
    }

    /**
     * Obtains a list of `Students`. The list is sorted by `lastName`, then by `firstName`, and then by `year`.
     * @summary Obtains a list of students
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof DefaultApi
     */
    public getStudents(options?: any) {
        return DefaultApiFp(this.configuration).getStudents(options)(this.fetch, this.basePath);
    }

    /**
     * Creates a `Student`.
     * @summary Creates a student
     * @param {} student Student
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof DefaultApi
     */
    public postStudent(student: StudentDto, options?: any) {
        return DefaultApiFp(this.configuration).postStudent(student, options)(this.fetch, this.basePath);
    }

    /**
     * Saves a `Student`.
     * @summary Saves a student
     * @param {} studentId Student id
     * @param {} student Student
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof DefaultApi
     */
    public putStudent(studentId: number, student: StudentDto, options?: any) {
        return DefaultApiFp(this.configuration).putStudent(studentId, student, options)(this.fetch, this.basePath);
    }

}

