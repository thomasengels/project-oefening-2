import { Component, OnInit } from '@angular/core';
import {Observable} from "rxjs";
import {Vacancy} from "../../models/vacancy.model";

@Component({
  selector: 'app-vacancy-search-page',
  templateUrl: './vacancy-search-page.component.html',
  styleUrls: ['./vacancy-search-page.component.scss']
})
export class VacancySearchPageComponent implements OnInit {
  vacancies$: Observable<Vacancy[]>

  constructor() { }

  ngOnInit(): void {
  }

}
