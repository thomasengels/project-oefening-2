export class YearsOfExperienceDropdown {
  yearsOfExperienceOptions: YearsOfExperience[];

  constructor() {
    this.yearsOfExperienceOptions = [
      {name: '0 years', minYear: 0, maxYear: 0},
      {name: 'greater than 1 year', minYear: 1, maxYear: 0},
      {name: 'between 1 and 2 years', minYear: 1, maxYear: 2},
      {name: 'between 5 and 10 years', minYear: 5, maxYear: 10},
    ];
  }

  get options(): YearsOfExperience[] {
    return this.yearsOfExperienceOptions;
  }
}


export class YearsOfExperience {
  name: string;
  minYear: number;
  maxYear: number;
}
