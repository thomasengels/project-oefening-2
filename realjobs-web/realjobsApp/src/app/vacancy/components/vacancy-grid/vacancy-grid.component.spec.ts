import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { VacancyGridComponent } from './vacancy-grid.component';

describe('VacancyGridComponent', () => {
  let component: VacancyGridComponent;
  let fixture: ComponentFixture<VacancyGridComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ VacancyGridComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(VacancyGridComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
