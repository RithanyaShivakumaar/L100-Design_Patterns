import { AttendanceFactory } from './AttendanceFactory.js';

export class AttendanceSystem {
  static checkInAll(peopleList) {
    peopleList.forEach(({ role, name }) => {
      try {
        const person = AttendanceFactory.getPerson(role, name);
        person.markAttendance();
      } catch (err) {
        console.error(`[Error] Could not check in ${name}: ${err.message}`);
      }
    });
  }
}
