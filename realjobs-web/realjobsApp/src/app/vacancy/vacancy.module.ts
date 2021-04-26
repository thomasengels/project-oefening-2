import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { VacancyRoutingModule } from './vacancy-routing.module';
import { VacancyGridComponent } from './components/vacancy-grid/vacancy-grid.component';
import { FiltersComponent } from './components/filters/filters.component';
import { DetailComponent } from './components/detail/detail.component';
import { VacancySearchPageComponent } from './pages/vacancy-search-page/vacancy-search-page.component';
import {SharedModule} from "../shared/shared.module";


@NgModule({
  declarations: [VacancyGridComponent, FiltersComponent, DetailComponent, VacancySearchPageComponent],
  imports: [
    CommonModule,
    VacancyRoutingModule,
    SharedModule
  ]
})
export class VacancyModule { }
