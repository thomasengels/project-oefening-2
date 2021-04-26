import {Component, OnInit} from '@angular/core';
import {Observable} from "rxjs";
import {Vacancy} from "../../models/vacancy.model";
import {VacancyService} from "../../service/vacancy-service.service";

@Component({
  selector: 'app-vacancy-search-page',
  templateUrl: './vacancy-search-page.component.html',
  styleUrls: ['./vacancy-search-page.component.scss']
})
export class VacancySearchPageComponent implements OnInit {
  vacancies$: Observable<Vacancy[]>;
  vacancy: Vacancy;

  constructor(private vacancyService: VacancyService) {
  }

  ngOnInit(): void {
    this.getVacancies()
  }

  getVacancies(): void {
    this.vacancies$ = this.vacancyService.getVacancies();
  }

  updateVancacyDetail(vacancy: Vacancy) {
    this.vacancy = vacancy;
  }

}
