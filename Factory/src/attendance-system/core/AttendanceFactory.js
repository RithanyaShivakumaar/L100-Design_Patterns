import { ROLES } from '../utils/constants.js';
import { Student } from '../roles/Student.js';
import { Teacher } from '../roles/Teacher.js';
import { ReceptionStaff } from '../roles/ReceptionStaff.js';
import { HelperStaff } from '../roles/HelperStaff.js';
import { Trainer } from '../roles/Trainer.js';

export class AttendanceFactory {
  static getPerson(role, name) {
    switch (role.toLowerCase()) {
      case ROLES.STUDENT:
        return new Student(name);
      case ROLES.TEACHER:
        return new Teacher(name);
      case ROLES.RECEPTION:
        return new ReceptionStaff(name);
      case ROLES.HELPER:
        return new HelperStaff(name);
      case ROLES.TRAINER:
        return new Trainer(name);
      default:
        throw new Error(`Unknown role: ${role}`);
    }
  }
}
