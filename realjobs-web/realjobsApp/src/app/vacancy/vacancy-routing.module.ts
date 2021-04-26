import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {VacancySearchPageComponent} from "./pages/vacancy-search-page/vacancy-search-page.component";


const routes: Routes = [
  {
    path:'',
    component:VacancySearchPageComponent
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class VacancyRoutingModule { }
