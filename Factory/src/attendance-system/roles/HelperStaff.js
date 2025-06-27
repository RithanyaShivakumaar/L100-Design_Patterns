import { Person } from './Person.js';
import { AttendanceLogger } from '../core/AttendanceLogger.js';

export class HelperStaff extends Person {
  constructor(name) {
    super(name);
    this.role = 'Helper Staff';
  }

  markAttendance() {
    console.log(`[Helper Staff] ${this.name} checked in via staff kiosk at ${new Date().toLocaleTimeString()}`);
    this.collectSupplies();
    AttendanceLogger.log(this);
  }

  collectSupplies() {
    console.log(`${this.name} collected cleaning supplies.`);
  }
}
