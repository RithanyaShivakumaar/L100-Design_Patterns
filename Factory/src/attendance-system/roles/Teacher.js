import { Person } from './Person.js';
import { AttendanceLogger } from '../core/AttendanceLogger.js';

export class Teacher extends Person {
  constructor(name) {
    super(name);
    this.role = 'Teacher';
  }

  markAttendance() {
    console.log(`[Teacher] ${this.name} signed in to class dashboard at ${new Date().toLocaleTimeString()}`);
    this.openClassroom();
    AttendanceLogger.log(this);
  }

  openClassroom() {
    console.log(`${this.name} opened today's lesson plan.`);
  }
}
