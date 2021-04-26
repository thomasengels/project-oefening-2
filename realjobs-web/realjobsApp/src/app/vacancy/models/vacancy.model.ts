import {Address} from "./Address";

export interface Vacancy {
  id: number;
  functionTitle: string;
  contractType: string;
  functionDescription: string;
  postingDate: Date;
  companyName: string;
  industry: String;
  requiredYearsOfExperience: number;
  requiredExperienceSkillsEducation: string;
  offer: string;
  address: Address;
}
