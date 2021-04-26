import {NgModule} from '@angular/core';
import {Routes, RouterModule} from '@angular/router';
import {VacancySearchPageComponent} from "./pages/vacancy-search-page/vacancy-search-page.component";
import {DetailComponent} from "./components/detail/detail.component";


const routes: Routes = [
  {path: '', component: VacancySearchPageComponent},
  {path: 'detail', component: DetailComponent},
  {path: 'detail/:id', component: DetailComponent},
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class VacancyRoutingModule {
}
