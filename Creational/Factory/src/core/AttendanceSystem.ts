import { AttendanceFactory } from './AttendanceFactory';
import { PersonData } from '../utils/constants';

export class AttendanceSystem {
  static checkInAll(peopleList: PersonData[]): void {
    peopleList.forEach(({ role, name }) => {
      try {
        const person = AttendanceFactory.getPerson(role, name);
        person.markAttendance();
      } catch (err) {
        const errorMessage = err instanceof Error ? err.message : 'Unknown error';
        console.error(`[Error] Could not check in ${name}: ${errorMessage}`);
      }
    });
  }
}
