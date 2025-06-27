import { Person } from './Person.js';
import { AttendanceLogger } from '../core/AttendanceLogger.js';

export class ReceptionStaff extends Person {
  constructor(name) {
    super(name);
    this.role = 'Reception Staff';
  }

  markAttendance() {
    console.log(`[Reception] ${this.name} started shift at front desk at ${new Date().toLocaleTimeString()}`);
    this.greetVisitors();
    AttendanceLogger.log(this);
  }

  greetVisitors() {
    console.log(`${this.name} greeted morning visitors.`);
  }
}
