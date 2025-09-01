import { Person } from './Person';
import { AttendanceLogger } from '../core/AttendanceLogger';

export class ReceptionStaff extends Person {
  constructor(name: string) {
    super(name);
    this.role = 'Reception Staff';
  }

  markAttendance(): void {
    console.log(`[Reception] ${this.name} started shift at front desk at ${new Date().toLocaleTimeString()}`);
    this.greetVisitors();
    AttendanceLogger.log(this);
  }

  private greetVisitors(): void {
    console.log(`${this.name} greeted morning visitors.`);
  }
}
