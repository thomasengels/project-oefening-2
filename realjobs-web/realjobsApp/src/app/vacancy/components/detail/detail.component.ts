import {Component, Input, OnInit} from '@angular/core';
import {Vacancy} from "../../models/vacancy.model";

@Component({
  selector: 'app-detail',
  templateUrl: './detail.component.html',
  styleUrls: ['./detail.component.scss']
})
export class DetailComponent implements OnInit {
  @Input() vacancy: Vacancy;

  constructor() { }

  ngOnInit(): void {
  }

}
