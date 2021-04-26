import {Component, EventEmitter, Input, OnInit, Output} from '@angular/core';
import {Vacancy} from "../../models/vacancy.model";
import {Router} from "@angular/router";

@Component({
  selector: 'app-vacancy-grid',
  templateUrl: './vacancy-grid.component.html',
  styleUrls: ['./vacancy-grid.component.scss']
})
export class VacancyGridComponent implements OnInit {
  @Input() vacancies: Vacancy[];
  @Output() newVacancyEvent = new EventEmitter<Vacancy>();

  constructor() {
  }

  ngOnInit(): void {
  }

  openDetails(vacancy: Vacancy) {
    this.newVacancyEvent.emit(vacancy);
  }

  trackByVacancyId(index: number, vacancy: Vacancy) {
    return vacancy.id;
  }
}
