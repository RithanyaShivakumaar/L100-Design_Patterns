import { Person } from './Person';
import { AttendanceLogger } from '../core/AttendanceLogger';

export class HelperStaff extends Person {
  constructor(name: string) {
    super(name);
    this.role = 'Helper Staff';
  }

  markAttendance(): void {
    console.log(`[Helper Staff] ${this.name} checked in via staff kiosk at ${new Date().toLocaleTimeString()}`);
    this.collectSupplies();
    AttendanceLogger.log(this);
  }

  private collectSupplies(): void {
    console.log(`${this.name} collected cleaning supplies.`);
  }
}
