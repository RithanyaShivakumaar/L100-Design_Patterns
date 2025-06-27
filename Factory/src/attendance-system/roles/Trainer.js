import { Person } from './Person.js';
import { AttendanceLogger } from '../core/AttendanceLogger.js';

export class Trainer extends Person {
  constructor(name) {
    super(name);
    this.role = 'Trainer';
  }

  markAttendance() {
    console.log(`[Trainer] ${this.name} started teacher workshop at ${new Date().toLocaleTimeString()}`);
    this.startWorkshop();
    AttendanceLogger.log(this);
  }

  startWorkshop() {
    console.log(`${this.name} welcomed trainees.`);
  }
}
