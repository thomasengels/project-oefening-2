import {Component, OnInit} from '@angular/core';
import {Observable, ObservedValueOf} from "rxjs";
import {Vacancy} from "../../models/vacancy.model";
import {VacancyService} from "../../service/vacancy-service";
import {DatePosted, DatepostedDropdown} from "../../models/dateposted.dropdown";
import {map} from "rxjs/operators";
import {YearsOfExperience, YearsOfExperienceDropdown} from "../../models/yearsOfExperience.dropdown";

@Component({
  selector: 'app-vacancy-search-page',
  templateUrl: './vacancy-search-page.component.html',
  styleUrls: ['./vacancy-search-page.component.scss']
})
export class VacancySearchPageComponent implements OnInit {
  vacancies$: Observable<Vacancy[]>;
  vacancy: Vacancy;
  contractTypes: String[];
  selectedContractTypes: String[];
  datePostedOptions: DatePosted[] = new DatepostedDropdown().datePostedOptions;
  selectedDatePosted: DatePosted;
  industries: String[];
  selectedIndustries: String[];
  yearsOfExperienceOptions: YearsOfExperience[] = new YearsOfExperienceDropdown().yearsOfExperienceOptions;
  selectedYearsOfExperience: YearsOfExperience;


  constructor(private vacancyService: VacancyService) {
  }

  ngOnInit(): void {
    this.getVacancies();
    this.getContractTypes();
    this.getIndustries();
  }

  getVacancies(): void {
    this.vacancies$ = this.vacancyService.getVacancies();
  }

  getContractTypes(): void {
    this.vacancyService.getContractTypes()
      .subscribe(contractTypes => this.contractTypes = contractTypes);
  }

  getIndustries(): void {
    this.vacancyService.getIndustries()
      .pipe(
        map(res => res.map(item => item.industryName))
      )
      .subscribe(industries => this.industries = industries);
  }

  updateVancacyDetail(vacancy: Vacancy) {
    this.vacancy = vacancy;
  }

}
