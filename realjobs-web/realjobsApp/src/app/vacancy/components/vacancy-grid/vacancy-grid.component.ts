import {Component, Input, OnInit} from '@angular/core';
import {Vacancy} from "../../models/vacancy.model";

@Component({
  selector: 'app-vacancy-grid',
  templateUrl: './vacancy-grid.component.html',
  styleUrls: ['./vacancy-grid.component.scss']
})
export class VacancyGridComponent implements OnInit {
  @Input() vacancies: Vacancy[]

  constructor() { }

  ngOnInit(): void {
  }

}
