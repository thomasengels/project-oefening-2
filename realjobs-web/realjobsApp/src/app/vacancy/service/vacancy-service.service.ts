import {Injectable} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Vacancy} from "../models/Vacancy";
import {Observable} from "rxjs";
import {environment} from "../../../environments/environment";

@Injectable({
  providedIn: 'root'
})
export class VacancyService {

  constructor(private http: HttpClient) {
  }

  getVacancies(): Observable<Vacancy[]> {
    return this.http.get<Vacancy[]>(`${environment.apiUrl}/vacancy/`);
  }
}
