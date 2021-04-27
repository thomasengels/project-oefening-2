export class DatepostedDropdown {
  datePostedOptions: DatePosted[];
  constructor() {
    this.datePostedOptions = [
      {name: 'Past 24h', nrOfDays: 1},
      {name: 'Past week', nrOfDays: 7},
      {name: 'Past month', nrOfDays: 30},
      {name: 'Past year', nrOfDays: 365}
    ];
  }
  get options(): DatePosted[] {
    return this.datePostedOptions;
  }

}


export class DatePosted {
  name: string;
  nrOfDays: number;
}
