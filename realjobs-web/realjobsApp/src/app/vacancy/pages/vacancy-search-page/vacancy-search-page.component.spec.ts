import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { VacancySearchPageComponent } from './vacancy-search-page.component';

describe('VacancySearchPageComponent', () => {
  let component: VacancySearchPageComponent;
  let fixture: ComponentFixture<VacancySearchPageComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ VacancySearchPageComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(VacancySearchPageComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
