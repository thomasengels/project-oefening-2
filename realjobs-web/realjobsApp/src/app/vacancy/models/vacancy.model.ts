import {Address} from "./address.model";
import {Industry} from "./industry.model";


export interface Vacancy {
  id: number;
  functionTitle: string;
  contractType: string;
  functionDescription: string;
  postingDate: Date;
  companyName: string;
  industry: Industry;
  requiredYearsOfExperience: number;
  requiredExperienceSkillsEducation: string;
  offer: string;
  address: Address;
}
