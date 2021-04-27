import {Injectable} from '@angular/core';
import {Observable} from "rxjs";
import {environment} from "../../../environments/environment";
import {Vacancy} from "../models/vacancy.model";
import {HttpClient} from "@angular/common/http";
import {Industry} from "../models/industry.model";

@Injectable({
  providedIn: 'root'
})
export class VacancyService {

  constructor(private http: HttpClient) {
  }

  getVacancies(): Observable<Vacancy[]> {
    return this.http.get<Vacancy[]>(`${environment.apiUrl}/vacancy`);
  }

  getContractTypes(): Observable<String[]> {
    return this.http.get<String[]>(`${environment.apiUrl}/vacancy/contract-types`);
  }

  getIndustries(): Observable<Industry[]> {
    return this.http.get<Industry[]>(`${environment.apiUrl}/vacancy/industries`);
  }
}
