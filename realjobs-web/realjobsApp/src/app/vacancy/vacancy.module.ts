import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { VacancyRoutingModule } from './vacancy-routing.module';
import { VacancyGridComponent } from './components/vacancy-grid/vacancy-grid.component';
import { FiltersComponent } from './components/filters/filters.component';
import { DetailComponent } from './components/detail/detail.component';
import { VacancySearchPageComponent } from './pages/vacancy-search-page/vacancy-search-page.component';
import {SharedModule} from "../shared/shared.module";
import {HttpClientModule} from "@angular/common/http";
import {CardModule} from "primeng/card";
import {ButtonModule} from "primeng/button";
import {DropdownModule} from "primeng/dropdown";
import {FormsModule} from "@angular/forms";
import {MultiSelectModule} from "primeng/multiselect";


@NgModule({
  declarations: [VacancyGridComponent, FiltersComponent, DetailComponent, VacancySearchPageComponent],
  imports: [
    CommonModule,
    VacancyRoutingModule,
    SharedModule,
    HttpClientModule,
    CardModule,
    ButtonModule,
    DropdownModule,
    FormsModule,
    MultiSelectModule
  ]
})
export class VacancyModule { }
