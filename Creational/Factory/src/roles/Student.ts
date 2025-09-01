import { Person } from './Person';
import { AttendanceLogger } from '../core/AttendanceLogger';

export class Student extends Person {
  constructor(name: string) {
    super(name);
    this.role = 'Student';
  }

  markAttendance(): void {
    console.log(`[Student] ${this.name} marked attendance at ${new Date().toLocaleTimeString()}`);
    this.ifProperUniform();
    AttendanceLogger.log(this);
  }

  private ifProperUniform(): void {
    console.log(`${this.name} checked if they are in full uniform.`);
  }
}
