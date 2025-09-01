import { Person } from './Person';
import { AttendanceLogger } from '../core/AttendanceLogger';

export class Teacher extends Person {
  constructor(name: string) {
    super(name);
    this.role = 'Teacher';
  }

  markAttendance(): void {
    console.log(`[Teacher] ${this.name} signed in to class dashboard at ${new Date().toLocaleTimeString()}`);
    this.openClassroom();
    AttendanceLogger.log(this);
  }

  private openClassroom(): void {
    console.log(`${this.name} opened today's lesson plan.`);
  }
}
