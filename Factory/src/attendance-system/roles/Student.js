import { Person } from './Person.js';
import { AttendanceLogger } from '../core/AttendanceLogger.js';

export class Student extends Person {
  constructor(name) {
    super(name);
    this.role = 'Student';
  }

  markAttendance() {
    console.log(`[Student] ${this.name} marked attendance at ${new Date().toLocaleTimeString()}`);
    this.ifProperUniform();
    AttendanceLogger.log(this);
  }

  ifProperUniform() {
    console.log(`${this.name} checked if they are in full uniform.`);
  }
}
