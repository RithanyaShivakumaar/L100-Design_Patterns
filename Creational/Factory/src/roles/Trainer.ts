import { Person } from './Person';
import { AttendanceLogger } from '../core/AttendanceLogger';

export class Trainer extends Person {
  constructor(name: string) {
    super(name);
    this.role = 'Trainer';
  }

  markAttendance(): void {
    console.log(`[Trainer] ${this.name} started teacher workshop at ${new Date().toLocaleTimeString()}`);
    this.startWorkshop();
    AttendanceLogger.log(this);
  }

  private startWorkshop(): void {
    console.log(`${this.name} welcomed trainees.`);
  }
}
